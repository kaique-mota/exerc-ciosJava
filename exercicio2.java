package exercícios;

import java.util.Scanner;

public class exercicio2 {
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade, dias = 0, anos = 0, meses = 0;
		
		System.out.println("Informe a sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Digite quantos dias: ");
        dias = entrada.nextInt();
        
        anos = dias / 365;
        meses = (dias%365) / 30;
        dias = (dias%365)%30;
        
        System.out.println("A idade é: " + anos + "  anos");
        System.out.println("\nmeses" + meses);
        System.out.println("\ndias" + dias);
	}
}
