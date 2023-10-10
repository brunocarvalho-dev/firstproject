package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_18 {

	public static void main(String[] args) {
	
		int dia, mes, ano;
		
		Integer [] data = new Integer [6];
		
		String input = JOptionPane.showInputDialog("Digite uma data no formato (dd/mm/aaaa)");
		for(int i = 0 ; i< data.length; i++) {
			if (input.length() == 5) {
				data [0] = 0;
				i++;
			}
			data [i] = Integer.parseInt(String.valueOf(input.charAt(i)));
//			if (data [0] == 3) 
//			if (data [0] <= 3) && (data [1] <= 9) &&  
		}
	}

}
//18.Faça um Programa que peça uma data no formato dd/mm/aaaa e 
//determine se a mesma é uma data válida.
