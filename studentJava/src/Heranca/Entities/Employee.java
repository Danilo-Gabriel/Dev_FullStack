package Heranca.Entities;

public class Employee {
    private String name;
    protected Double hours;

    protected Double valuePerHour;

    public Employee(String name, Double hours, Double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return valuePerHour * hours;
    }

   public String toString(){
        return "Nome: "+ name +
                " Pagamento: " + String.format("%.2f", payment());
   }
}
