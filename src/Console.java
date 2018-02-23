import java.util.Scanner;

import forma.TipoForma;

public class Console {
	private Scanner scanner;

	public Console() {
		this.scanner = new Scanner(System.in);
		System.out.println(Messages.getString("Console.titulo")); //$NON-NLS-1$
		System.out.println(Messages.getString("Console.1")); //$NON-NLS-1$
	}

	public TipoForma selecionaTipo(){
		System.out.println(Messages.getString("Console.tipoForma")); //$NON-NLS-1$
		String inputPergunta = scanner.nextLine();
		
		
		switch (inputPergunta) {
			case "retangulo":
				return TipoForma.RETANGULO;
			case "trapezio":
				return TipoForma.TRAPEZIO;
			case "circulo":
				return TipoForma.CIRCULO;
			case "triangulo":
				return TipoForma.TRIANGULO;
			default:
				return null;
		}
				
				
	}

	public boolean confirmaSN(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextLine().equalsIgnoreCase(Messages.getString("Console.3")); //$NON-NLS-1$
	}

	public void enviaMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public void close() {
		this.scanner.close();
		System.out.println(Messages.getString("Console.fim")); //$NON-NLS-1$
	}

	public String receberValor() {
		return scanner.nextLine();
	}
}
