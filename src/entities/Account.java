package entities;

import exception.InsufficientFundsException;

public abstract class Account  {

    protected double balance;
    private int agency;
    private int number;
    private Client client;
    private String password;
    private static int total = 0;

    public Account(Client client, String password){
        Account.total++;
        this.agency = 2222;
        this.number = Account.total;
        this.balance = 0;
        this.client = client;
        this.password = password;
        
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

    public String getPassword() {
		return this.password;
	}

	public void setPassword(String senha) {
		this.password = senha;
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
    
    @Override
    public boolean equals(Object object) {
    	Account account = (Account) object;

    	if(this.client.getName().trim() != account.client.getName().trim()) {
        	System.out.println(this.client.getName().trim() + " vs " + account.client.getName().trim());
      
    		return false;
    	}
    	
    	if(this.getPassword() != account.getPassword()) {
    	  	System.out.println(this.getPassword() + " vs "+ account.getPassword());
    		return false;
    	}
    	return true;
    }
    
    public String toString() {
    	return "Account Number: " + this.number + "\nClient name: " + client.getName() 
    			+ "\nClient Birthday: " + client.getBirthday()
    			+"\nAccount Type: " + client.getAccountType();
    }

}