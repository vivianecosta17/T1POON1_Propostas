package Questao_22;

import java.util.Scanner;

public class NumeroDiagonais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de lados do polígono: ");
		int nLados = input.nextInt();

		int nDiagonais = nLados * (nLados - 3) / 2;

		System.out.println("O número de diagonais do polígono é: " + nDiagonais);
	}
}