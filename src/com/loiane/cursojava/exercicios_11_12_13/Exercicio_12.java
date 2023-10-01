package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
			double height = scan.nextDouble();
			
		double idealKg = (72.7*height) - 58;
		System.out.printf("\nSeu peso ideal é: %.3f", idealKg);
		
//		Tendo como dados de entrada a altura de uma pessoa, construa um 
//		algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
//		(72.7*altura) - 58

	}

}
