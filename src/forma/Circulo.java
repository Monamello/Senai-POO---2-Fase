package forma;

import java.util.Map;

public class Circulo extends Forma implements GeometriaPlana{

	private double raio;
	private enum Parametro {RAIO}
	
	public Circulo() {
		super(TipoForma.CIRCULO);
	}				

	public Circulo(double raio) {
		super(TipoForma.CIRCULO);
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

	@Override
	public String[] getParametros() {
		String[] parametro = {Parametro.RAIO.name()};
		return parametro;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.raio = args.get(Parametro.RAIO.name());
	}
	
}
