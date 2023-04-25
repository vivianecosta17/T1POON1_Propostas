package Questao_25;

import java.util.Scanner;

public class ConversaoTempo {    
	private int hora;
	private int minutos;
		    
	public ConversaoTempo(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
		    
	public int converteParaMinutos() {
		return this.hora * 60 + this.minutos;
	}
		    
	public int converteParaSegundos() {
		return this.converteParaMinutos() * 60;
		    }
		    
	public static void main(String[] args) {
		    	
		Scanner entrada = new Scanner(System.in);
		        
		System.out.print("Digite a hora: ");
		int hora = entrada.nextInt();
		        
		System.out.print("Digite os minutos: ");
		int minutos = entrada.nextInt();
		        
		ConversaoTempo ct = new ConversaoTempo(hora, minutos);
		        
		System.out.println("Hora digitada convertida em minutos: " + ct.converteParaMinutos());
		System.out.println("Total de minutos: " + ct.converteParaMinutos());
		System.out.println("Total de minutos convertidos em segundos: " + ct.converteParaSegundos());
		        
		entrada.close();
	}

}