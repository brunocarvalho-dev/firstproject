package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_16 {

	public static void main(String[] args) {
		double [] size = new double [3];
		
		boolean valid = true;
		do{
			
			for (int i = 0; i < 3; i++) {
		
				String input = JOptionPane.showInputDialog("Digite o lado"+ (i+1) + " do triangulo: ");
				input = input.replace(",",".");
				size [i] = Double.valueOf(input);	
			}
//////teste A - Valor de A = 0			
			if(size[0] == 0)  {
				String teste = JOptionPane.showInputDialog(null, "Essa equação não é de 2º grau"
																+ "\nDeseja digitar novamente?");
				teste = teste.substring(0,1);
				if(teste.equalsIgnoreCase("N")) {
					valid = false;
					break;
				}else {	continue;}
			}
/////teste B - Delta = b² - 4*a*c
			double delta = Math.pow(size[1],2) - 4*size[0]*size[2];
			if (delta < 0) {
				String teste = JOptionPane.showInputDialog(null, "A equação não possui raizes reais!"
																+ "\nDeseja digitar novamente?");
				teste = teste.substring(0,1);
				if(teste.equalsIgnoreCase("N")) {
					valid = false;
					break;
				}else {	continue;}
			}
/////teste C - DElta = 0 existe apenas uma raiz real x = -b/2*a
			if (delta == 0) {
				double valor = ((-1)*size[1])/2*size[0];
				String validStr = String.valueOf(valid);
				JOptionPane.showMessageDialog(null, "A equação possui apenae uma raiz real "+validStr);
				String teste = JOptionPane.showInputDialog(null, "\nDeseja digitar novamente?");
				teste = teste.substring(0,1);
				if(teste.equalsIgnoreCase("N")) {
					valid = false;
					break;
				}else {	continue;}
			}
/////teste D - Delta = positivo, possui duas raizes
			else {

				double xUm = 0; double xDois = 0; 

				xUm = (((-1)*size[1]) + Math.sqrt(delta))/(2*size[0]);
				xDois = (((-1)*size[1]) - Math.sqrt(delta))/(2*size[0]);

				JOptionPane.showMessageDialog(null, "A equação possui duas raiz reais!\n"
											+ "\nValor da raiz X' = "+ xUm
											+ "\nValor da raz X'' = "+ xDois);
				String teste = JOptionPane.showInputDialog(null, "\nDeseja digitar novamente?");
				teste = teste.substring(0,1);
				if(teste.equalsIgnoreCase("N")) {
					valid = false;
					break;
				}else {	continue;}
			}
		}while (valid);
		
	}

}
//16.Faça um programa que calcule as raízes de uma equação do segundo 
//grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, 
//b e c e fazer as consistências, informando ao usuário nas seguintes 
//situações:
//a. Se o usuário informar o valor de A igual a zero, a equação não é 
//do segundo grau e o programa não deve fazer pedir os demais 
//valores, sendo encerrado;
//b. Se o delta calculado for negativo, a equação não possui raizes 
//reais. Informe ao usuário e encerre o programa;
//c. Se o delta calculado for igual a zero a equação possui apenas 
//uma raiz real; informe-a ao usuário;
//d. Se o delta for positivo, a equação possui duas raiz reais; 
//informe-as ao usuário;
