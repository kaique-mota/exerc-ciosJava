package exerc�cios;

import java.util.Scanner;

public class exerc�cio3 {
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int segundos, minutos, horas;
		
		System.out.println("Digite o tempo em segundos: ");
		segundos = entrada.nextInt();
		
		minutos = segundos / 60;
		horas = segundos * 60;
		
		System.out.println("O tempo total do evento � de " + horas + " horas " + minutos + " minutos " + "e " + segundos + " segundos");
	}
}
