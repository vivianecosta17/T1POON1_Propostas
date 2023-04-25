package Questao_14;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraIdade {
    public static void main(String[] args) {
    	int anoNascimento = 1990;
    	int anoAtual = LocalDate.now().getYear();
		        
    	int idadeEmAnos = anoAtual - anoNascimento;
		        
    	LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1); 
    	Period periodo = Period.between(dataNascimento, LocalDate.now());
    	int idadeEmMeses = periodo.getYears() * 12 + periodo.getMonths();
    	int idadeEmDias = periodo.getDays();
		        
    	int idadeEmSemanas = idadeEmDias / 7;
		        
    	System.out.println("Idade em anos: " + idadeEmAnos);
    	System.out.println("Idade em meses: " + idadeEmMeses);
    	System.out.println("Idade em dias: " + idadeEmDias);
    	System.out.println("Idade em semanas: " + idadeEmSemanas);
    }
}