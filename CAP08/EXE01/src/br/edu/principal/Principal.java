package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
       
        System.out.print("Digite um número: ");
        num = sc.nextDouble();
        
        int x = verifica(num);

        if (x == 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
	
    public static int verifica(double num) {
        int res;
        if (num >= 0) {
            res = 1;
        } else {
            res = 0;
        }

        return res;
    }
}
