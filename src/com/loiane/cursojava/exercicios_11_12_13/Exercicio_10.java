package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite a temperatura em °C: ");
			double tempC = scan.nextDouble();
		
			double tempF = (9*(tempC/5)+32);
			
		System.out.printf("\nA temperatura \"%.1f°C\" equivale %.1fF ", tempC, tempF);
	}
}
