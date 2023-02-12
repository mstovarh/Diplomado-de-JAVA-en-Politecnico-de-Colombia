package variables;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		double suma = 0;
		long fact = 1;
		int s = 0;
		for(int i=1; i<=n; i++) {
			suma = suma + i;
		}
		System.out.println("Suma: "+suma);
		System.out.println("Divisores");
		for(int j=1; j<suma; j++) {
			fact = fact*j;
			if(suma%j==0) {
				System.out.println(+j);
				s = s + j;
			}
		}
		System.out.println("Factorial: "+fact);
		double Raiz = Math.sqrt(suma);
		double na = suma*Math.random();
		System.out.println("Raiz de la suma: "+Raiz);
		System.out.println("Numero aleatorio entre 0 y "+suma+" es: "+na);
		System.out.println("La suma de todos sus multiplos da: " +s+ " Es un numero perfecto: " +suma);
	}

}
