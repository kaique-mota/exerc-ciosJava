package exerc�cios;

import java.util.Scanner;

public class exerc�cio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Digite o custo de f�brica: ");
		custoFabrica = entrada.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.println("Custo ao consumidor: " + custoConsumidor);
	}
}
