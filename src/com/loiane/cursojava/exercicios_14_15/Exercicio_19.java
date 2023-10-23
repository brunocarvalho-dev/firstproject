package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_19 {

	public static void main(String[] args) {
		
		int cent = 0, dez = 0, unid = 0;
		int input;
		boolean validate = true, validate2 = true;
		String inputStr;
		
		do {
			
			inputStr = JOptionPane.showInputDialog("Digite um número menor que 1000");
			input = Integer.parseInt(inputStr);
			
			if ((input > 1000) || (input<0)) {
				do {
					inputStr = JOptionPane.showInputDialog(null, "Valor digitado inválido\n\n "
							+ "Deseja digitar novamente?");
					if(inputStr.equalsIgnoreCase("y")) {
						continue;						
					}
					if(inputStr.equalsIgnoreCase("n")) {
						validate = false;
						validate2 = false;
						break;
					}
				}while(validate2);
			}else if((input > 0) || (input <=1000)) {
				validate = false;
			}
			
		}while(validate);
		
		for (; input >= 100; cent++) {
			input = input - 100;
		}
		for (; input >= 10; dez++){
			input = input - 10;
		}
		unid = input;
		JOptionPane.showMessageDialog(null, "Tabela Unidade\n\n"
				+ "O valor de  "+inputStr+" tem:\n"
				+ "\nCentenas = "+cent
				+ "\nDezanas = "+dez
				+ "\nUnidades = "+unid);
	}
}
//19.Faça um Programa que leia um número inteiro menor que 1000 e 
//imprima a quantidade de centenas, dezenas e unidades do mesmo.
//o Observando os termos no plural a colocação do "e", da vírgula 
//entre outros. Exemplo:
//o 326 = 3 centenas, 2 dezenas e 6 unidades
//o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 
//310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
