

import java.util.Scanner;

import forma.Circulo;
import forma.Retangulo;
import forma.Trapezio;
import forma.Triangulo;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===== Euclides v1 ======");
		System.out.println("");
		do {
		System.out.println("Escolha a figura para calcular: (retangulo, triangulo, circulo, trapezio)");
		String inputPergunta = scanner.nextLine();
		
			switch (inputPergunta) {
			case "retangulo":
				
				System.out.println(" Digite a base: ");
				String inputBaseR = scanner.nextLine();
				// int baseR = Integer.valueOf(inputBaseR);

				System.out.println(" Digite a altura: ");
				String inputAlturaR = scanner.nextLine();
				// int alturaR = Integer.valueOf(inputAlturaR);
				Retangulo retangulo = new Retangulo(Integer.valueOf(inputAlturaR), Integer.valueOf(inputBaseR));
				System.out.println("");
				System.out.println(" Area: " + retangulo.calcAreaRetangulo());
				System.out.println(" Perimetro: " + retangulo.calcPerimRetangulo());
				System.out.println("");
				System.out.println("Digite s para continuar");
				break;
			case "triangulo":
				System.out.println(" Digite a base: ");
				String inputBaseT = scanner.nextLine();

				System.out.println(" Digite a altura: ");
				String inputAlturaT = scanner.nextLine();

				System.out.println(" Lado1: ");
				String inputLado1 = scanner.nextLine();

				System.out.println(" Lado2: ");
				String inputLado2 = scanner.nextLine();

				System.out.println(" Lado3: ");
				String inputLado3 = scanner.nextLine();

				Triangulo triangulo = new Triangulo(Integer.valueOf(inputBaseT), Integer.valueOf(inputAlturaT), Integer.valueOf(inputLado1), Integer.valueOf(inputLado2), Integer.valueOf(inputLado3));
				
				System.out.println("");

				System.out.println(" Area: " + triangulo.calcArea());
				System.out.println(" Perimetro: " + triangulo.calcPerim());
				System.out.println("");
				System.out.println("Digite s para continuar: ");
				break;
			case "circulo":
				System.out.println(" Digite o raio: ");
				String inputRaio = scanner.nextLine();
				System.out.println("");

				Circulo circulo = new Circulo(Double.valueOf(inputRaio));
				
				System.out.println(" Area: " + circulo.calcArea());
				System.out.println(" Perimetro: " + circulo.calcPerimetro());
				System.out.println("");
				System.out.println("Digite s para continuar: ");
				break;
			case "trapezio":

				System.out.println(" Digite b : ");
				String inputb = scanner.nextLine();

				System.out.println(" Digite B: ");
				String inputB = scanner.nextLine();

				System.out.println(" Digite h: ");
				String inputH = scanner.nextLine();

				System.out.println(" Digite l1: ");
				String inputL1 = scanner.nextLine();

				System.out.println(" Digite l2: ");
				String inputL2 = scanner.nextLine();
				System.out.println("");

				Trapezio trapezio = new Trapezio(Float.valueOf(inputb), Float.valueOf(inputB), Float.valueOf(inputL1), Float.valueOf(inputL2), Float.valueOf(inputH));
				
				System.out.println(" Area: " + trapezio.calcArea());
				System.out.println(" Perimetro: " + trapezio.calcPerimetro());
				System.out.println("");
				System.out.println("Digite s para continuar: ");
				break;
			default:
				System.out.println("==== FIM ====");
				scanner.close();

			}
			inputPergunta ="";
		} while (scanner.nextLine().equalsIgnoreCase("s"));
		System.out.println("==== FIM ====");
		scanner.close();
	}

	public static int calcAreaRetangulo(int base, int altura) {
		int areaR = base * altura;
		return areaR;
	}

	public static int calcPerimRetangulo(int base, int altura) {
		int perimetro = (base * altura) * 2;
		return perimetro;
	}

	public static double calcAreaCirculo(double raio) {
		double area = Math.PI * (raio * 2);
		return area;
	}

	public static double calcPerimCirculo(double raio) {
		double perimetro = (Math.PI * 2) * raio;
		return perimetro;
	}

	public static int calcAreaTriangulo(int base, int altura) {
		int area = (base * altura) / 2;
		return area;
	}

	public static int calcPerimTriangulo(int lado1, int lado2, int lado3) {
		int perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}

	public static int calcAreaTrapezio(int baseMenor, int baseMaior, int altura) {
		int area = ((baseMenor + baseMaior) / 2) * altura;
		return area;
	}

	public static int calcPerimTrapezio(int baseMaior, int baseMenor, int lado1, int lado2) {
		int perimetro = baseMaior + baseMenor + lado1 + lado2;
		return perimetro;
	}

}
