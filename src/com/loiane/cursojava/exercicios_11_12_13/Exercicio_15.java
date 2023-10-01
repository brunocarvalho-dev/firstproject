package com.loiane.cursojava.exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio_15 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double extraHour = 0;
	System.out.println("Entre com o valor do salario em horas: ");
		double hourSalary = scan.nextDouble();
	System.out.println("Qantas horas você trabalhou no mês: ");
		double hourWorked = scan.nextDouble();
		
	double grossSalary = hourSalary * hourWorked;
	
	if (hourWorked > 220) {
		extraHour = (hourWorked - 220) * hourSalary;
	}
	
	double ir = ((grossSalary + extraHour) * 11) / 100;
	double inss = ((grossSalary + extraHour) * 8) / 100;
	double sindicate = ((grossSalary + extraHour) * 5) / 100;
	double netSalary = (grossSalary + extraHour) - (ir + inss + sindicate);
	
	System.out.printf("\nO total a bruto à receber é: R$%.2f"
			+ "\nO valor das horas extras: R$%.2f\n"
			+ "\ndescontos:\n"
			+ "\nINSS 8%%: R$%.2f"
			+ "\nIR 11%%: R$%.2f"
			+ "\nSindicato 5%%: R$%.2f\n"
			+ "\ndando um total liquido de:\nR$%.2f"
			, grossSalary,extraHour, inss, ir, sindicate, netSalary);
	
	}

}
