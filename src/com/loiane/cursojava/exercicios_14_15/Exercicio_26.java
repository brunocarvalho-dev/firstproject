package com.loiane.cursojava.exercicios_14_15;

import java.io.StringWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio_26 {

	public static void main(String[] args) {

		boolean validation = true;
		double litros = 0;
		String combustivel = "";
		
		do 
		{
			String litrosStr = JOptionPane.showInputDialog("Quantos litros deseja abastecer?", "Combustivel em Litros");
			litros = Double.parseDouble(litrosStr.replaceAll(",", "."));                                                                
			
			if(litros > 0)
			{
				do
				{
					combustivel = (JOptionPane.showInputDialog("Digite o tipo de combustivel: G - Gasolina A - álcool" ));
					combustivel = String.valueOf(combustivel.charAt(0));
					if(combustivel.equalsIgnoreCase("G") || combustivel.equalsIgnoreCase("A"))
					{
						validation = false;
					}else
					{
						JOptionPane.showMessageDialog(null, "Valor inválido!"); 
					}
				}while(validation);
			}
			else if(litros == 0)  
			{
				JOptionPane.showMessageDialog(null, "Valor inválido!\nA quantidade de Litros não pode ser 0");
			}
			else  
			{
				JOptionPane.showMessageDialog(null, "Valor inválido!");
			}
		}while(validation);
		
		valorTotal(litros, combustivel);

	}
	public static void valorTotal(double litros, String combustivelTipo)
	{
		String padrao = "###,###.00";
		DecimalFormat df = new DecimalFormat(padrao);
		
		double combustivelValor = 0, desconto= 0;
		double combustivelValorGasolina = 2.50;
		double combustivelValorAlcool = 1.90;
		
		String gasOuAlcool = combustivelTipo, totalPagar;

		if(combustivelTipo.equalsIgnoreCase("A"))
		{
			gasOuAlcool = "Álcool";
			combustivelValor = combustivelValorAlcool;
			if(litros > 20)
			{
				desconto = 5;
			}
			else
			{
				desconto = 3;
			}
		}
		else if(combustivelTipo.equalsIgnoreCase("G"))
		{
			gasOuAlcool = "Gasolina";
			combustivelValor = combustivelValorGasolina;
			if(litros > 20)
			{
				desconto = 6;
			}
			else
			{
				desconto = 4;
			}
		}

		double subtotal = litros * combustivelValor;
		double valorFinal = (litros * combustivelValor)*((100-desconto)/100);
		
		totalPagar = "Nota de Abastecimento\n"
					+"\nCombustivel: " + gasOuAlcool
					+"\nValor do combustível: R$ " + df.format(combustivelValor)
					+"\n\nTotal Abastecido: " + litros + " litros"
					+"\nSubtotal: R$ " + df.format(subtotal)
					+"\nDesconto: R$ -" + df.format(subtotal - (subtotal * (100-desconto)/100))
					+"\n\nTotal: R$ " + df.format(valorFinal);
		
		
		JOptionPane.showMessageDialog(null, "Bem Vindo Ao Posto Tabajara!");
		totalPagar = String.valueOf(totalPagar);
		JOptionPane.showMessageDialog(null, totalPagar);
		
	}

}
//26.Um posto está vendendo combustíveis com a seguinte tabela de 
//descontos:
//. Álcool:
//a. até 20 litros, desconto de 3% por litro
//b. acima de 20 litros, desconto de 5% por litro
//Gasolina:
//c. até 20 litros, desconto de 4% por litro
//d. acima de 20 litros, desconto de 6% por litro Escreva um 
//algoritmo que leia o número de litros vendidos, o tipo de 
//combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente 
//sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço 
//do litro do álcool é R$ 1,90.
