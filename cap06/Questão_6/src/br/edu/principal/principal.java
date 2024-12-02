package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[10];
		int i, j, aux;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Digite 10 números: ");
			vet[i] = sc.nextInt();
			
			for(j = 1; j <= 9; j++) {
				
				if(vet[j] < vet[j+1]) {
					
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
	for(i = 1; i <= 10; i++) {
		
		System.out.println(vet[i]);
	}

	}

}
