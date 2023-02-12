package Variables;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 21;
		int b = 24;
		int c = 26;
		if(a>b && a>c) {
			System.out.println(+a);
		}
		else if(b>a && b>c) {
			System.out.println(+b);
		}
		else if(c>a && c>b) {
			System.out.println(+c);
		}
		else {
			System.out.println("son iguales");
		}
	}

}
