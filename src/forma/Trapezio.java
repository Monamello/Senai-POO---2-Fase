package forma;

import java.util.Map;

public class Trapezio extends Forma implements GeometriaPlana {

	private Double baseMenor;
	private Double baseMaior;
	private Double lado1;
	private Double lado2;
	private Double altura;

	private enum Parametro {
		BASEMENOR, BASEMAIOR, LADO1, LADO2, ALTURA
	}

	public Trapezio(Double baseMenor, Double baseMaior, Double lado1, Double lado2, Double altura) {
		super(TipoForma.TRAPEZIO);
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	public Trapezio() {
		super(TipoForma.TRAPEZIO);
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
		return "Perimetro: " + getPerimetro() + "\n " + "Area: " + getArea();
	}

	@Override
	public String[] getParametros() {
		String[] parametro = {
				Parametro.BASEMENOR.name(),
				Parametro.BASEMAIOR.name(),
				Parametro.LADO1.name(),
				Parametro.LADO2.name(),
				Parametro.ALTURA.name()
		};
		return parametro;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.altura = args.get(Parametro.ALTURA.name());
		this.baseMaior = args.get(Parametro.BASEMAIOR.name());
		this.baseMenor = args.get(Parametro.BASEMENOR.name());
		this.lado1 = args.get(Parametro.LADO1.name());
		this.lado2 = args.get(Parametro.LADO2.name());
	}

}
