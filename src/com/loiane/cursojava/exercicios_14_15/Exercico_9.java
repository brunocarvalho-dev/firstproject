package com.loiane.cursojava.exercicios_14_15;

import java.util.Scanner;

public class Exercico_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primerio preço:");
			double num1 = scan.nextDouble();
		System.out.println("Digite o segundo preço:");
			double num2 = scan.nextDouble();
		System.out.println("Digite o terceito preço:");
			double num3 = scan.nextDouble();
			
		if ((num1 < num2) && (num1 < num3)) {
			if(num2 < num3) {
				System.out.printf("%.2f - %.2f - %.2f", num1 ,num2 ,num3);
		}else {
			System.out.printf("%.2f - %.2f - %.2f", num1, num3, num2);
		}}else if ((num2 < num1) && (num2 < num3)) {
			if(num1 < num3) {
				System.out.printf("%.2f - %.2f - %.2f",num2, num1, num3);
		}else {
			System.out.printf("%.2f - %.2f - %.2f", num2, num3, num1);
		}}else if ((num3 < num1) && (num3 < num2)) {
			if(num1 < num2) {
				System.out.printf("%.2f - %.2f - %.2f",num3, num1, num2);
		}else {
			System.out.printf("%.2f - %.2f - %.2f",num3, num2, num1);
		}}

	}

}
