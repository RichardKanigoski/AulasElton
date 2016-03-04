package br.org.catolicasc.richard.Lista02;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			
			int numero[] = new int[15];
			int contador;
			int menorNumero = 9999;
			int eleito, aux, quantidadePassada = 0;
			
		for(contador = 0 ; contador <= 14 ; contador++) {
			System.out.print("Digite o " + (contador + 1) + " número: ");
			numero[contador] = leitor.nextInt();
		}
		
		for(contador = 0 ; contador <= 14 ; contador++) {
			if (numero[contador] <= menorNumero) {
				menorNumero = numero[contador];
			}
		}
			
		for(contador = 1; contador <= 14; contador++) {
			eleito = numero[contador];
			aux = contador - 1;
			
			if(numero[contador] == menorNumero) {
				quantidadePassada++;
			}
			
		while( aux >= 0 && numero[aux] > eleito) {
			numero[aux + 1] = numero[aux];
			aux = aux - 1;
		}
		numero[aux + 1] = eleito;
		}

		for(contador = 0; contador <= 14; contador++) {
			System.out.println(contador + 1 + " número " +  numero[contador]);
		}
		
		System.out.println("Menor Numero: " + menorNumero + " passou " + quantidadePassada + " vezes");
	}
}
