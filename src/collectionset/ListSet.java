package collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ListSet {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			HashSet<Integer> numeros = new HashSet<Integer>();
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite um número: ");
				numeros.add(leia.nextInt());
			}
			
			Iterator<Integer> iNumeros = numeros.iterator();
			
			while (iNumeros.hasNext()) {
				System.out.println(iNumeros.next());
			}
			
			leia.close();

	}

}
