package com.loiane.cursojava.exercicios_14_15;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	System.out.println("Digite o primerio número:");
		double num1 = scan.nextDouble();
	System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();
	System.out.println("Digite o terceito número:");
		double num3 = scan.nextDouble();
	
	if (num1 > num2 && num1 > num3) {
		System.out.println("o primeiro número é o maior");
	}else if (num1 < num2 && num2 > num3) {
		System.out.println("o segundo é o maior");
	}else {
		System.out.println("O terceiro número é o maior");
	}
	if (num1 < num2 && num1 < num3) {
		System.out.println("o primeiro número é o menor");
	}else if (num1 > num2 && num2 < num3) {
		System.out.println("O segundo é o menor");
	}else {
		System.out.println("O terceiro número é o menor");
	}

	}

}
