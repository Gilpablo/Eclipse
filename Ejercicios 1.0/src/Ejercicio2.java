import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		float num1, num2;
		float division;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Dime el valor del primer número");
		num1=leer.nextInt();
		
		System.out.println("Dime el valor del segundo número");
		num2=leer.nextInt();
		
		division=num1/num2;
		
		System.out.println("La suma es " + (num1+num2) +", la resta es " + (num1-num2) + 
				", el proucto es " +( num1*num2) + " y la division es " + division);
		
	}

}
