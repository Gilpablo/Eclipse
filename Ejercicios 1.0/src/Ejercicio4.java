import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Dime el primer número");
		num1=leer.nextInt();
		
		System.out.println("Dime el segundo número");
		num2=leer.nextInt();
		
		System.out.println("Dime el tercer número");
		num3=leer.nextInt();
		
		if (num1>num2 && num1>num3) {
		System.out.println("El mayor es el " + num1);
		}else {
			if (num2>num1 && num2>num3) {
			System.out.println("El mayor es el " + num2);
		}else {
			if (num3>num1 && num3>num2)
				System.out.println("El mayor es el " + num3);
			else
			System.out.println("Los numeros son iguales");
		
		}
		}
	}
}
	

	



