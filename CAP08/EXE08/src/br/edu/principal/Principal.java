package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f;
		
		System.out.println("Digite a hora inicial: ");
		hora_i = sc.nextInt();
		System.out.println("Digite o minuto inicial: ");
		min_i = sc.nextInt();
		System.out.println("Digite a hora final: ");
		hora_f = sc.nextInt();
		System.out.println("Digite o minuto final: ");
		min_f = sc.nextInt();
		
		int minutos = calculo(hora_i, min_i, hora_f, min_f);
		System.out.println("Total de minutos: " + minutos);
	}
	public static int calculo(int h_i, int m_i, int h_f, int m_f) {
		int tot_h, tot_m, total;
		
		if (m_f < m_i) {
			m_f += 60;
			h_f -= 1;
		}
		if (h_f < h_i) {
			h_f += 24;
		}
		tot_m = m_f - m_i;
		tot_h = h_f - h_i;
		total = tot_h * 60 + tot_m;
		
		return total;
		
	}
}
