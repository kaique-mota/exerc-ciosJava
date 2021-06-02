package exercícios;

import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Insira a 1° nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Insira o 1° peso: ");
		p1 = entrada.nextDouble();
		
		System.out.println("Insira a 2° nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Insira o 2° peso: ");
		p2 = entrada.nextDouble();
		
		System.out.println("Insira a 3° nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Insira o 3° peso: ");
		p3 = entrada.nextDouble();
		
		media = (n1*p1+n2*p2+n3*p3) / (p1+p2+p3);
		
		System.out.println("A média final é: " + media);
	}
}
