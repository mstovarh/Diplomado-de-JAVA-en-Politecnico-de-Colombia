package variables;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = 3;
		switch(type) {
		case 0:
			System.out.println("ERROR");
		break;
		case 1:
			System.out.println("Agua");
		break;
		case 2:
			System.out.println("Gasolina");
		break;
		case 3:
			System.out.println("Hormigon");
		break;
		default:
			System.out.println("No existe un valo valido");
		}
	}

}
