import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Dime el primer número");
		num1=leer.nextInt();
		
		System.out.println("Dime el segundo número");
		num2=leer.nextInt();
		
		if (num1> num2){
			System.out.println("El mayor es " + num1);
		} else {
			if (num1 < num2)
			System.out.println("El mayor es " + num2);
			else 
				System.out.println("Son iguales");
				
		}

	}

}
