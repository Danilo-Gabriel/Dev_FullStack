package exPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Departamento {

    private String nome;
    private double salario;
    private LocalDate data_admissao;

    public Funcionario(String nome, double salario, String nomeDepartamento){
        super(nomeDepartamento);
        this.nome = nome;
        this.salario = salario;
        this.data_admissao = LocalDate.now();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getData_admissao(){

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = data_admissao.format(fmt);

        return dataFormatada;
    }

    public void setData_admissao(LocalDate data_admissao){
        this.data_admissao = data_admissao;
    }



    public String toString(){
        return "Nome: " + nome
                + " Salario: "
                + String.format("%.2f", salario)
                + data_admissao;
    }

}
