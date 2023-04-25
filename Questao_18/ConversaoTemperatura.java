package Questao_18;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();

		double fahrenheit = (180 * (celsius + 32)) / 100.0;
		
		System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit.\n", celsius, fahrenheit);

		entrada.close();
	}
}