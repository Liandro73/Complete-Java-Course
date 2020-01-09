package br.com.liandro.herenca_polimorfismo;

public class Individual extends TaxPayer {
	
	private Double expHealth;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double expHealth) {
		super(name, anualIncome);
		this.expHealth = expHealth;
	}

	public Double getExpHealth() {
		return expHealth;
	}

	public void setExpHealth(Double expHealth) {
		this.expHealth = expHealth;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000.0) {
			return (getAnualIncome() * 0.15) - (expHealth * 0.50);
		}
		else {
			return (getAnualIncome() * 0.25) - (expHealth * 0.50);
		}
	}
	
}
