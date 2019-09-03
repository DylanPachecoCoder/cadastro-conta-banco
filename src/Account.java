

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

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.balance >= valor) {
            this.balance -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Account destino) {
        if(this.saca(valor)) {
        		destino.deposita(valor);
        		return true;
        } else {
        		return false;
        }
    }

    public double getSaldo(){
        return this.balance;
    }

    public int getNumero(){
        return this.number;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.number = numero;
    }

    public int getAgencia(){
        return this.agency;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agency = agencia;
    }

    public void setTitular(Client titular){
        this.holder = titular;
    }

    public Client getTitular(){
        return this.holder;
    }

    public static int getTotal(){
        return Account.total;
    }

}