package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double multa = 0;
		double excess = 0;
		double weightFish = 0;
		
		System.out.println("Digite o peso de peixe em kg: ");
			weightFish = scan.nextDouble();
			
		if (weightFish > 50.00) {
			excess = weightFish - 50.00;
		}
		multa = excess * 4.00; 
		System.out.printf("O total de kg que foi pescado fo: %.3fkg"
				+ "\nO total de kg excedido foi: %.3fkg"
				+ "\nvocê exceu %.1f%% acima do permitido"
				+ "\nDevido ao execednete você foi multado em: R$%.2f"
				, weightFish, excess, ((excess/50.00)*100), multa);
	}

}
