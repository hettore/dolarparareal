package dolarparareal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double vdolar, quantidade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor insira o valor do Dólar hoje em R$: ");
		vdolar = sc.nextDouble();
		System.out.println("Por falor insira a quantidade de Dólares que você quer comprar: ");
		quantidade = sc.nextDouble();
		
		System.out.printf("Você vai precisar de R$%.2f%n", (vdolar * quantidade));
		System.out.printf("para comprar $%.2f%n", quantidade);
		
		sc.close();

	}

}
