package com.loiane.cursojava.exercicios_16_17;

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {
		double nota =0;
		
		do
		{
			String notaStr = JOptionPane.showInputDialog("Digite o valor da nota de 0 a 10");
			nota = Double.valueOf(notaStr.replace(",", "."));
			if((nota < 0) || (nota > 10))
			{
				JOptionPane.showMessageDialog(null, "Invali Value");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "A nota do aluno é " + nota);
				break;
			}
		}while(true);
		
		
	}

}
/*
. Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o 
usuário informe um valor válido.
*/