package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		maior_menor();
	}
	public static void maior_menor() {
		Scanner sc = new Scanner(System.in);
		int i, num, maior = 0, menor = 0;
		
		for (i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + " º número");
			num = sc.nextInt();
			
			if (i == 1) {
				maior = num;
				menor = num;
			} else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
	}
}
