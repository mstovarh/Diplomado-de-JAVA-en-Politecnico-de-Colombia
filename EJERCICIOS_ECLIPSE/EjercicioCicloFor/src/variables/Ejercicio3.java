package variables;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 28;   //6 28 496 8128 33550336
		int suma = 0;
		for(int i=1; i<numero; i++) {
			if(numero%i==0) {
				suma = suma + i;
			}
		}
		System.out.println("La suma de todos sus multiplos da: " +suma+ " Es un numero perfecto");
	}
}