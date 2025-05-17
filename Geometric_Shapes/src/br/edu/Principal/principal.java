package br.edu.Principal;
import br.edu.figurasGeometricasPlanas.*;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

        System.out.println("Escolha a figura geométrica:");
        System.out.println("1 - Triângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Círculo");
        System.out.println("5 - Losango");
        System.out.println("6 - Trapézio");
        System.out.println("7 - Paralelogramo");
        System.out.println("8 - Hexágono");
        System.out.println("9 - Pentágono");
        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                Triangulo tri = new Triangulo();
                System.out.print("Informe a base: ");
                double baseTri = sc.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaTri = sc.nextDouble();
                tri.receberBase(baseTri);
                tri.receberAltura(alturaTri);
                tri.calcArea();
                System.out.println("Área do triângulo: " + tri.retornaArea());
                break;

            case 2:
                Quadrado q = new Quadrado();
                System.out.print("Informe o lado: ");
                double ladoQ = sc.nextDouble();
                q.recebeLado(ladoQ);
                q.calcArea();
                System.out.println("Área do quadrado: " + q.retornaArea());
                break;

            case 3:
                Retangulo r = new Retangulo();
                System.out.print("Informe a base: ");
                double baseR = sc.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaR = sc.nextDouble();
                r.recebeBase(baseR);
                r.recebeAltura(alturaR);
                r.calcArea();
                System.out.println("Área do retângulo: " + r.retornaArea());
                break;

            case 4:
                Circulo c = new Circulo();
                System.out.print("Informe o raio: ");
                double raio = sc.nextDouble();
                c.recebeArea(raio);
                c.calcArea();
                System.out.println("Área do círculo: " + c.retornaArea());
                break;

            case 5:
                Losango l = new Losango();
                System.out.print("Informe a diagonal maior: ");
                double dMaior = sc.nextDouble();
                System.out.print("Informe a diagonal menor: ");
                double dMenor = sc.nextDouble();
                l.recebeDmaior(dMaior);
                l.recebeDmenor(dMenor);
                l.calcArea();
                l.listaratributos();
                System.out.println("Área do losango: " + l.retornaArea());
                break;

            case 6:
                Trapezio t = new Trapezio();
                System.out.print("Informe a base maior: ");
                double baseMaior = sc.nextDouble();
                System.out.print("Informe a base menor: ");
                double baseMenor = sc.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaT = sc.nextDouble();
                t.recebeBMaior(baseMaior);
                t.recebeBMenor(baseMenor);
                t.recebeAltura(alturaT);
                t.calcArea();
                t.listarAtributos();
                break;

            case 7:
                Paralelogramo p = new Paralelogramo();
                System.out.print("Informe a base: ");
                double basePar = sc.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaPar = sc.nextDouble();
                p.recebeBase(basePar);
                p.recebeAltura(alturaPar);
                p.calcArea();
                p.listarAtributos();
                System.out.println("Área do paralelogramo: " + p.retornaArea());
                break;

            case 8:
                Hexagono h = new Hexagono();
                System.out.print("Informe o lado: ");
                double ladoHex = sc.nextDouble();
                h.recebeLado(ladoHex);
                h.calcArea();
                h.listarAtributos();
                break;

            case 9:
                Pentagono pent = new Pentagono();
                System.out.print("Informe o lado: ");
                double ladoPent = sc.nextDouble();
                pent.recebeLado(ladoPent);
                pent.calcArea();
                pent.listarAtributos();
                break;

            default:
                System.out.println("Opção inválida!");
        }
	}
	
	
}
