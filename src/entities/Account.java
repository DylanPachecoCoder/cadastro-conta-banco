package entities;

public abstract class Account {

    protected double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int agencia, int numero){
        Account.total++;
        //System.out.println("O total de contas são " + Conta.total);
        this.agency = agencia;
        this.number = numero;
        this.balance = 0;
        //System.out.println("Estou criando uma conta " + this.numero);
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
        this.holder = holder;
    }

    public Client getHolder(){
        return this.holder;
    }

    public static int getTotal(){
        return Account.total;
    }

}