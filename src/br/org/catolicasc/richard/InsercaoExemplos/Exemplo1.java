package br.org.catolicasc.richard.InsercaoExemplos;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int x[] = new int[5];
		int i, j, eleito;
		
		for(i = 0; i <= 4; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			x[i] = in.nextInt();
		}
		for(i = 1; i <= 4; i++) {
			eleito = x[i];
			j = i - 1;
			
			while( j >= 0 && x[j] > eleito) {
				x[j + 1] = x[j];
				j = j - 1;
			}
			x[j + 1] = eleito;
		}
		
		for(i = 0; i <= 4; i++) {
			System.out.println(i + 1 + " número " +  x[i]);
		}
	}
}
