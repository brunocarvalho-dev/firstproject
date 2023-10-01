package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercico_10 {

	public static void main(String[] args) {
		String turno ="";
		boolean activ = true;
		
		do{
			boolean quest = true;
			
			String input = JOptionPane.showInputDialog("Qual o turno que você estuda?\nM-matutino ou V-Vespertino ou N- Noturno");
			turno = input.substring(0,1);
			turno = turno.toLowerCase();
			switch (turno) {
				case "m":
					JOptionPane.showMessageDialog(null, "Bom dia! ");
					break;
				case "n":
					JOptionPane.showMessageDialog(null, "Boa Noite!");
					break;
				case "v":
					JOptionPane.showMessageDialog(null, "Boa tarde! ");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Resposta invalida!");
					break;
			}
			do{
				String input2 = JOptionPane.showInputDialog("Deseja Responder novamente?\nS-SIM ou N-NÂO: ");
				input2 = input2.substring(0,1);
				if(input2.equalsIgnoreCase("s")){
					quest = false;
					continue;
				}else if(input2.equalsIgnoreCase("n")) {
					activ = false;
					quest = false;
				}else{
					JOptionPane.showMessageDialog(null, "Resposta invalida!\n\nDigite Novamente:");
				}
			}while(quest);
					
		}while(activ);
		
	}

}
//Faça um Programa que pergunte em que turno você estuda. Peça 
//para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
//mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
//Inválido!", conforme o caso