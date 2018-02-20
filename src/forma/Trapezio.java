package forma;

public class Trapezio {
	
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
	
	public float calcArea(){
		return ((this.baseMenor + this.baseMaior) / 2) * this.altura;
	}
	
	public float calcPerimetro(){
		return this.baseMaior + this.baseMenor + this.lado1 + this.lado2;
	}
	
}
