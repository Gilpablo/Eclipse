import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		float vNumeros[] = new float[10];
		Scanner leer = new Scanner(System.in);
		Random azar = new Random();
		float suma = 0;
		
		for (int i = 0; i < vNumeros.length; i++ ) {
			vNumeros[i] = azar.nextInt(10);
			System.out.print(vNumeros[i] + " - ");
			suma = suma + vNumeros[i];
		}
		
		System.out.println("\nLa suma es "+ suma + " La media es: " + (suma/vNumeros.length));

	}

}