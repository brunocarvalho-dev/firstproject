package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Digite sua altura:");
		double height = scan.nextDouble();
	System.out.println("Digite seu sexo: \n"
			+ "\"M\" para masculino \n"
			+ "ou \n"
			+ "\"F\" para femminino");
		String sex = scan.next();
		sex = sex.toUpperCase();
		
		switch (sex) {
		case "M":
			double idealKgMan = ((72.7*height) - 58);
			System.out.printf("Seu peso ideal é: %.2fkg", idealKgMan);
			break;
		case "F":
			double idealKgWoman = ((62.1*height) - 44.7);
			System.out.printf("Seu peso ideal é: %.2fkg", idealKgWoman);

		default:
			System.out.println("Você digitou o sexo erado!\n"
					+ "tente novamente!");
			break;
		}
	}

}
