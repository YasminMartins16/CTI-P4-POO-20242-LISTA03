package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		
		do {
			System.out.println("Digite o valor de a: ");
			a = sc.nextInt();
		} while (a <= 1);
			System.out.println("Digite o valor de b: ");
			b = sc.nextInt();
			System.out.println("Digite o valor de c: ");
			c = sc.nextInt();
			result = divisores(a, b,c);
			System.out.println("Soma dos divisores: " + result);
	}
	public static int divisores(int a, int b, int c) {
		int s = 0;
		int r;
		
		for (int i = b; i <= c; i++) {
			r = i % a;
			if (r == 0) {
				s += i;
			}
		}
		return s;
	}

}
