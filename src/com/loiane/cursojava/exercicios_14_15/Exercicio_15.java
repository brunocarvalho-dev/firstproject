package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_15 {

	public static void main(String[] args) {
	
		Double[] side = new Double [3];
	
		for (int i = 0; i<3 ; i++) {
			String input = JOptionPane.showInputDialog("Digite o lado "+ (i+1)+" do triangulo: ");
			input = input.replace(",",".");
			side[i] = Double.valueOf(input);
		}
		if((side[0] == side[1]) and (side[1] == side[2]){
			JOptionPane.showMessageDialog("Triangulo tem o três lados iguais\nTriangulo EQUILATERO");
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
