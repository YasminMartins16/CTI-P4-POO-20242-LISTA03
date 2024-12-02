package br.edu.principal;

import java.util.Scanner;

public class principal {

	public principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[];
		x = new int[10];
		int y[];
		y = new int[10];
		int u[];
		u = new int[20];
		int d[];
		d = new int[20];
		int s[];
		s = new int[20];
		int p[];
		p = new int[20];
		int it[];
		it = new int[20];
		int i, j, k,cont_u, cont_d, cont_i;
		
		for(i = 0; i < 10; i++) {
			System.out.print("Digite números para o vetor x[" +(i + 1) +"]: ");
	        x[i] = sc.nextInt();
	        System.out.print("Digite números para o vetor y[" +(i + 1) +"]: ");
	        y[i] = sc.nextInt();
		}
		cont_u = 1;
		cont_d = 1;
		cont_i = 1;
		
		for(i = 0; i < 10; i++) {
			j = 0;
			while(j < cont_u && x[i] != u[j]) {
				j = j + 1;
			}
			if(j >= cont_u) {
				u[cont_u -1] = x[i];
				cont_u = cont_u + 1;
			}
		}
			for(i = 0; i<10; i++) {
				j = 0;
				while(j < cont_u && y[i] != u[j]) {
					j = j + 1;
				}
				if(j >= cont_u) {
					u[cont_u -1] = y[i];
					cont_u = cont_u + 1;
		}
			}
	   for(i = 0; i < cont_u - 1; i++ ) {
		   System.out.println("u[" + (i + 1) + "] = " + u[i]);
	   }
	   for(i = 0; i < 10; i++ ) {
		   j = 0;
			while(j < 10 && x[i] != y[j]) {
				j = j + 1;
			}
			if(j >= 10) {
				k = 0;
				while(k < cont_d && x[i] != d[k]) {
					k = k + 1;
				}
				if(k >= cont_d) {
					d[cont_d -1] = x[i];
					cont_d = cont_d + 1;
				}
			}
	   }
	   for(i = 0; i < cont_d - 1; i++) {
		   System.out.println("d[" + (i + 1) + "] = " + d[i]);
	   }
	   for(i = 0; i < 10; i++ ) {
		   s[i] = x[i] + y[i];
		   p[i] = x[i] * y[i];
	   }
	   for(i = 0; i < 10; i++ ) {
		   System.out.println("s[" + (i + 1) + "] = " + s[i]);
	   }
	   for(i = 0; i < 10; i++ ) {
		   System.out.println("p[" + (i + 1) + "] = " + p[i]);
	   }
	   for(i = 0; i < 10; i++ ) {
		   j = 0;
		   while(j < 10 && x[i] != y[j]) {
				j = j + 1;
			}
		   if(j < 10) {
				k = 0;
				while(k < cont_i && it[k] != x[i]) {
					k = k + 1;
				}
				if(k >= cont_i) {
					it[cont_i -1] = x[i];
					cont_i = cont_i + 1;
				}
		   }
		}
	   for(i = 0; i < cont_i - 1; i++ ) {
		   System.out.println("it[" + (i + 1) + "] = " + it[i]);;
	   }
	}

	}

