package br.com.caicaielavator.modelo;

import br.com.caicaielavator.implementacao.Elavator;

public class TesteElavator {
	public static void main(String[] args) {
		
		Elavator elavator = new Elavator();
		elavator.preencherNome("Torre B");
		elavator.inicializar(20, 0, 10);
		System.out.println(elavator.retornarResumo());
		elavator.subir();
		elavator.subir();
		System.out.println(elavator.retornarResumo());
		elavator.subir();
		elavator.entrar(5);
		System.out.println(elavator.retornarResumo());
		elavator.descer();
		elavator.sair();
		
		
		
		
		
		
		
		
		
		
		
	}

}
