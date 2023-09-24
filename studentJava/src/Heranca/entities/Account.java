package Heranca.entities;

public class Account {

    private Integer number;
    private String holde;
    protected Double balance;


    public Account(){

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holde = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolde() {
        return holde;
    }

    public void setHolde(String holde) {
        this.holde = holde;
    }

    public Double getBalance() {
        return balance;
    }


    public void withdraw(Double mount){
        this.balance -= mount;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }


}
