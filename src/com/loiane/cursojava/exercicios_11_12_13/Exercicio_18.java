package com.loiane.cursojava.exercicios_11_12_13;
import javax.swing.JOptionPane;
public class Exercicio_18 {

	public static void main(String[] args) {
		/////Variaveis
		double timesForDownload = 0;
		int timeHour = 0;
		int timeMinuts = 0;
		int timeSecunds = 0;
		
		/////Dados fornecidos pelo Usuário		
		String download = JOptionPane.showInputDialog("Digite o tamanho do arquivo para download em Mb: ");
		download = download.replace(",", ".");
		Double downloadFast =  Double.valueOf(download);
		
		String link = JOptionPane.showInputDialog("Digitea velocidade de um link de Internet (em Mbps): ");
		link = link.replace(",", ".");
		Double linkFast = Double.valueOf(link);
		
		/////Conversão de valores
		timesForDownload = downloadFast/(linkFast/8);
		
		for (;timesForDownload > 3600; timeHour++, timesForDownload -=3600);
		for (;timesForDownload > 60; timeMinuts++, timesForDownload -=60);
		timeSecunds = (int)timesForDownload;
		
		/////Imprimindo na tela para o usuário
		JOptionPane.showMessageDialog(null, "Seu download terminará em:\n"
				+timeHour+"hora(s), "+timeMinuts+"minuto(s) e "+timeSecunds+"segundo(s).");

	}

}
//.Faça um programa que peça o tamanho de um arquivo para download 
//(em MB) e a velocidade de um link de Internet (em Mbps), calcule e 
//informe o tempo aproximado de download do arquivo usando este link 
//(em minutos).