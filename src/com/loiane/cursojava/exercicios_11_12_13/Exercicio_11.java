package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
			int valorIntA = scan.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
			int valorIntB = scan.nextInt();
		System.out.print("Digite o terceiro número real: ");
			double valorReal = scan.nextDouble();
		
//		a. o produto do dobro do primeiro com metade do segundo .
		int resultA = ((valorIntA*2)*(valorIntB/2));
		System.out.print("\nO resultado do produto do dobro do primeiro \ncom metade do segundo: " + resultA);

//		b. a soma do triplo do primeiro com o terceiro.
		double resultB = (valorIntA*3) + valorReal;
		System.out.printf("\nO resultado da soma do triplo do primeiro com o terceiro é: " + resultB);

//		c. o terceiro elevado ao cubo.
		double resultC = Math.pow(valorReal, 3);
		System.out.printf("\nO resultado do terceiro elevado ao cubo é: %.3f" , resultC);
		
	}

}
