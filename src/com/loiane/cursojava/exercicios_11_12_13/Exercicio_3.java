package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite o primeiro valor: ");
			double numberA = scan.nextDouble();
		System.out.println("\nDigite o primeiro valor: ");
			double numberB = scan.nextDouble();
			double soma = numberA + numberB;
		System.out.printf("\nA soma dos numéros \"%.2f\" e \"%.2f\" é : %.2f", numberA, numberB, soma);

	}

}
