package forma;

public class Retangulo implements GeometriaPlana{

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
	
	@Override
	public double getArea() {
		int area = this.base * this.altura;
		return area;
	}

	@Override
	public double getPerimetro() {
		int perimetro = (this.base * this.altura) * 2;
		return perimetro;
	}

	@Override
	public String exibirCalculo() {
		return  "Perimetro: " + getPerimetro()+ "\n " + "Area: " + getArea();		
	}
	
	
	
}
