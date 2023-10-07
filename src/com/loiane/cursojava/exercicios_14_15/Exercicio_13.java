package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_13 {

	public static void main(String[] args) {
		int weekNumber = 0;
		boolean valid = true;
		
		do {
			weekNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7, para ver o dia da semana correspondente"));
			if((weekNumber <= 0)||(weekNumber > 7)) {
				String opt = JOptionPane.showInputDialog(null, "Valor invalido!\nDeseja digitar novamente?\n\n (Y) ou (N)");
				opt = opt.substring(0,1);
				opt = opt.toLowerCase();

				switch (opt) {
				case "n":
					valid = false;
					break;
				default:
					valid = true;
					break;
				}
			}else {
				valid = false;
			}
			
		}while(valid);
		
		switch (weekNumber) {
		case 1: JOptionPane.showMessageDialog(null, "Domingo!");	break;
		case 2: JOptionPane.showMessageDialog(null, "Seginda-Feira!");	break;
		case 3: JOptionPane.showMessageDialog(null, "Terça-Feira!");	break;
		case 4: JOptionPane.showMessageDialog(null, "Quarta-Feira!");	break;
		case 5: JOptionPane.showMessageDialog(null, "Quinta-Feira!");	break;
		case 6: JOptionPane.showMessageDialog(null, "Sexta-Feira!");	break;
		case 7: JOptionPane.showMessageDialog(null, "Sábado!");	break;

		}
	}

}
//13.Faça um Programa que leia um número e exiba o dia correspondente 
//da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
//aparecer valor inválido.
