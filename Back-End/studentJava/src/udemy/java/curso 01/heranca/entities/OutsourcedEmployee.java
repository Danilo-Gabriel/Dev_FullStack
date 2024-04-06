package heranca.entities;

import heranca.entities.Employee;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(String nome, Double hours, Double valuerPerHours, Double additionalCharge){
        super(nome, hours, valuerPerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Double payment() {

      return this.hours * this.valuePerHour + (this.additionalCharge / 100.0) * 110.0;
    }
}
