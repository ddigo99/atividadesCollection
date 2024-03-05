package atividadecollectionlistacolors;

import java.util.ArrayList;
import java.util.Scanner;

public class ListColor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<String> colors = new ArrayList<String>();

		while (colors.size() < 5) {
			System.out.println("Escreva o nome de uma cor para adicionar à lista:");
			colors.add(leia.nextLine());
		}

		System.out.println("Listar todas as colors:");

		for (String cor : colors)
			System.out.println(cor);

		System.out.println("Ordenar as colors:");
		colors.sort(null);

		for (String cor : colors)
			System.out.println(cor);

		leia.close();

	}

}
