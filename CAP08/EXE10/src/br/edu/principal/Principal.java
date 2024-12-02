package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite um número: ");
	     int num = sc.nextInt();
	     double s = sequencia(num);
	     System.out.println("O valor da sequência é: " + s);
	}
	public static double sequencia(int n) {
		double seq = 1.0;
		int f;
		  
		for (int a = 1; a <= n; a++) {
			f = 1;
			for (int b = 1; b <= a; b++) {
				f *= b;
			}
			seq += 1.0 / f;
		  }
		 return seq;
	 }
}