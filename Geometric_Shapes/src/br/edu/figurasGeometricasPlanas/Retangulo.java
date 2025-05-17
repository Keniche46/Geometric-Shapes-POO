package br.edu.figurasGeometricasPlanas;

public class Retangulo {
	// Atributos
	private double base;
	private double altura;
	private double area;
	
	// Construtor
	public Retangulo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	// Métodos
	public void recebeBase(double pBase) {
		base = pBase;
	}
	
	public void recebeAltura(double pAltura) {
		altura = pAltura;
	}
	
	public void calcArea() {
		area = (altura * base);
	}
	
	public double retornaArea() {
		return area;
	}
 	
}
