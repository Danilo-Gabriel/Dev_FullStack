package Heranca.Entities;

public class ImportedProduct extends Product{
    private double customFee;

    public ImportedProduct(String name, Double values, double customFee) {
        super(name, values);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "Customs fee: " + customFee;
    }
    public Double totaPrice(){
        return getValues() + customFee;
    }
}
