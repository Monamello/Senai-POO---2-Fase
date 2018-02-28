package forma;

import java.util.Map;

public class Triangulo extends Forma implements GeometriaPlana {
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;

	private enum Parametro {
		BASE, ALTURA, LADO1, LADO2, LADO3
	};

	public Triangulo(Double base, Double altura, Double lado1, Double lado2, Double lado3) {
		super(TipoForma.TRIANGULO);
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Triangulo() {
		super(TipoForma.TRIANGULO);
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public double getLado3() {
		return lado3;
	}

	@Override
	public double getArea() {
		double area = (this.base * this.altura) / 2;
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro = this.lado1 + this.lado2 + this.lado3;
		return perimetro;
	}

	@Override
	public String exibirCalculo() {
		return "Perimetro: " + getPerimetro() + "\n " + "Area: " + getArea();
	}

	@Override
	public String[] getParametros() {
		String[]parametro={ 
				Parametro.BASE.name(),
				Parametro.ALTURA.name(),
				Parametro.LADO1.name(),
				Parametro.LADO2.name(),
				Parametro.LADO3.name()
		};
		return parametro;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.base = args.get(Parametro.BASE.name());
		this.altura = args.get(Parametro.ALTURA.name());
		this.lado1 = args.get(Parametro.LADO1.name());
		this.lado2 = args.get(Parametro.LADO2.name());
		this.lado3 = args.get(Parametro.LADO3.name());
		

	}

}
