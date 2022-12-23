package calculadoraDeNumerosPrimos;

public class GeraNumerosPrimos {

	public static void main(String[] args) {
		int score = 0, i = 0;
		int numero = 1;
		
		for(i = 0; i < numero; i++) {
		
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
				System.out.println(numero);
			}
			score = 0;
			numero++;
		}
	}

}
