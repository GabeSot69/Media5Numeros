import java.util.Scanner;

/*
	Nome: Gabriel Sotero Mendonça
	Objetivo: Faça um programa que calcule a média de 5 números inteiros dados como entrada
	 e imprima o resultado.
 */
public class Ex51 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = {0,0,0,0,0};
		double soma = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i+1) + " numero para calculo de media");
			num[i] = scanner.nextInt();
			soma += num[i];
			
		}
		double media = soma/num.length;
		System.out.println("Media: " + media);
		
	}

}
