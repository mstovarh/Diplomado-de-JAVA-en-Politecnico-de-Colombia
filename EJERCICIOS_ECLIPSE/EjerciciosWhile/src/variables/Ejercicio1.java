package variables;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "Programacion";
		
		int i = palabra.length();
		while(i>0) {
			i--;
			System.out.println(palabra.charAt(i) + " ");
		}
	}
}
