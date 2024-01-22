package com.loiane.cursojava.exercicios_14_15;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_27 {

	public static void main(String[] args) {
		String fruta1 = "Maçã";
		String fruta2 = "Morango";
		
		double fruta1Kg = 0, fruta2Kg = 0;
		
		boolean validation = true;
		
		JOptionPane.showMessageDialog(null, "Bem Vindo Ao Sacolão Tabajara!");
		
		//Quantidade fruta2
		do 
		{
			String fruta1Str = JOptionPane.showInputDialog("Digite quantos kg de " + fruta1 + " deseja comprar: ");
			fruta1Kg = Double.parseDouble(fruta1Str.replace(",", "."));                                                                
			
			if(fruta1Kg > 0)
			{
				//Quantidade fruta2
				do
				{
					String fruta2Str = JOptionPane.showInputDialog("Digite quantos kg de " + fruta2 + " deseja comprar: ");
					fruta2Kg = Double.parseDouble(fruta2Str.replace(",", ".")); 
					
					if(fruta2Kg > 0)
					{
						validation = false;
					}else
					{
						JOptionPane.showMessageDialog(null, "Valor inválido!"); 
					}
				}while(validation);
				
			}
			else  
			{
				JOptionPane.showMessageDialog(null, "Valor inválido!");
			}
		}while(validation);
		
		
		frutas (fruta1, fruta2, fruta1Kg, fruta2Kg);

	}
	public static void frutas(String fruta1, String fruta2, double pesoFruta1, double pesoFruta2) {
		
		String padraoDecimal = "###,##0.00";
		DecimalFormat df = new DecimalFormat(padraoDecimal);
		
		double fruta1Preco = 0, fruta2Preco = 0, subtotal = 0, total = 0, desconto = 0;
		

		if((pesoFruta1 + pesoFruta2) > 8)
		{
			fruta1Preco = 1.50;
			fruta2Preco = 2.20;
			subtotal = ((pesoFruta1 * fruta1Preco) + (pesoFruta2 * fruta2Preco));
			
			if(subtotal > 25)
			{
				desconto = subtotal * 0.10;
				total = subtotal - desconto;
			}
			
			else
			{
				total = subtotal - desconto;
			}
		}
		
		else
		{
			fruta1Preco = 1.80;
			fruta2Preco = 2.50;
			subtotal = ((pesoFruta1 * fruta1Preco) + (pesoFruta2 * fruta2Preco));
			total = subtotal - desconto;
		}
		
		String totalPagar = "Nota de Compra\n"
				+"\n\nFruta: " + fruta1
				+"\nValor unitário " + fruta1 + ":  R$ " + df.format(fruta1Preco)
				+"\n\nTotal da compra da : "+ fruta1 + ": " + df.format(fruta1Preco * pesoFruta1)
				+"\n\nFruta: " + fruta2
				+"\nValor unitário " + fruta2 + ":  R$ " + df.format(fruta2Preco)
				+"\nTotal da compra da : "+ fruta2 + ": " + df.format(fruta2Preco * pesoFruta2)
				+"\n\nSubtotal: R$ " + df.format(subtotal)
				+"\nDesconto: R$ -" + df.format(desconto)
				+"\n\nTotal a Pagar: R$ " + df.format(total)
				+"\n\nObrigado. Volte sempre!";
	
		
		totalPagar = String.valueOf(totalPagar);
		JOptionPane.showMessageDialog(null, totalPagar);

	}
}
//27.Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//Até 5 Kg Acima de 5 Kg 
//Morango R$ 2,50 por Kg R$ 2,20 por Kg 
//Maçã R$ 1,80 por Kg R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
//compra ultrapassar R$ 25,00, receberá ainda um desconto de 
//10% sobre este total. Escreva um algoritmo para ler a 
//quantidade (em Kg) de morangos e a quantidade (em Kg) de 
//maças adquiridas e escreva o valor a ser pago pelo cliente.
