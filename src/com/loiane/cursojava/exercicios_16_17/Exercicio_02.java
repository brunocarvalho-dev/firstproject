package com.loiane.cursojava.exercicios_16_17;

import javax.swing.JOptionPane;

public class Exercicio_02 {

	public static void main(String[] args) {
	String name;
	String senha;
	
	do
	{
		name = JOptionPane.showInputDialog("Digite o nome de usuário");
		name = name.toUpperCase();
		
		senha = JOptionPane.showInputDialog("Digite o nome de usuário");
		senha = senha.toUpperCase();
		
		if (name.equalsIgnoreCase(senha) || name.equalsIgnoreCase("") || senha.equalsIgnoreCase("") )
		{
			JOptionPane.showMessageDialog(null, "Senha não pode ser igual ao nome de usuario"); 
		}
		else 
		{
			break;		
		}
	}while(true);
	
	JOptionPane.showMessageDialog(null, "Nome do usuário: " + name + "\n"
										+ "Senha do usuario: " + senha);

	}

}
/*
Faça um programa que leia um nome de usuário e a sua senha e não 
aceite a senha igual ao nome do usuário, mostrando uma mensagem 
de erro e voltando a pedir as informações
*/