package com.loiane.cursojava.exercicios_14_15;

import java.util.Scanner;

public class Ezercicio_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
			
		System.out.println("Digite o primerio preço:");
			double num1 = scan.nextDouble();
		System.out.println("Digite o segundo preço:");
			double num2 = scan.nextDouble();
		System.out.println("Digite o terceito preço:");
			double num3 = scan.nextDouble();
			
//		if (num1 < num2) {
//			if(num2 < num3) {
//				System.out.printf("%.2f - %.2f - %.2f", num1 ,num2 ,num3);
//		}else {
//			System.out.printf("%.2f - %.2f - %.2f", num1, num3, num2);
//		}}else if (num2 < num1) {
//			if(num1 < num3) {
//				System.out.printf("%.2f - %.2f - %.2f",num2, num1, num3);
//		}else {
//			System.out.printf("%.2f - %.2f - %.2f", num2, num3, num1);
//		}}else if (num3 < num1) {
//			if(num1 < num2) {
//				System.out.printf("%.2f - %.2f - %.2f",num3, num1, num2);
//		}else {
//			System.out.printf("%.2f - %.2f - %.2f",num3, num2, num1);
//		}}
			
		if (num1 < num2 && num1 < num3) {
			System.out.println("o primeiro número é o menor preço");
		}else if (num1 > num2 && num2 < num3) {
			System.out.println("O segundo é o menor preço");
		}else {
			System.out.println("O terceiro número é o menor preço");

		}
	}

}
