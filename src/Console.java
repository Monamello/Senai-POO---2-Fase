import java.util.Scanner;

public class Console {
	private Scanner scanner;
	
	public Console(){
		this.scanner = new Scanner(System.in);
		System.out.println("===== Euclides v1 ======");
		System.out.println("");
	}
	
	public String selecionaTipo(){
		System.out.println("Escolha a figura para calcular: (retangulo, triangulo, circulo, trapezio)");
		String inputPergunta = scanner.nextLine();
		return inputPergunta;
	}
	
	public boolean confirmaSN(String mensagem){
		System.out.println(mensagem);
		return scanner.nextLine().equalsIgnoreCase("s");
	}
	
	public void enviaMensagem(String mensagem){
		System.out.println(mensagem);
	}
	
	public void close(){
		this.scanner.close();
		System.out.println("======== FIM ========="); 
	}
	public String receberValor(){
		return scanner.nextLine();
	}
}
