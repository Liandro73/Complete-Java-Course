package br.com.liandro.introducao_poo;

public class Rectangle {
	
	protected Double width;
	protected Double height;
	
	protected Double calcArea() {
		return width * height;
	}
	
	protected Double calcPerimeter() {
		return (width + height) * 2.0;
	}
	
	protected Double calcDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
