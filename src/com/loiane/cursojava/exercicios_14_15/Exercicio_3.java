package com.loiane.cursojava.exercicios_14_15;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a letra (F ou M)");
			String sex = scan.next();
		
		
	if (sex.equalsIgnoreCase("m")) {
		System.out.println("O Sexo é masculino");
	}else if (sex.equalsIgnoreCase("f")){
		System.out.println("O sexo é feminino");
	}else {
		System.out.println("Sexo inválido");
	}
	}
}
