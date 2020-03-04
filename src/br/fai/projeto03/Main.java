package br.fai.projeto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	Scanner scanner = new Scanner(System.in);

	private void start() {
		
		System.out.println("Digite idade:");
		
		int idade = scanner.nextInt();
		
		if(idade > 20) {
			System.out.println("Idade maior que 20");
		}else if( idade > 12 && idade < 17 ) {
			System.out.println("Idade maior que 12 e menor que 17");
	    }else if(idade == 7 || idade < 5) {
	    	System.out.println("Idade igual 7 ou menor que 5");
	    }else {
	    	System.out.println("Outras combina�oes");
	    }

}
