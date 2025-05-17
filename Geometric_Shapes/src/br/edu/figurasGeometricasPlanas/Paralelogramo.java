package br.edu.figurasGeometricasPlanas;

public class Paralelogramo {
	// Atributos
	private double base;
	private double altura;
	private double area;
	
	// Construtor
	public Paralelogramo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	// Métodos
	public void recebeAltura(double pAltura) {
		altura = pAltura;
	}
	
	public void recebeBase(double pBase) {
		base = pBase;
	}
	
	public void calcArea() {
		area = (base * altura);
	}
	
	public void listarAtributos() {
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
	}
	
	public double retornaArea() {
		return area;
	}
}
