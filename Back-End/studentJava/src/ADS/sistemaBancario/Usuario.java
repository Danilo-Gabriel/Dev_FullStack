package ADS.sistemaBancario;

public class Usuario {

    private String nome;
    private String sobrenome; 
    private String cpf;
    private double saldo;

    public Usuario (String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = getNome();
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public double getSaldo() {
        return saldo;
    }
    public String deposito(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        return "Deposito realizado";
    }
    public String saque(double valorSaque){
        if(valorSaque < saldo){
        this.saldo = this.saldo - valorSaque;
        }
        return "saldo insuficiente";
    }
}
