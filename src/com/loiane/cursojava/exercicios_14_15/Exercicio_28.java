package com.loiane.cursojava.exercicios_14_15;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_28 {

	public static void main(String[] args) {
		
		
		int carneCorte = 0;
		boolean validation = true;
		
		JOptionPane.showMessageDialog(null, "Bem Vindo Ao Mercado Tabajara!");

		//Validação Corte da carne
		do
		{
			carneCorte = Integer.parseInt(JOptionPane.showInputDialog("Digite o corte que deseja:"
																	+ "\n\nDigite 1 - File"
																	+ "\n\nDigite 2 - Alcatra"
																	+ "\n\nDigite 3 - Picanha"));
			if((carneCorte < 0) || (carneCorte > 3))
			{
				JOptionPane.showMessageDialog(null, "Tipo de Corte Inválido\n\nDigite novamente");
			}
			else 
			{
				valorTotal(carneKg(), corteCarne(carneCorte), formaPagamento());
				validation = false;
			}
		}while(validation);
		

	}
	public static String formaPagamento() {
		boolean validation = true;
		String pgto = "";
		int formaPagamento = 0;
		
		//validação Forma de Pagamento
		do
		{
				formaPagamento = Integer.parseInt(JOptionPane.showInputDialog("Digite forma de pagamento que deseja:"
																		+ "\n\nDigite 1 - Dinheiro"
																		+ "\n\nDigite 2 - Cartão"
																		+ "\n\nDigite 3 - Cartão Tabajara"
																		+ "\n\nDigite 4 - Pix"));
			 if((formaPagamento < 0) || (formaPagamento> 4))
			{
				JOptionPane.showMessageDialog(null, "Forma de pagamento Inválido\n\nDigite novamente");
			}
			else 
			{
				switch (formaPagamento) {
					case 1: 
					{ 
						pgto = "Dinheiro";
						break;
					}
					case 2: 
					{ 
						pgto = "Cartao";
						break;
					}
					case 3: 
					{ 
						pgto = "Cartao Tabajara";
						break;
					}
					case 4: 
					{ 
						pgto = "Pix";
						break;
					}
				}
				
				validation = false;
			}
			
		}while(validation);
		
		return pgto;

	}
	public static String corteCarne(Integer numeroTipo)
	{
		String corte ="";
		switch (numeroTipo) 
		{
			case 1: 
			{
				corte = "File";
				break;
			}
			case 2: 
			{
				corte = "Alcatra";
				break;			
			}
			case 3: 
			{
				corte = "Picanha";
				break;			
			}	
		}
		return corte;
	}
	public static double carneKg() 
	{
		boolean validation = true;
		double carneKg = 0;
		
		//Validação Peso da carne
		do
		{
			String carneKgStr = JOptionPane.showInputDialog("Digite quantos quilos que deseja:");
			carneKg = Double.valueOf(carneKgStr.replace(",", "."));
			if(carneKg <= 0)
			{
				JOptionPane.showMessageDialog(null, "Peso do Corte Inválido\n\nDigite novamente");
			}
			else 
			{
				
				validation = false;
			}
		}while (validation);
		
		return carneKg;
		
	}
	public static void valorTotal(double pesoCarne, String carneTipo, String formaPagamento)
	{
		String padrao = "###,##0.00";
		DecimalFormat df = new DecimalFormat(padrao);
		
		double carneValor = 0, desconto = 5;
		

		switch (carneTipo) 
		{
			case "File": 
			{	
				carneValor = (pesoCarne > 5)? 5.80 : 4.90;
				break;
			}
			case "Alcatra" : 
			{
				carneValor = (pesoCarne > 5)? 5.90 : 6.80;
				break;
			}
			case "Picanha": 
			{
				carneValor = (pesoCarne > 5)? 6.90 : 7.80;
				break;
			}

		}
		
		//subtotal
		double subtotal = pesoCarne * carneValor;
		
		//desconto
		desconto = (formaPagamento.equalsIgnoreCase("CARTAO TABAJARA"))? subtotal * ((desconto)/100): 0;
		 
		 		 
		String totalPagar = "Nota de Compra\n"
					+"\nTipo de Carne: " + carneTipo
					+"\nValor da carne: R$ " + df.format(carneValor)
					+"\nPeso da Carne : " + pesoCarne + " Kg"
					+"\n\nSubtotal: R$ " + df.format(subtotal)
					+"\nForma de pagamento: " + formaPagamento
					+"\nDesconto: R$ -" + df.format(desconto)
					+"\n\nTotal: R$ " + df.format(subtotal - desconto)
					+"\n\nObrigado, Volte Sempre!";
		
		

		totalPagar = String.valueOf(totalPagar);
		JOptionPane.showMessageDialog(null, totalPagar);
		
	}

}
//28.O Hipermercado Tabajara está com uma promoção de carnes que é 
//imperdível. Confira:
//o Até 5 Kg Acima de 5 Kg 
//o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg 
//o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg 
//o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
//Para atender a todos os clientes, cada cliente poderá levar 
//apenas um dos tipos de carne da promoção, porém não há 
//limites para a quantidade de carne por cliente. Se compra for 
//feita no cartão Tabajara o cliente receberá ainda um desconto 
//de 5% sobre o total a compra. Escreva um programa que peça 
//o tipo e a quantidade de carne comprada pelo usuário e gere 
//um cupom fiscal, contendo as informações da compra: tipo e 
//quantidade de carne, preço total, tipo de pagamento, valor do 
//desconto e valor a pagar.