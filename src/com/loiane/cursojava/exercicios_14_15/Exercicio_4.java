package com.loiane.cursojava.exercicios_14_15;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma letra");
			String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra valida");
		}
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("vogal");break;
		default: System.out.println("Consoante");
		}
	}
		
}
