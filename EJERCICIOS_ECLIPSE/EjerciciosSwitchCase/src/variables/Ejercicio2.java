package variables;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Signo = '.';
		int a = 2;
		int b = 8;
		switch(Signo) {
		case '+':
			int r1 = a + b;
			System.out.println("Suma: " +r1);
		break;
		case '-':
			int r2 = a - b;
			System.out.println("Resta: " +r2);
		break;
		case '*':
			int r3 = a * b;
			System.out.println("Multiplicacion: " +r3);
		break;
		case '/':
			int r4 = a / b;
			System.out.println("Division: " +r4);
		break;
		case '.':
			int r5 = -a;
			System.out.println("Signo de diferencia: " +r5);
		break;
		case '%':
			int r6 = a % b;
			System.out.println("Modulo: " +r6);
		break;
		default:
			System.out.println("ERROR DE SIGNO");
		}
	}

}
