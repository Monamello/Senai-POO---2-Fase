package forma;


public class Triangulo implements GeometriaPlana{
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int base, int altura, int lado1, int lado2, int lado3) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public int getLado3() {
		return lado3;
	}
	

	@Override
	public double getArea() {
		int area = (this.base * this.altura) / 2;
		return area;
	}

	@Override
	public double getPerimetro() {
		int perimetro = this.lado1 + this.lado2 + this.lado3;
		return perimetro;
	}

	@Override
	public String exibirCalculo() {
		return  "Perimetro: " + getPerimetro()+ "\n " + "Area: " + getArea();		
	}

}
