package exercícios;

import java.util.Scanner;

public class exercicio1 {
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
	
	public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int anos = 0, meses, dias, idade;
     
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        System.out.println("Digite quantos meses passaram do seu aniversário: ");
        meses = entrada.nextInt();
        
        System.out.println("Digite a quantidade de dias: ");
        dias = entrada.nextInt();
        
        idade = anos * 365 + meses * 30 + dias; 
        		System.out.println("A sua idade é: " + idade);
	}

}
