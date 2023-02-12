package variables;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas \r\n"
				+ "risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. \r\n"
				+ "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie \r\n"
				+ "euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea \r\n"
				+ "non proin aliquet scelerisque nam maecenas elit cum.";
		int i = 0, vocales = 0;
		while(i<texto.length()) {
			if(texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u') {
				vocales++;
			}
			i++;
		}
		System.out.println(+vocales);
	}

}
