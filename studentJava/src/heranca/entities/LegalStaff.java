package heranca.entities;

public class LegalStaff extends TaxPayer {
    public Double getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Double numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    private Double numFuncionarios;


    public LegalStaff(String name, double annualIncome, double numFuncionarios) {
        super(name, annualIncome);
        this.numFuncionarios = numFuncionarios;
        super.TotalArrecado()
    }

    @Override
    public String TotalArrecado() {
        return super.TotalArrecado();
    }
}
