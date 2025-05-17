package br.edu.figurasGeometricasPlanas;

public class Trapezio {
	// Atributos
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	// Construtor
	public Trapezio() {
		baseMaior = 0;
		baseMenor = 0;
		altura = 0;
		area = 0;
	}
	
	// Métodos
	public void recebeBMaior(double bMaior) {
		baseMaior = bMaior;
	}
	
	public void recebeBMenor(double bMenor) {
		baseMenor = bMenor;
	}
	
	public void recebeAltura(double pAltura) {
		altura = pAltura;
	}
	
	public void calcArea() {
		area = ((baseMaior + baseMenor) * altura) / 2;
	}
	
	public void listarAtributos() {
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + area);
		
	}
	
	public double retornaArea() {
		return area;
	}
}
