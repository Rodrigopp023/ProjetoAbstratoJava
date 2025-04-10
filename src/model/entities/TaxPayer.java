package model.entities;

public abstract class TaxPayer {

    private String name;
    private Double annualIncome;

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome() {
        this.annualIncome = annualIncome;
    }

    public abstract Double tax();
}
