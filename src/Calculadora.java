import java.util.Map;

import forma.Circulo;
import forma.Forma;
import forma.GeometriaPlana;
import forma.Retangulo;
import forma.TipoForma;
import forma.Trapezio;
import forma.Triangulo;

public class Calculadora {

	private Console console;
	
	public Calculadora(){
		this.console = new Console();
	}
	
	public void close(){
		this.console.close();
	}
	
	public void init(){
		do {
			TipoForma tipo = this.console.selecionaTipo();
			Forma forma = null;
			switch (tipo) {
			case RETANGULO:
				forma = new Retangulo();
				break;
			case CIRCULO:
				forma = new Circulo();
				break;
			case TRAPEZIO:
				forma = new Trapezio();
				break;
			case TRIANGULO:
				forma = new Triangulo();
				break;
			default:
				this.console.enviaMensagem("Ferrou !");
				break;
			}
			Map<String, Double> parametros = this.console.readParametros(forma.getParametros());
			forma.setParametros(parametros);

			if(forma != null){
				((GeometriaPlana) forma).exibirCalculo();
			}				
		} while (this.console.confirmaSN("Deseja realizar outro calculo (s/n)"));
		this.close();
	}	
	
}
