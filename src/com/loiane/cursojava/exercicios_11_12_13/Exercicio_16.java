package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a área a ser pintada em m²: ");		
			double area = scan.nextDouble();
			double litros = area/3;
			int lata = 1;
			double preco = 80.00;
		
		if(litros > 18){
			int i = 1;
			while(i < (litros/18)) {
				lata++;
				preco += preco;
				i++;
			}
		}
		System.out.printf("Para pintar a area de " + area + "m²"
				+ "\nVocê utilizará %.2f litros de tinta"
				+ "\nPrecisará de " + lata + " latas de tinta, o tatal vai sair por R$%.2f", litros, preco);
	
		
//		.Faça um programa para uma loja de tintas. O programa deverá pedir o 
//		tamanho em metros quadrados da área a ser pintada. Considere que a 
//		cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
//		tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
//		usuário a quantidades de latas de tinta a serem compradas e o preço 
//		total

	}

}
