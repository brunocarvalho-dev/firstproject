package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_17 {

	public static void main(String[] args) {
		boolean valid = true;	
		do {
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano para saber se é bissesto"));
			
			if ((ano % 4 == 0) && (ano % 100 != 0)){
				JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissesto");
			}else if ((ano % 100 == 0) &&(ano % 400 == 0)) {
				JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissesto");
			}else {JOptionPane.showMessageDialog(null,"O ano "+ano+" não é bissesto");}
			String teste = JOptionPane.showInputDialog(null, "\nDeseja digitar novamente?");
			teste = teste.substring(0,1);
			if(teste.equalsIgnoreCase("N")) {
				valid = false;
				break;
			}else {	continue;}
		
		}while(valid);
	}

}
//17.Faça um Programa que peça um número correspondente a um 
//determinado ano e em seguida informe se este ano é ou não bissexto.
