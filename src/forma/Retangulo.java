package forma;

public class Retangulo {

	private int altura;
	private int base;
	
	public Retangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public int getBase() {
		return base;
	}
	
	public int calcAreaRetangulo() {
		int area = this.base * this.altura;
		return area;
	}

	public int calcPerimRetangulo() {
		int perimetro = (this.base * this.altura) * 2;
		return perimetro;
	}
	
	
	
}
