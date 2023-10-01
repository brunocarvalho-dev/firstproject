package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o valor de um dos lados do quadrado: ");
			double square1 = scan.nextDouble();
		
		double area = Math.pow(square1, 2);
		double areaSquare = 2*area;
		System.out.printf("\nA área de um quadrado de %.2f", area);
		System.out.printf("\nO dobro da área de um quadrado de %.2f", areaSquare);
	}

}
