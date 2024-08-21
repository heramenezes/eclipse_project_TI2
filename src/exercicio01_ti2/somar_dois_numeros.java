package exercicio01_ti2;
import java.util.*;

class somar_dois_numeros {
	// Criando o objeto do meu scanner
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		// Declarando variaveis
		int num1, num2, soma;
		
		// Printando na tela o que o user deve digitar e lendo seu input
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		// Somando os dois numeros
		soma = num1 + num2;
		
		// Printando na tela
		System.out.println("Soma:"+soma);
	}
}
