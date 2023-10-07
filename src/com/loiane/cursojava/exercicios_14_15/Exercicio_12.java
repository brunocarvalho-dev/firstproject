package com.loiane.cursojava.exercicios_14_15;

import java.text.DecimalFormat;

public class Exercicio_12 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		////Variaveis
		double ir = 0.0;
		double extraHour = 0.0;
		
		
		String payHour = JOptionPane.showInputDialog("Digite o salário/ hora");
		payHour = payHour.replace(",",".");
		Double payForHOur = Double.parseDouble(payHour);
		String hourMonth = JOptionPane.showInputDialog("Digite as horas trabalhadas no mês");
		hourMonth = hourMonth.replace(",",".");
		Double hourForMonth = Double.parseDouble(hourMonth);
		
		Double grossSalary = payForHOur*hourForMonth;
		
		double sindicato = grossSalary*0.03;
		double fgts = grossSalary*0.11;
		
		/////Horas Extras
		if (hourForMonth > 220) {
			extraHour = (hourForMonth-220)*2*payForHOur;
			grossSalary += extraHour;
			
		}
		/////Imposto IR
		if(grossSalary <= 900) {
			ir = 0.0;
		}else if(grossSalary<= 1500) {
			ir = (grossSalary*0.05);
		}else if(grossSalary <= 2500) {
			ir = (grossSalary*0.1);
		}else if(grossSalary < Double.MAX_VALUE) {
			ir = (grossSalary*0.2);
		}
		
		/////transformando valores
		String payForHourStr = df.format(payForHOur);
		String grossSalaryStr = df.format(grossSalary);
		String extHour = df.format(extraHour);
		String irStr = df.format(ir);
		String fgtsStr = df.format(fgts);		
		String sindicatoStr = df.format(sindicato);
		String liqSalary = df.format(grossSalary - ir - sindicato);
		
		/////Imprimindo tela
		JOptionPane.showMessageDialog(null, 
					"Folha de Pagamento\n"
				+ "\nSalário por hora R$ " + payForHOur
				+ "\nHoras trabalhadas mês: " + hourForMonth 
				+ "\nSalário Bruto: R$" + grossSalaryStr
				+ "\nHoras Extras R$ " + extHour
				+ "\nSindicato R$ -" + sindicatoStr
				+ "\nFGTS R$ -" + fgtsStr
				+ "\nImposto (IR) R$ - " + irStr
				+ "\nSalário Liquido : R$" + liqSalary);
	}

}
//12.Faça um programa para o cálculo de uma folha de pagamento, 
//sabendo que os descontos são do Imposto de Renda, que depende do 
//salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
//FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é 
//a empresa que deposita). O Salário Líquido corresponde ao Salário 
//Bruto menos os descontos. O programa deverá pedir ao usuário o 
//valor da sua hora e a quantidade de horas trabalhadas no mês.
//o Desconto do IR:
//o Salário Bruto até 900 (inclusive) - isento
//o Salário Bruto até 1500 (inclusive) - desconto de 5%
//o Salário Bruto até 2500 (inclusive) - desconto de 10%
//o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela 
//as informações, dispostas conforme o exemplo abaixo. No 
//exemplo o valor da hora é 5 e a quantidade de hora é 220.
//Salário Bruto: (5 * 220) : R$ 1100,00 
//(-) IR (5%) : R$ 55,00 
//(-) INSS ( 10%) : R$ 110,00 
//FGTS (11%) : R$ 121,00 
//Total de descontos : R$ 165,00 
//Salário Liquido : R$ 935,00
