package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_22 {

	public static void main(String[] args) {
		int imparPar = 0;
		
		String input = JOptionPane.showInputDialog("Digite um número para saber sé e´impar ou par:");
		
		imparPar = Integer.parseInt(input);
		
		if(imparPar % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O numero "+imparPar+" é PAR");
		}else {
			JOptionPane.showMessageDialog(null, "O numero "+imparPar+" é IMPAR");
		}
	}

}
//22.Faça um Programa que peça um número inteiro e determine se ele é 
//par ou impar. Dica: utilize o operador módulo (resto da divisão).
