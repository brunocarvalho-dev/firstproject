package com.loiane.cursojava.exercicios_16_17;

import javax.swing.JOptionPane;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		String name = Name();
		int age = Age();
		char sex = Sex();
		String maritalStatus = MaritalStatus();
		
		JOptionPane.showMessageDialog(null, "Nome: " + name + "\n"
											+ "Idade: " + age + "\n"
											+ "Sexo: : " + sex + "\n"
											+ "Estado Civil: " + maritalStatus+ "\n");

	}
	public static String Name() 
	{
		String nome = "";
		do
		{
			nome = JOptionPane.showInputDialog("Digite seu nome");
			nome = nome.toUpperCase();
			if(nome.length() < 3)
			{
				JOptionPane.showMessageDialog(null, "Nome não pode ter menos que 3 letras");
			}
			else
			{
				break;
			}
		}while (true);
		
		return nome;
	}

	public static int Age() 
	{
		int age =0;
		do
		{
			age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			
			if((age < 0) || (age > 150))
			{
				JOptionPane.showMessageDialog(null, "Idade não pode ser menor que 0 nem maior que 150");
			}
			else
			{
				break;
			}
	}while (true);
		
		return age;
	}

	public static char Sex() 
	{
		String sex;
		boolean validation = true;
		do
		{
	
			sex = JOptionPane.showInputDialog("Digite seu sexo\nM - Masculino\n\nF - Feminino");
			sex = sex.valueOf(sex.charAt(0));
			sex = sex.toUpperCase();
			switch(sex)
			{
				case "M": 
				{
					sex = "MASCULINO";
					validation = false;
					break;
				}
				case "F":
				{
					sex = "FEMININO";
					validation = false;
					break;
				}
				default:
				{
					JOptionPane.showMessageDialog(null, "Valor inválido, digite seusexo novamente");
				}
				break;
			}
		}while (validation);
			
		Character sexChar = (sex.charAt(0));
		return sexChar;
	}

	public static String MaritalStatus() 
	{
		String maritalStatus = "";
		boolean validation = true;
		do
		{
			maritalStatus = JOptionPane.showInputDialog("Digite seu estado civil\n\nS - Solteiro \nC - Casado \nV - Viúvo \nD -Divorciado");
			maritalStatus = maritalStatus.valueOf(maritalStatus.charAt(0));

			maritalStatus = maritalStatus.toUpperCase();
			
			switch (maritalStatus) 
			{
			case "S": 
			{
				maritalStatus = "SOLTEIRO";
				validation = false;
				break;
			}
			case "C":
			{
				maritalStatus = "CASADO";
				validation = false;
				break;
			}
			case "V": 
			{
				maritalStatus = "VIÚVO";
				validation = false;
				break;
			}
			case "D":
			{
				maritalStatus = "DIVORCIADO";
				validation = false;
				break;
			}
				default:
				{
					JOptionPane.showMessageDialog(null, "Valor inválido, digite seusexo novamente");
				}
		
			}
		}while (validation);
		
		return maritalStatus;
	}
}

/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
*/