package exListas.Exercicio01;

import java.text.Normalizer;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
       return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }
    public void increaseSalary(double percentage){
        this.salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "Employee"
        + "ID: " + id
                + " Nome: "+ name
                +" ,salary: "
                + String.format("%.2f", salary);
    }
}
