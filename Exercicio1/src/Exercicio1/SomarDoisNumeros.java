package Exercicio1;
import java.util.*;


class SomarDoisNumeros {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//Declaracao de variaveis
		int num1 , num2 , soma;
		
		//Leituras
		System.out.println("Digite um numero");
		num1 = scanner.nextInt();
		System.out.println("Digite outro numero");
		num2 = scanner.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma: "+ soma);
		
	}
}
