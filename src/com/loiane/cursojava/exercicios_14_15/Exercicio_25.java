package com.loiane.cursojava.exercicios_14_15;

import javax.swing.JOptionPane;

public class Exercicio_25 {

	public static void main(String[] args) {
		char [] asks = new char [5];
		String resposta1;
		char resp;
		 
		resposta1 = JOptionPane.showInputDialog(null, "Telefonou para a vítima?\n 'S' ou 'N'");
		resp = Character.toUpperCase(resposta1.charAt(0));
		asks[0] = resp;
		
		resposta1 = JOptionPane.showInputDialog(null, "Esteve no local do crime?\n 'S' ou 'N'");
		resp = Character.toUpperCase(resposta1.charAt(0));
		asks[1] = resp;
		
		resposta1 = JOptionPane.showInputDialog(null, "Mora perto da vítima?\n 'S' ou 'N'"); 
		resp = Character.toUpperCase(resposta1.charAt(0));
		asks[2] = resp;
		
		resposta1 = JOptionPane.showInputDialog(null, "Devia para a vítima?\n 'S' ou 'N'");
		resp = Character.toUpperCase(resposta1.charAt(0));
		asks[3] = resp;
		
		resposta1 = JOptionPane.showInputDialog(null, "Já trabalhou com a vítima?\n 'S' ou 'N'"); 
		resp = Character.toUpperCase(resposta1.charAt(0));
		asks[4] = resp;
		
		interrogatorioPolicial(asks);
		

	}
	public static void interrogatorioPolicial(char [] quest)
	{
		char [] asks = quest; 
		int respostas = 0;
		String veredito;
		for(char ask: asks)
		{
			if('S' == (ask))
			{
				respostas++;
			}
			else continue;
		}
		switch (respostas) 
		{
			case 2: {
				veredito = "Suspeito!";
				JOptionPane.showMessageDialog(null, "De acondo com a investigação\nO seu veredito foi ...");
				break;
	
			}
			case 3: {
			}
			
			case 4: {
				veredito = "Cumplice!";
				JOptionPane.showMessageDialog(null, "De acondo com a investigação\nO seu veredito foi ...");
				break;
			}
			
			case 5: {
				veredito = "Assassino!";
				JOptionPane.showMessageDialog(null, "De acondo com a investigação\nO seu veredito foi ...");
				break;
			}
			
			default:
				veredito = "Inocente!";
				JOptionPane.showMessageDialog(null, "De acondo com a investigação\nO seu veredito foi ...");
				break;
		}
		JOptionPane.showMessageDialog(null, veredito);

	}

}
//25.Faça um programa que faça 5 perguntas para uma pessoa sobre um 
//crime. As perguntas são:
//. "Telefonou para a vítima?"
//a. "Esteve no local do crime?"
//b. "Mora perto da vítima?"
//c. "Devia para a vítima?"
//d. "Já trabalhou com a vítima?" O programa deve no final emitir 
//uma classificação sobre a participação da pessoa no crime. Se 
//a pessoa responder positivamente a 2 questões ela deve ser 
//classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 
//como "Assassino". Caso contrário, ele será classificado como 
//"Inocente".
