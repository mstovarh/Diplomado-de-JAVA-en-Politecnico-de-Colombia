package Variables;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int np = 12;
		int nc = 90;
		int p = nc*(100/12);
		System.out.println(+p);
		if(p<50) {
			System.out.println("FBRA");
		}
		else if(p>=50 && p<75){
			System.out.println("Regular");
		}
		else if(p>=75 && p<90) {
			System.out.println("Medio");
		}
		else if(p>=90) {
			System.out.println("Maximo");
		}
	}

}
