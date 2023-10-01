package com.loiane.cursojava.exercicios_14_15;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	System.out.println("Entre com o número");
		int num = scan.nextInt();
		
	if (num >= 0) {
		System.out.println("O número é positivo");
	}else {
		System.out.println("O número é negativo");
	}

	}

}
