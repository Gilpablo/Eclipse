import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int menor=0;
		int mayor=0;
		int num=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero");
		num = leer.nextInt();
		mayor = num;
		menor = num;
		while (num!=0) {
			System.out.println("Dime un numero");
			num = leer.nextInt();
			if (num!=0) {
				if (num>mayor) {
					mayor = num;
				}
				if (num< menor) {
					menor= num;
				}
			}
			
		
		}
		
		System.out.println("El mayor es " + mayor + " y el menor " + menor);
		
	}

}