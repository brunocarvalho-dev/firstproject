package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
			double nota1 = scan.nextDouble();
		System.out.print("\nDigite a segunda nota: ");
			double nota2 = scan.nextDouble();
		System.out.print("\nDigite a terceira nota: ");
			double nota3 = scan.nextDouble();
		System.out.print("\nDigite a quarta nota: ");
			double nota4 = scan.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("\nA média do aluno é: " + media);
	}

}
