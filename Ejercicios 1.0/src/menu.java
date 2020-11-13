import java.util.Scanner;

public class menu {

	public static int pintaMenu() {
		int opc = -1;
		Scanner leer = new Scanner(System.in);

		while (opc < 1 || opc > 3) {

			System.out.println("1-Hola");
			System.out.println("2-Si");
			System.out.println("3-Salir");
			System.out.println("----------");
			System.out.println("Dime una opción");

			opc = leer.nextInt();

		}
		return opc;
	}

	public static void main(String[] args) {
		int opc=0;
		
		do {
			opc = pintaMenu();
			switch (opc) {
			case 1:
				System.out.println("Opción 1- Hola");
				break;
			case 2:
				System.out.println("Opción 2- Si");
				break;
			case 3:
				System.out.println("Opción salir");
				break;
			}
		}while(opc!=3);
		
		
		
		
		}
	}


