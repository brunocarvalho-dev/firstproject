package com.loiane.cursojava.exercicios_11_12_13;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o valor do raio de circulo: ");
			double raioCircle = scan.nextDouble();
			
		double areacircle = Math.PI*Math.pow(raioCircle, 2);
		System.out.printf("\nA área do circulo é: %.2f", areacircle);

	}

}
