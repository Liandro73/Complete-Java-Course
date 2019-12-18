package br.com.liandro.introducao_poo;

public class Student {

	protected String name;
	protected Double exam1;
	protected Double exam2;
	protected Double exam3;
	protected Double missing;

	protected Double finalGrade() {
		return exam1 + exam2 + exam3;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
}
