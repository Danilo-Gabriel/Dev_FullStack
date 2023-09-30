package heranca.entities;

public class PhysicalPersonnel extends TaxPayer {
    private Double gastosSaude;


    public PhysicalPersonnel(String name, double annualIncome, double gastosSaude) {
        super(name, annualIncome);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
}
