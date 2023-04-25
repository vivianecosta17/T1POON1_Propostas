package Questao_9;

import java.util.Scanner;

public class AreaTrapezio {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Digite o valor da base maior: ");
	double baseMaior = input.nextDouble();

	System.out.print("Digite o valor da base menor: ");
	double baseMenor = input.nextDouble();

	System.out.print("Digite o valor da altura: ");
	double altura = input.nextDouble();

	double area = ((baseMaior + baseMenor) * altura) / 2;

	System.out.println("A área do trapézio é: " + area);
    }
}