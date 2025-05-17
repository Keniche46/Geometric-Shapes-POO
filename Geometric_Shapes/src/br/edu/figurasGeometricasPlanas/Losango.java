package br.edu.figurasGeometricasPlanas;

public class Losango {
	// Atributos
	private double diagonalMenor;
	private double diagonalMaior;
	private double area;
	
	// Construtor
	public Losango() {
		diagonalMenor = 0;
		diagonalMaior = 0;
		area = 0;
	}
	
	// Métodos
	public void recebeDmenor(double dMenor) {
		diagonalMenor = dMenor;
	}
	
	public void recebeDmaior(double dMaior) {
		diagonalMaior = dMaior;
	}
	
	public void calcArea() {
		area = (diagonalMaior * diagonalMenor) / 2;
	}
	
	public void listaratributos() {
		System.out.println("Valor da Diagonal Maior: " + diagonalMaior);
		System.out.println("Valor da Diagonal Menor: " + diagonalMenor);
	}
	
	public double retornaArea() {
		return area;
	}
}
