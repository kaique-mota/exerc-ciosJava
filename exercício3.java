package exercícios;

import java.util.Scanner;

public class exercício3 {
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int segundos, minutos, horas;
		
		System.out.println("Digite o tempo em segundos: ");
		segundos = entrada.nextInt();
		
		minutos = segundos / 60;
		horas = segundos * 60;
		
		System.out.println("O tempo total do evento é de " + horas + " horas " + minutos + " minutos " + "e " + segundos + " segundos");
	}
}
