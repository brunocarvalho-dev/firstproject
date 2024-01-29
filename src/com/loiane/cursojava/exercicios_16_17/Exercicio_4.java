package com.loiane.cursojava.exercicios_16_17;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {
		String padraoDecimal = "###,##0";
		DecimalFormat df = new DecimalFormat(padraoDecimal);
		
		int populationA = 80000;
		int populationB = 200000;
		
		double taxaA = 0.03;
		double taxaB = 0.015;
		
		String resultado = String.valueOf(df.format(calculoPopulacional(populationA, populationB, taxaA, taxaB)));
		
		JOptionPane.showMessageDialog(null,"A população se igualará em " + resultado + " Anos");

	}
	protected static int calculoPopulacional(int populacao1, int populacao2, double taxa1, double taxa2) 
	{
		int anos;
		
		if(populacao1 < populacao2)
		{
			for(anos = 0; populacao1 <= populacao2; anos++)
			{
				populacao1 += (populacao1 * taxa1);
				populacao2 += (populacao2 * taxa2);
			}
		}
		else
		{
			for(anos = 0; populacao2 <= populacao1; anos++)
			{
				populacao1 += (populacao1 * taxa1);
				populacao2 += (populacao2 * taxa2);
			}
		}
		
		return anos;
	}

}
/*
Supondo que a população de um país A seja da ordem de 80.000 
habitantes com uma taxa anual de crescimento de 3% e que a 
população de B seja 200.000 habitantes com uma taxa de crescimento 
de 1.5%. Faça um programa que calcule e escreva o número de anos 
necessários para que a população do país A ultrapasse ou iguale a 
população do país B, mantidas as taxas de crescimento.
*/