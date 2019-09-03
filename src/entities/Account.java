package entities;

public abstract class Account {

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

    public boolean toWithdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destiny) {
        if(this.toWithdraw(value)) {
        		destiny.deposit(value);
        		return true;
        } else {
        		return false;
        }
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