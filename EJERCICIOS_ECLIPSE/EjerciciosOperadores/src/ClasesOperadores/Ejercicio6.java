package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ladoCuadrado = 8;
		int perimetroC = 4*ladoCuadrado;
		int areaC = ladoCuadrado*ladoCuadrado;
		System.out.println("El resultado del Pc es: " +perimetroC);
		System.out.println("El resultado del Ac es: " +areaC);
		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;
		int perimetroT = baseTriangulo+ladoUnoTriangulo+ladoDosTriangulo;
		int areaT = (baseTriangulo*alturaTriangulo)/2;
		System.out.println("El resultado del Pt es: " +perimetroT);
		System.out.println("El resultado del At es: " +areaT);
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		int perimetroR = 2*baseRectangulo+2*alturaRectangulo;
		int areaR = baseRectangulo*alturaRectangulo;
		System.out.println("El resultado del Pr es: " +perimetroR);
		System.out.println("El resultado del Ar es: " +areaR);
	}

}
