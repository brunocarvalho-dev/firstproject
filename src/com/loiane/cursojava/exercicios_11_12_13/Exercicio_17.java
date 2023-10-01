package com.loiane.cursojava.exercicios_11_12_13;

import javax.swing.JOptionPane;

public class Exercicio_17 {

	public static void main(String[] args) {
		//Loja de Tintas
		String input = JOptionPane.showInputDialog("Digite o tamanho em metros quadrados da área a ser pintada");
		Double area = Double.parseDouble(input.replace(",","."));
		System.out.println(area);
		
		double litros = (area/6);
		
		int lataGrande = 0;
		int lataPequena = 0;
		
		for( ; litros >= 18; lataGrande++ ) {
			litros -= 18;
		}
		for( ; litros >= 3.6; lataPequena++ ) {
			litros -= 3.6;
		}
		if(litros > 0) {
			lataPequena++;
		}
		JOptionPane.showMessageDialog(null,"Orçameto Tintas\n\n"
				+ "A área total a ser pintada é :"+area+ "m²\n"
				+ "De acordo com o valor de área informado você precisa de: \n"
				+ lataGrande+ " - Latas grandes R$ 80,00 a unidade\n"
				+ lataPequena+ " - Latas pequenas 25,00 a unidade\n"
				+ "\nTOTAL - R$"+((lataGrande*80.00) + (lataPequena*25.00))+"\n"
				+ "\nValor com latas do mesmo tamanho\n"
				+ "\nLatas Grandes: R$" + ((lataGrande+1)*80.00) + "\n"
				+ "\nLatas Pequenas: R$" + ((lataGrande * 5)+(lataPequena+1))*25.00);
		
		System.out.println(lataGrande +" - " + lataPequena);
		System.out.println(litros);
	
	}

}
//.Faça um Programa para uma loja de tintas. O programa deverá pedir o 
//tamanho em metros quadrados da área a ser pintada. Considere que a 
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a 
//tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em 
//galões de 3,6 litros, que custam R$ 25,00.
//o Informe ao usuário as quantidades de tinta a serem compradas 
//e os respectivos preços em 3 situações:
//o comprar apenas latas de 18 litros;
//o comprar apenas galões de 3,6 litros;
//o misturar latas e galões, de forma que o preço seja o 
//menor. Acrescente 10% de folga e sempre arredonde os 
//valores para cima, isto é, considere latas cheias.