package br.edu.figurasGeometricasPlanas;

public class Quadrado {
	
	// Atributo
	private double lado;
	private double area;
	
	// Construtor
	public Quadrado() {
		lado = 0;
		area = 0;
	}
	
	// Métodos
	public void recebeLado(double pLado) {
		lado = pLado;
	}
	
	public void calcArea() {
		area = (lado * lado);
	}
	
	public double retornaArea() {
		return area;
	}
}
