package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_21 {

	public static void main(String[] args) {
		
		String conta = "";
		
		int saque = 0;
		int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;
		
		do{
			conta = JOptionPane.showInputDialog("Digite o valor para sacar\n\n"
												+ "O caixa tem notas de de:\n 1, 5,"
												+ "10, 50 e 100 reais");
			saque = Integer.parseInt(conta);
			if (!(saque > 0)) {
				JOptionPane.showMessageDialog(null, "conta invalido\n Digite novamente");
			}
		
		}while(saque <= 0);
		
		
		for(;saque >= 100;saque -= 100) {
			nota100 ++;
		}

		for(;saque >= 50;saque -= 50) {
			nota50 ++;
		}

		for(;saque >= 10;saque -= 10) {
			nota10 ++;
		}

		for(;saque >= 5;saque -= 5) {
			nota5 ++;
		}

		for(;saque >= 1;saque -= 1) {
			nota1 ++;
		}
		
		JOptionPane.showMessageDialog(null, "Saque Realizado com Sucesso!\n\n"
				+ "Valor sacador : R$"+conta+",00"
				+ "\n\nNotas fornecidas:\n"
				+ nota100 + " - R$ 100,00\n"
				+ nota50 + " - R$ 500,00\n"
				+ nota10 + " - R$ 10,00\n"
				+ nota5 + " - R$ 5,00\n"
				+ nota1 + " - R$ R1,00\n");
	
	}

}
//21.Faça um Programa para um caixa eletrônico. O programa deverá 
//perguntar ao usuário a valor do saque e depois informar quantas notas 
//de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 
//10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 
//reais. O programa não deve se preocupar com a quantidade de notas 
//existentes na máquina.
//. Exemplo 1: Para sacar a quantia de 256 reais, o programa 
//fornece duas notas de 100, uma nota de 50, uma nota de 5 e 
//uma nota de 1;
//a. Exemplo 2: Para sacar a quantia de 399 reais, o programa 
//fornece três notas de 100, uma nota de 50, quatro notas de 10, 
//uma nota de 5 e quatro notas de 1.
