package br.com.liandro.herenca_polimorfismo;

public class Company extends TaxPayer {
	
	private Integer numbEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numbEmployees) {
		super(name, anualIncome);
		this.numbEmployees = numbEmployees;
	}
	
	public Integer getNumbEmployees() {
		return numbEmployees;
	}

	public void setNumbEmployees(Integer numbEmployees) {
		this.numbEmployees = numbEmployees;
	}

	@Override
	public double tax() {
		if (numbEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
	
}
