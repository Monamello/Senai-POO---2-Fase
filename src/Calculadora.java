import forma.Circulo;
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
		do{
			TipoForma tipo = console.selecionaTipo(); 
				switch (tipo) {
				case RETANGULO:
					
					console.enviaMensagem(" Digite a base: ");
					String inputBaseR = console.receberValor();
					// int baseR = Integer.valueOf(inputBaseR);

					console.enviaMensagem(" Digite a altura: ");
					String inputAlturaR = console.receberValor();
					// int alturaR = Integer.valueOf(inputAlturaR);
					Retangulo retangulo = new Retangulo(Integer.valueOf(inputAlturaR), Integer.valueOf(inputBaseR));
					console.enviaMensagem("");
					console.enviaMensagem(retangulo.exibirCalculo());
					console.enviaMensagem("");
					console.enviaMensagem("Digite s para continuar");
					break;
				case TRIANGULO:
					console.enviaMensagem(" Digite a base: ");
					String inputBaseT = console.receberValor();

					console.enviaMensagem(" Digite a altura: ");
					String inputAlturaT = console.receberValor();

					console.enviaMensagem(" Lado1: ");
					String inputLado1 = console.receberValor();

					console.enviaMensagem(" Lado2: ");
					String inputLado2 = console.receberValor();

					console.enviaMensagem(" Lado3: ");
					String inputLado3 = console.receberValor();

					Triangulo triangulo = new Triangulo(Integer.valueOf(inputBaseT), Integer.valueOf(inputAlturaT), Integer.valueOf(inputLado1), Integer.valueOf(inputLado2), Integer.valueOf(inputLado3));
					
					console.enviaMensagem("");

					console.enviaMensagem(triangulo.exibirCalculo());
					console.enviaMensagem("");
					console.enviaMensagem("Digite s para continuar: ");
					break;
				case CIRCULO:
					console.enviaMensagem(" Digite o raio: ");
					String inputRaio = console.receberValor();
					console.enviaMensagem("");

					Circulo circulo = new Circulo(Double.valueOf(inputRaio));
					
					console.enviaMensagem(circulo.exibirCalculo());
					console.enviaMensagem("");
					console.enviaMensagem("Digite s para continuar: ");
					break;
				case TRAPEZIO:

					console.enviaMensagem(" Digite b : ");
					String inputb = console.receberValor();

					console.enviaMensagem(" Digite B: ");
					String inputB = console.receberValor();

					console.enviaMensagem(" Digite h: ");
					String inputH = console.receberValor();

					console.enviaMensagem(" Digite l1: ");
					String inputL1 = console.receberValor();

					console.enviaMensagem(" Digite l2: ");
					String inputL2 = console.receberValor();
					console.enviaMensagem("");

					Trapezio trapezio = new Trapezio(Float.valueOf(inputb), Float.valueOf(inputB), Float.valueOf(inputL1), Float.valueOf(inputL2), Float.valueOf(inputH));
					
					console.enviaMensagem(trapezio.exibirCalculo());
					console.enviaMensagem("");
					console.enviaMensagem("Digite s para continuar: ");
					break;
				default:
					console.enviaMensagem("==== FIM ====");
					console.close();

				}
		}while (this.console.confirmaSN("Deseja realizar outro calculo (s/n)"));
		this.close();
	}
	
	
}
