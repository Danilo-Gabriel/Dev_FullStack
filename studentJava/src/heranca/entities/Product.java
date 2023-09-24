package Heranca.Entities;

public class Product {

    private String name;

    public Product(String name, Double values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValues() {
        return values;
    }

    public void setValues(Double values) {
        this.values = values;
    }

    private Double values;

    public String priceTag(){
        return "PRICE TAGS" + "/n" +
                "Nome: " + name + "/n"+
            "VAlOR: " + String.format("%.2f", values);

    }

}
