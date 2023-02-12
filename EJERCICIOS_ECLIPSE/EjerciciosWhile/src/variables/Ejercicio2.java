package variables;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "STEPHANIE";
		String palindroma = "";
		int i = palabra.length()-1;
		while(i>=0) {
			palindroma = palindroma + palabra.charAt(i);
			System.out.println(" "+palindroma);
			i--;
		}
		if(palindroma.equals(palabra)) {
			System.out.println("Es palindroma");
		}
		else {
			System.out.println("No es palindroma");
		}
		
	}

}
