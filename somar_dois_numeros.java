package exercicio01_ti2;
import java.util.*;

class somar_dois_numeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		// Declarando variaveis
		int num1, num2, soma;
		
		// Lendo os numeros
		System.out.println("Digite um n�mero");
		num1 = sc.nextInt();
		System.out.println("Digite outro n�mero");
		num2 = sc.nextInt();
		
		// Somando os dois numeros
		soma = num1 + num2;
		
		// Printando na tela
		System.out.println("Soma:"+soma);
	}
}
