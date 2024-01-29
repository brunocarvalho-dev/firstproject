package com.loiane.cursojava.exercicios_16_17;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Execicio_5 {

	public static void main(String[] args) {
		String padraoDecimal = "###,##0";
		DecimalFormat df = new DecimalFormat(padraoDecimal);
		
		int populationA = populacao1();
		double taxaA = jurosTaxaA();

		int populationB = populacao2();
		double taxaB = jurosTaxaB();
		
		int anos = calculoPopulacional(populationA, populationB, taxaA, taxaB);
		
		String resultado = String.valueOf(df.format(anos));
		
		System.out.println("A população se igualará em " + resultado + " Anos");
		System.out.println("População final de A :" + populacaoFinalA(anos, populationA, taxaA));
		System.out.println("População final de B :" + populacaoFinalA(anos, populationB, taxaB));

	}
	protected static int calculoPopulacional(int populacaoA, int populacaoB, double taxaA, double taxaB) 
	{
		int anos;
		
		if(populacaoA < populacaoB)
		{
			for(anos = 0; populacaoA <= populacaoB; anos++)
			{
				populacaoA += (populacaoA * taxaA);
				populacaoB += (populacaoB * taxaB);
			}
		}
		else
		{
			for(anos = 0; populacaoB <= populacaoA; anos++)
			{
				populacaoA += (populacaoA * taxaA);
				populacaoB += (populacaoB * taxaB);
			}
		}
		
		return anos;
		
	}

	protected static int populacao1() 
	{
		int population;
		
		do
		{
			population = Integer.parseInt(JOptionPane.showInputDialog("Digite a população A"));
			
			if(population > 0)
			{
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Valor invalido, digite novamente: ");
			}
		}while(true);
		
		return population;
	}
	
	protected static int populacao2() 
	{
		int population;
		
		do
		{
			population = Integer.parseInt(JOptionPane.showInputDialog("Digite a população B"));
			
			if(population > 0)
			{
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Valor invalido, digite novamente: ");
			}
		}while(true);
		
		return population;
	}

	protected static double jurosTaxaA() 
	{
		double juros;
		String ok;
		boolean validation = true;
		do
		{
			String jurosStr = JOptionPane.showInputDialog("Digite a taxa de juros da populaão A em porcentagem");
			juros = Double.parseDouble(jurosStr.replace(",", "."));
			
			ok = (JOptionPane.showInputDialog("Digite 'S' para confirmar o valor do juros\nA taxa é de " + juros + " %"));
			ok = ok.toUpperCase();
			switch (ok) 
			{
				case "S": 
				{
					juros = (juros /100);
					validation = false;
					break;
				}
				default:
					break;
			}
		}while(validation);
		
		return juros;
	}

	protected static double jurosTaxaB() 
	{
		double juros;
		String ok;
		boolean validation = true;
		do
		{
			String jurosStr = JOptionPane.showInputDialog("Digite a taxa de juros da população B em porcentagem");
			juros = Double.parseDouble(jurosStr.replace(",", "."));
			ok = (JOptionPane.showInputDialog("Digite 'S' para confirmar o valor do juros\n\nA taxa é de " + juros + " %"));
			ok = ok.toUpperCase();
			switch (ok) 
			{
				case "S": 
				{
					juros = (juros /100);
					validation = false;
					break;
				}
				default:
					break;
			}
		}while(validation);
		
		return juros;
	}

	protected static int populacaoFinalA(int anos, int populacaoA, double taxaA) 
	{
		double populationA = (populacaoA * (1 + (Math.pow(taxaA, anos))));
		return Integer.valueOf(String.valueOf(populacaoA));
	}
	
	protected static int populacaoFinalB(int anos, int populacaoB, double taxaB) 
	{
		double populationA = (populacaoB * (1 + (Math.pow(taxaB, anos))));
		return Integer.valueOf(String.valueOf(populacaoB));
	}
}
/*
Altere o programa anterior permitindo ao usuário informar as 
populações e as taxas de crescimento iniciais. Valide a entrada e 
permita repetir a operação
*/