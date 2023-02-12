package variables;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 8;
		double num2 = 3;
		if(num1<num2) {
			double pot1 = Math.pow(num2, num1);
			System.out.println(+pot1);
		}
		else if(num1>num2) {
			double pot2 =  Math.pow(num1, num2);
			System.out.println(+pot2);
		}
		else {
			System.out.println("ERROR: Son iguales");
		}
	}

}
