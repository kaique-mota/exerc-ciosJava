package exercícios;

import java.util.Scanner;

public class Exercício4 {
/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
D= R + S / 2 , onde: R= (A+B)² S= (B+C)²*/

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c, r, s, d;
		
		System.out.println("Digite o valor de a: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de c: ");
		c = entrada.nextInt();
		
		r= Math.pow(a + b, 2);
		s= Math.pow(b + c, 2);
		
	    d= (r + s) / 2;
	
	    System.out.println("O resultado da expressão é: " + d);
	}
}
