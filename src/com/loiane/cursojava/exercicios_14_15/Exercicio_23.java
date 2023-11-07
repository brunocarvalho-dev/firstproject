package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_23 {

	public static void main(String[] args) {
		double doubOrInt = 0;
		int intDouble = 0;
		
		String input = JOptionPane.showInputDialog("Digite um número para saber sé é inteiro ou decimal:");
		
		doubOrInt = Double.parseDouble(input.replace(",", "."));
		intDouble = (int) doubOrInt;
		double compare = Double.valueOf(intDouble);
		
		if (doubOrInt > compare) {
			JOptionPane.showMessageDialog(null, "O número "+ input + " é um decimal");
		}else {
			
			JOptionPane.showMessageDialog(null, "O número "+ input + " é um inteiro");
		}
	}

}
//23.Faça um Programa que peça um número e informe se o número é 
//inteiro ou decimal. Dica: utilize uma função de arredondamento.
