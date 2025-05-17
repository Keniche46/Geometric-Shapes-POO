package br.edu.figurasGeometricasPlanas;

public class Hexagono {
	// Atributos
	private double lado;
	private double area;
	
	// Construtor
	public Hexagono() {
		lado = 0;
		area = 0;
	}
	
	// Métodos
	public void recebeLado(double pLado) {
		lado = pLado;
	}
	
	public void calcArea() {
		area = (3 * Math.pow(lado, 2) * Math.sqrt(3)) / 2;
	}
	
	
	public double retornaArea() {
		return area;
	}
	
	public void listarAtributos() {
		System.out.println("Lados: " + lado);
		System.out.println("Área: " + area);
	}
}
