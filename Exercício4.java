package exerc�cios;

import java.util.Scanner;

public class Exerc�cio4 {
/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:
D= R + S / 2 , onde: R= (A+B)� S= (B+C)�*/

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
	
	    System.out.println("O resultado da express�o �: " + d);
	}
}
