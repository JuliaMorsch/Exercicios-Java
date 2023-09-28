package lista_variaveis;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numInt = 0;

		// Solicita um número inteiro:
		do {
			System.out.println("Informe um número inteiro: ");

			// Verifica se o próximo token de entrada é um número inteiro:
			if (input.hasNextInt()) {
				numInt = input.nextInt();
				System.out.println("O número informado foi " + numInt + ".\n Seu antecessor é " + (--numInt)
						+ ".\n Seu sucessor é " + (++numInt + 1) + ".");
			} else {
				// Limpar o buffer de entrada:
				input.nextLine();
				System.out.println("Informe um número válido! ");
				numInt = 0;
			}
		} while (numInt % 2 == 0);

	}
}
