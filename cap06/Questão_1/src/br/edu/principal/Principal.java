package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[];
		num = new int[9];
		int i, j, cont;
		
		for(i = 1; i<9; i++) {
			System.out.print("Digite um número: ");
	        num[i] = sc.nextInt();

		}
		
		for(i = 1; i < 9; i++) {
			cont = 0;
			
			for(j = 1; j <= num[i - 1]; j++) {
				
				if(num[i-1] % j == 0) {
					cont = cont + 1;
				}
			}
			if(cont <= 2) {
				System.out.println("Número primo encontrado: " + num[i-1]);
				System.out.println(i);
			}
		}
		
		
	}

}
