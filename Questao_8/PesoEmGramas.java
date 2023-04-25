package Questao_8;

import java.util.Scanner;

public class PesoEmGramas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o peso em quilos: ");
		double pesoEmQuilos = input.nextDouble();

		double pesoEmGramas = pesoEmQuilos * 1000;

		System.out.println("O peso em gramas é: " + pesoEmGramas);
	}
}