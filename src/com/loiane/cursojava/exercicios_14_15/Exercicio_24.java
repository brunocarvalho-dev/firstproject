package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_24 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		String operation;
		

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		operation = JOptionPane.showInputDialog("Digite a operação \"+\", \"-\", \"*\", \"/\": ");
		
		String resultado = operacaoMatematica(num1, num2, operation);
		
		JOptionPane.showMessageDialog(null, resultado);
		

	}
	public static String operacaoMatematica(double num1, double num2, String op)
	{
		boolean valid = true;
		double result = 0;
		do {
			switch (op) {
				case "+": 
				{
					result = num1 + num2;
					valid = false;
					break;
				}
				case "-":
				{
					result = num1 - num2;
					valid = false;
					break;
				}
				case "*":
				{
					result = num1 * num2;
					valid = false;
					break;
				}
				case "/":
				{
					result = num1 / num2;
					valid = false;
					break;
				}
				default:
				{
					throw new IllegalArgumentException("Operação inválida");
				}
			}
		}while(valid);
		String resultado = String.valueOf("Resultado\n" + num1 + " " + op + " " + num2 + " = " + result);
		return resultado;
		
	}
	

}
//24.Faça um Programa que leia 2 números e em seguida pergunte ao 
//usuário qual operação ele deseja realizar. O resultado da operação 
//deve ser acompanhado de uma frase que diga se o número é:
//. par ou ímpar;
//a. positivo ou negativo;
//b. inteiro ou decimal.
