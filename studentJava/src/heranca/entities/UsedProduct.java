package Heranca.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double values, LocalDate manufactureDate) {
        super(name, values);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+")";
    }
}
