package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o seu salário em horas: ");
			double salHoras = scan.nextDouble();
		System.out.print("Digite quantas horas de trabalho no mês: ");
			double horasTrab = scan.nextDouble();
			
			double salMes = salHoras * horasTrab;
			
		System.out.printf("\nSeu salário mensal é de R$%.2f", salMes );
		

	}

}
