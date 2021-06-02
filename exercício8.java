package exercícios;

import java.util.Scanner;

public class exercício8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = entrada.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.println("Custo ao consumidor: " + custoConsumidor);
	}
}
