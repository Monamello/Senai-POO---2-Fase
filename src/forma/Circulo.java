package forma;

public class Circulo implements GeometriaPlana{

	private double raio;

	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return this.raio;
	}
	
	@Override
	public double getArea() {
		return Math.PI * (this.raio * 2);
	}

	@Override
	public double getPerimetro() {
		return (Math.PI * 2) * this.raio;
	}

	@Override
	public String exibirCalculo() {
		return  "Perimetro: " + getPerimetro()+ "\n " + "Area: " + getArea();		
	}
	
}
