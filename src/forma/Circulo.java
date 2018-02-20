package forma;

public class Circulo {

	private double raio;

	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return this.raio;
	}
	
	public double calcArea(){
		return Math.PI * (this.raio * 2);
	}
	
	public double calcPerimetro(){
		return (Math.PI * 2) * this.raio;
	}
	

	
	
}
