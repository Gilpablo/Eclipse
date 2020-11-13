import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		
		int producto, num1, num2, num3, suma;
		
		System.out.println("Dime el primer número");
		num1=leer.nextInt();
		
		System.out.println("Dime el segundo número");
		num2=leer.nextInt();
		
		System.out.println("Dime el tercer número");
		num3=leer.nextInt();
		
		producto=num1*num2*num3;
		suma=num1+num2+num3;
		
		if (num1<0) {
			System.out.println("El producto de los tres numeros es " + producto );
		}else {
			System.out.println("La suma de los tres numeros es " + suma);
		}

	}

}
