import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println(
					"Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		a = teclado.nextInt();
		if (opcion.equals(1)) {
			resultado = a + b;
		} else if (opcion.equals(2)) {
			resultado = a - b;
		} else if (opcion.equals(3)) {
			resultado = a * b;
		} else {
			resultado = a / b;
		}
		System.out.println("El resultado es " + resultado.toString());
		
		teclado.close();
	}
}
