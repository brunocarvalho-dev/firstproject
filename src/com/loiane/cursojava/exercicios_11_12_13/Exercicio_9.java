package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite a temperatura em Farenheit: ");
			double tempF = scan.nextDouble();
		
			double tempC = (5*(tempF - 32)/9);
			
			System.out.printf("\nA temperatura \"%.1fF\" equivale %.1f°C ", tempF, tempC);

	}

}
