package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite quantos metros para saber seu valor em cm: ");
			double metros = scan.nextDouble();
			
		double cmMetros = metros*100;
		System.out.printf("\n\"%.1fm\" em centimetros é: %.1fcm", metros, cmMetros);
		
	}

}
