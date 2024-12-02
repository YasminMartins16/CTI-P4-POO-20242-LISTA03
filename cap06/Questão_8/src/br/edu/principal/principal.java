package br.edu.principal;

import java.util.Scanner;

public class principal {

	public principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X[];
		X = new int[5];
		int Y[];
		Y = new int[5];
		int R[];
		R = new int[10];
		int i, j, z, aux;
		
		for(i=0; i<=5; i++) {
			System.out.print("Digite números para o vetor X[" +(i + 1) +"]: ");
	        X[i] = sc.nextInt();
		}
		for(j=0; j<=4; j++) {
			if(X[j] > X[j+1]) {
				aux = X[j];
				X[j] = X[j+1];
				X[j+1] = aux;
			}
		}
		for(i=0; i<=5; i++) {
			System.out.print("Digite números para o vetor Y[" +(i + 1) +"]: ");
	        Y[i] = sc.nextInt();
			}
		for(i=0; i<=5; i++) {
			for(j=0; j<=4; j++) {
				
				if(Y[j] > Y[j+1]) {
					aux = Y[j];
					Y[j] = Y[j+1];
					Y[j+1] = aux;
				}
			}
		}
		j = 1;
		for(i=0; i<=5; i++) {
			R[j] = X[i];
			j = j + 1;
			R[j] = Y[i];
			j = j + 1;
		}
		for(i=0; i<=10; i++) {
			for(j=0; j<=9; j++) {
				if(R[j] > R[j + 1]) {
					aux = R[j];
					R[j] = R[j + 1];
					R[j + 1] = aux;
				}
			}
		}
		for(i=0; i<=5; i++) {
			System.out.print(X[i]);
		}
		for(i=0; i<=5; i++) {
			System.out.print(Y[i]);
		}
		for(i=0; i<=5; i++) {
			System.out.print(R[i]);
		}
	}

}
