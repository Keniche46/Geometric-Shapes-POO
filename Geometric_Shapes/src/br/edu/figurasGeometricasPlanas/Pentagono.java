package br.edu.figurasGeometricasPlanas;

public class Pentagono {
	// Atributos
	private double lado;
	private double area;
	private double apotema;
	
	// Construtor
	public Pentagono() {
		lado = 0;
		area = 0;
		apotema = 0;
	}
	
	// Métodos
	public void recebeLado(double pLado) {
		lado = pLado;
	}
	
	private double calcApotema() {
		return lado / (2 * Math.tan(Math.PI / 5));
	}
	
	public void calcArea() {
		apotema = calcApotema(lado);
		area = (5 * lado * apotema) / 2;
	}
	
	public double retornaArea() {
		return area;
	}
	
	public void listarAtributos() {
		System.out.println("Lado: " + lado);
		System.out.println("Apótema: " + apotema);
		System.out.println("Área: " + area);
	}
	
}
