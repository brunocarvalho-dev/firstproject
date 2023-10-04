package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_11 {

	public static void main(String[] args) {
		String payDay = JOptionPane.showInputDialog("Digite o salário");
		payDay = payDay.replace(",",".");
		Double salary = Double.parseDouble(payDay);
		Double liqSalary = 0.0;
		
		if (salary < 280) {
			liqSalary = salary* 1.2;
		}else if (salary < 700) {
			liqSalary = salary*1.15;
		}else if(salary < 1500) {
			liqSalary = salary*1.1;
		}else {
			liqSalary = salary*1.05;
		}
		System.out.println(salary + " - " + liqSalary + " - " + (((liqSalary/salary)-1)*100) + " - " + (liqSalary-salary));
	}
}
//11.As Organizações Tabajara resolveram dar um aumento de salário aos 
//seus colaboradores e lhe contraram para desenvolver o programa que 
//calculará os reajustes.
//o Faça um programa que recebe o salário de um colaborador e o 
//reajuste segundo o seguinte critério, baseado no salário atual:
//o salários até R$ 280,00 (incluindo) : aumento de 20%
//o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//o salários de R$ 1500,00 em diante : aumento de 5% Após o 
//aumento ser realizado, informe na tela:
//o o salário antes do reajuste;
//o o percentual de aumento aplicado;
//o o valor do aumento;
//o o novo salário, após o aumento.