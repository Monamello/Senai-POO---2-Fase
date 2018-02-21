package forma;

public class Trapezio implements GeometriaPlana{
	
	private float baseMenor;
	private float baseMaior;
	private float lado1;
	private float lado2;
	private float altura;
	
	public Trapezio(float baseMenor, float baseMaior, float lado1, float lado2, float altura) {
		super();
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}
	

	@Override
	public double getArea() {
		return ((this.baseMenor + this.baseMaior) / 2) * this.altura;
	}

	@Override
	public double getPerimetro() {
		return this.baseMaior + this.baseMenor + this.lado1 + this.lado2;
	}

	@Override
	public String exibirCalculo() {
		return  "Perimetro: " + getPerimetro()+ "\n " + "Area: " + getArea();		
	}
	
	
}
