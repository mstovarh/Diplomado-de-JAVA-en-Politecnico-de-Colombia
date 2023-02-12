package variables;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10*Math.random();
		System.out.println(+x);
		if(x>=0 && x<=6) {
			System.out.println("perdió");
		}
		else if(x>=7 && x<=10) {
			System.out.println("aprobó");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
