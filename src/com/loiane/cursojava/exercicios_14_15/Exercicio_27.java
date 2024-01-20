package com.loiane.cursojava.exercicios_14_15;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void frutas(String fruta1, String fruta2, double pesoMaca, double pesoMorango) {
		
		String padraoDecimal = "###.###,00";
		DecimalFormat df = new DecimalFormat(padraoDecimal);
		
		double macaPreco = 0, morangoPreco = 0, subtotal = 0, total = 0, desconto = 0;
		

		if((pesoMaca + pesoMorango) > 8)
		{
			macaPreco = 1.50;
			morangoPreco = 2.20;
			subtotal = ((pesoMaca * macaPreco) + (pesoMorango * morangoPreco));
			
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
			macaPreco = 1.80;
			morangoPreco = 2.50;
			total = subtotal - desconto;
		}
		
		total = "Nota de Compra\n"
				+"\nFruta: " + fruta1
				+"\nValor da " + frunta1 + ":  R$ " + df.format(combustivelValor)
				+"\n\nTotal Abastecido: " + litros + " litros"
				+"\nSubtotal: R$ " + df.format(subtotal)
				+"\nDesconto: R$ -" + df.format(subtotal - (subtotal * (100-desconto)/100))
				+"\n\nTotal: R$ " + df.format(valorFinal);
	
		

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
