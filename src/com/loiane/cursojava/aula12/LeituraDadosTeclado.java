package com.loiane.cursojava.aula12;

import java.util.Scanner; // Importação de Biblioteca

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		
		
		Scanner scanVariaveis = new Scanner (System.in); // importação de metodo Scanner
		
		
		System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = scanVariaveis.nextLine ();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		
		
		System.out.println ("Digite seu Primeiro Nome, sua altura, sua idade, Digite a quantidade de filho: Você está trabalhando");
		
		
		
		String primeiroNome = scanVariaveis.next ();
		double altura = scanVariaveis.nextDouble(); // utiliza virgula
		int idade = scanVariaveis.nextInt();
		byte filhos = scanVariaveis.nextByte();
		boolean temTrabalho = scanVariaveis.nextBoolean();
		
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("Sua altura é: " + altura);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Você tem " + filhos + " filho!");
		System.out.println("Está trabalhando: "+ temTrabalho);
		
		

	}

}
