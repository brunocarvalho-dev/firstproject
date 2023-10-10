package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_15 {

	public static void main(String[] args) {
	
		
		Double [] lado = new Double[3];
		
		

		boolean valid = true;
		do{
			
			for (int i = 0; i < 3; i++) {
		
			String input = JOptionPane.showInputDialog("Digite o lado"+ (i+1) + " do triangulo: ");
			input = input.replace(",",".");
			lado [i] = Double.valueOf(input);	
			}
			if((
					((lado[0] <= 0) && (lado[0] < lado[1] + lado[2])) || 
					((lado[1] <= 0) && (lado[1] < lado[0] + lado[2])) || 
					((lado[2] <= 0) && (lado[2] < lado[0] + lado[1]))
			   )) {
				String teste = JOptionPane.showInputDialog(null, "Valor inválido!\nDeseja digitar novamente?");
				teste = teste.substring(0,1);
				if(teste.equalsIgnoreCase("N")) {
					valid = false;
					break;
				}else {
					continue;
				}
			}else {
				valid = false;

			}
		
		}while (valid);
		

		
		
		if(lado[0] == (lado[0] + lado[1] + lado[2])/3) {
			JOptionPane.showMessageDialog(null, "Esse triangula é : Equilátero");
		}else if((lado[0] == lado[1]) || (lado[0] == lado[2]) || (lado[1] == lado[2])) {
			JOptionPane.showMessageDialog(null, "Esse triangulo é: Isóceles");
		}else {
			JOptionPane.showMessageDialog(null, "Esse triangulo é: Escaleno");
		}

	}

}
//15.Faça um Programa que peça os 3 lados de um triângulo. O programa 
//deverá informar se os valores podem ser um triângulo. Indique, caso 
//os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
//escaleno.
//o Dicas:
//o Três lados formam um triângulo quando a soma de quaisquer 
//dois lados for maior que o terceiro;
//o Triângulo Equilátero: três lados iguais;
//o Triângulo Isósceles: quaisquer dois lados iguais;
//o Triângulo Escaleno: três lados diferentes;
