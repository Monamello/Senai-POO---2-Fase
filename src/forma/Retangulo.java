package forma;

import java.util.Map;

public class Retangulo extends Forma implements GeometriaPlana{

	private Double altura;
	private Double base;
	private enum Parametro {ALTURA, BASE}
	
	public Retangulo(){
		super(TipoForma.RETANGULO);
	}
	
	public Retangulo(Double altura, Double base) {
		super(TipoForma.RETANGULO);
		this.altura = altura;
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public Double getBase() {
		return base;
	}
	
	@Override
	public double getArea() {
		Double area = this.base * this.altura;
		return area;
	}

	@Override
	public double getPerimetro() {
		Double perimetro = (this.base * this.altura) * 2;
		return perimetro;
	}

	@Override
	public String exibirCalculo() {
		return  "Perimetro: " + getPerimetro()+ "\n " + "Area: " + getArea();		
	}

	@Override
	public String[] getParametros() {
		String[] parametro = {Parametro.BASE.name(),Parametro.ALTURA.name()};
		return parametro;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.base = args.get(Parametro.BASE.name());
		this.altura = args.get(Parametro.ALTURA.name());
		
	}
	
	
	
}
