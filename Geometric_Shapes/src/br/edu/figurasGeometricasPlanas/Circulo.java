package br.edu.figurasGeometricasPlanas;

public class Circulo {
	// Atributos
	private double raio;
	private final double pi;
	private double area;
	
	// Construtor
	public Circulo() {
		raio = 0;
		pi = 3.14;
		area = 0;
	}
	
	// Métodos
	public void recebeArea(double pRaio) {
		raio = pRaio;
	}
	
	public void calcArea() {
		area = pi * (raio * raio);
	}
	
	public double retornaArea() {
		return area;
	}
	
}
