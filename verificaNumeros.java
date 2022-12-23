package calculadoraDeNumerosPrimos;

import java.util.Scanner;

public class verificaNumeros {

	private static Scanner scanner;

	public static void main(String[] args) {
		int score = 0;
		
		System.out.println("Digite um número: ");
		scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
	
		
		/*
		 * As linhas abaixo verificam se o numero digitado é divisível pelos respectivos numeros 2, 3, 5 e 7 e somam um score para cada numero em que o resto não for = a 0
		 * caso o numero não seja divisivel por esses numeros ele é primo.
		 * */
		
		if(numero == 1) {
			score = 4;
		}
		if(numero%2 == 0 && numero != 2) {
			
		} else {
			score++;
		}
	
		if(numero%3 == 0 && numero != 3) {
			
		} else {
			score++;
		}
		
		if(numero%5 == 0 && numero != 5) {
			
		} else {
			score++;
		}
		
		if(numero%7 == 0 && numero != 7) {
			
		} else {
			score++;
		}
		
		if(score == 4) {
			System.out.println("O número " +numero+ " é primo!");
		} else {
			System.out.println("O número "+numero+" não é primo!");
		}
		
		main(args);
	}
}
