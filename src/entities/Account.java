package entities;

import exception.InsufficientFundsException;

public abstract class Account  {

    protected double balance;
    private int agency;
    private int number;
    private Client client;
    private static int total = 0;

    public Account(Client client){
        Account.total++;
        this.agency = 2222;
        this.number = Account.total;
        this.balance = 0;
        this.client = client;
        System.out.println("successfully created account");
    }

    public abstract void deposit(double value);

    public void toWithdraw(double value) throws InsufficientFundsException{
        if(this.balance < value) {
            throw new InsufficientFundsException("Insufficient Funds ! \nBalance: " + this.balance + "cash withdrawal: " + value);
        } 
        this.balance -= value;
    }

    public void transfer(double value, Account destiny) throws InsufficientFundsException{
    	this.toWithdraw(value);
        destiny.deposit(value);
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int holder){
        if(holder <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.number = holder;
    }

    public int getAgency(){
        return this.agency;
    }

    public void setAgency(int agency){
       if(agency <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agency = agency;
    }

    public void setHolder(Client holder){
        this.client = holder;
    }

    public Client getHolder(){
        return this.client;
    }

    public static int getTotal(){
        return Account.total;
    }
    
    public String toString() {
    	return "Account Number: " + this.number + "\nClient name: " + client.getName() 
    			+ "\nClient Birthday: " + client.getBirthday()
    			+"\nAccount Type: " + client.getAccountType();
    }

}