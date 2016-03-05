package br.org.catolicasc.richard.Lista02;

import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int contador;
		int eleito, aux;
		int elementos[] = new int[5];
		int subContador;
		long quantidadeTrocas = 0;
		
		elementos[0] = 50000;
		elementos[1] = 100000;
		elementos[2] = 400000;
		elementos[3] = 600000;
		elementos[4] = 1000000;
		
		
		Random gerador = new Random();
	
		for (subContador = 0 ; subContador <= elementos[subContador] ; subContador++) {
			
			int numero[] = new int[elementos[subContador] + 1];
			
			System.out.println("TESTANDO COM VETOR DE: " + elementos[subContador] + " VALORES");
			
				for(contador = 0 ; contador <= elementos[subContador] ; contador++) {
					numero[contador] = gerador.nextInt(100);
				}
				
				for(contador = 1; contador <= elementos[subContador]; contador++) {
					eleito = numero[contador];
					aux = contador - 1;
					
				while( aux >= 0 && numero[aux] > eleito) {
					numero[aux + 1] = numero[aux];
					aux = aux - 1;
					quantidadeTrocas++;
				}
				numero[aux + 1] = eleito;
				}
		
				for(contador = 0; contador <= elementos[subContador]; contador++) {
					System.out.println(contador + 1 + ": número " +  numero[contador]);
				}
			}
			System.out.println("Trocou: " + quantidadeTrocas + " vezes");
		}
	}
