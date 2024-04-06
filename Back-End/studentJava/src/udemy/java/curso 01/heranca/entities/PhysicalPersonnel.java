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
    @Override
    public double impostoApagar() {
        double imposto = 0;
        if (getAnnualIncome() < 20000.00) {

            imposto = getAnnualIncome() * 0.15;

            if(gastosSaude != 0){

                imposto = imposto - (gastosSaude * 0.50);
            }

        }
        if (getAnnualIncome() > 20000.00) {
            imposto = getAnnualIncome() * 0.25;
            if(gastosSaude != 0){

                imposto = imposto - (gastosSaude * 0.50);
            }
        }
        return imposto;
    }

}
