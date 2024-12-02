package br.edu.principal;

import java.util.Scanner;

public class principal {

	public principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet1[];
		vet1 = new int[10];
		int vet2[];
		vet2 = new int[10];
		int vet3[];
		vet3 = new int[20];
		int i, j, cont;
		
		j = 0;
		for(i = 0; i < 10; i++) {
			System.out.print("Digite números para o vetor 1[" +(i + 1) +"]: ");
	        vet1[i] = sc.nextInt();
	        vet3[j] = vet1[i];
	        j = j + 1;
	        
	        System.out.print("Digite números para o vetor2[" +(i + 1) +"]: ");
	        vet2[i] = sc.nextInt();
	        vet3[j] = vet2[i];
	        j = j + 1;
		}
		for(i = 0; i < 20; i++) {
			 System.out.println("vet3[" + (i + 1) + "] = " + vet3[i]);
		}
	}

}
