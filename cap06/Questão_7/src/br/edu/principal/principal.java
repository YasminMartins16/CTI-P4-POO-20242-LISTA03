package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[8];
		int i = 1, j, z, aux;
		while(i <= 8) {
			System.out.println("Digite um número: ");
			aux = sc.nextInt();
			j = 0;
			while (j < i && vet[j] < aux) {
                j++;
			}
			 z = i - 1;
	         while (z >= j) {
	            vet[z + 1] = vet[z];
	            z--;
	            }
	        vet[j] = aux;
	        i++;
		}
	    for (i = 0; i < 8; i++) {
	    	System.out.print(vet[i] + " ");
	        }
	}

}
