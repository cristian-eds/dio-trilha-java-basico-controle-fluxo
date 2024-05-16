package edu.cristian.eds;

import java.util.Scanner;
import edu.cristian.eds.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int parametroUm = scanner.nextInt();
		
		System.out.println("Digite o segundo número:");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro! ");
		
		int contagem = parametroDois - parametroUm;
		
		for( int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número "+i);
		}
	}

}
