package br.edu.figurasGeometricasPlanas;

public class Triangulo {
	// Atributos
	private double base;
	private double altura;
	private double area;
	
	// Construtor
	public Triangulo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	// Métodos 
	public void receberAltura(double pAltura) {
		altura = pAltura;
	}
	
	public void receberBase(double pBase) {
		base = pBase;
	}
	
	public void calcArea() {
		area = (altura*base) / 2;
	}
	
	public double retornaArea() {
		return area;
	}
	
}
