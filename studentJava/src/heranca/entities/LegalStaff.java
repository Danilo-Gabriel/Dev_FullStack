package heranca.entities;

public class LegalStaff extends TaxPayer {
    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    private int numFuncionarios;


    public LegalStaff(String name, double annualIncome, int numFuncionarios) {
        super(name, annualIncome);
        this.numFuncionarios = numFuncionarios;

    }


    @Override
    public double impostoApagar() {
        double imposto = 0;
        if(numFuncionarios > 10){
            imposto = getAnnualIncome() * 0.14;
        }
        else {
            imposto = getAnnualIncome() * 0.16;
        }
        return imposto;
    }
}
