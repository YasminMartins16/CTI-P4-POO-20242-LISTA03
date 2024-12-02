package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco_antigo, preco_atual, acrescimo;
		
		System.out.println("Digite o preço antigo: ");
		preco_antigo = sc.nextDouble();
		System.out.println("Digite o preço atual: ");
		preco_atual = sc.nextDouble();
		acrescimo = calculo_reajuste(preco_antigo, preco_atual);
		System.out.println("O aumento percentual foi: " + acrescimo + " %.");
	}
	public static double calculo_reajuste(double preco_antigo, double preco_atual) {
		double result;
		
		result = (100 * (preco_atual - preco_antigo)) / preco_antigo;
		return result;
	}

}
