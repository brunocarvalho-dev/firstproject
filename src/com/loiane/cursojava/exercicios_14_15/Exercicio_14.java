package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		String nota ="", def ="";
		Double nota1Db = 0.0;
		Double nota2Db = 0.0;
		double media = 0.0;
		boolean valid = true;
		
		do {
			String nota1 = (JOptionPane.showInputDialog("Digite a primeira nota!"));
			nota1Db = Double.parseDouble(nota1.replace(",","."));
			String nota2 = (JOptionPane.showInputDialog("Digite a segunda nota!"));
			nota2Db = Double.parseDouble(nota2.replace(",","."));
			
			media = (nota1Db+nota2Db)/2;
			if((media < 0)||(media > 10)) {
				String opt = JOptionPane.showInputDialog(null, "Valor invalido!\nDeseja digitar novamente?\n\n (Y) ou (N)");
				opt = opt.substring(0,1);
				opt = opt.toLowerCase();

				switch (opt) {
				case "n":valid = false;
					break;
				default:valid = true;
					break;
				}
			}else {
				valid = false;
			}
			
		}while(valid);
		
		
		
		if(media <=4) {
			nota = "E";
			def = "Reprovado";
		}else if(media <=6) {
			nota = "D";
			def = "Reprovado";
		}else if(media <= 7.5) {
			nota = "C";
			def = "Aprovado";
		}else if(media <= 9) {
			nota = "B";
			def = "Aprovado";
		}else if(media <= 10) {
			nota = "A";
			def = "Aprovado";
		}
		JOptionPane.showInternalMessageDialog(null, "A média do aluno: "+media
				+ "\nA primeira nota:  "+ nota1Db
				+ "\nA segunda nota: " + nota2Db
				+ "\nO aluno receneu nota: "+ nota
				+ "\nO aluno está "+ def);
	}

}
//14.Faça um programa que lê as duas notas parciais obtidas por um aluno 
//numa disciplina ao longo de um semestre, e calcule a sua média. A 
//atribuição de conceitos obedece à tabela abaixo:
//o Média de Aproveitamento Conceito 
//o Entre 9.0 e 10.0 A 
//o Entre 7.5 e 9.0 B 
//o Entre 6.0 e 7.5 C 
//o Entre 4.0 e 6.0 D 
//o Entre 4.0 e zero E
//O algoritmo deve mostrar na tela as notas, a média, o conceito 
//correspondente e a mensagem “APROVADO” se o conceito for 
//A, B ou C ou “REPROVADO” se o conceito for D ou E.
