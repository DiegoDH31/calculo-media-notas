package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		double nota = 0;
		int totalNotas = 0;
		double notasValidas = 0;
		double media = 0;

		while (nota != -1) {
			System.out.println("Digite as notas: ");
			nota = sc.nextDouble();

			if (nota >= 0 && nota <= 10) {
				totalNotas += nota;
				notasValidas++;
				media = totalNotas / notasValidas;
			} else if (nota > 10 || nota < -1) {
				System.out.println("Por favor digite uma nota válida " 
								+ " ou -1 para encerrar o programa!\n");
			}
		}
		System.out.println(" O total de notas é: " + totalNotas);
		System.out.println(" O total de notas válidas é: " + notasValidas);
		System.out.printf(" A média é: %.2f", media);

		sc.close();
	}
}
