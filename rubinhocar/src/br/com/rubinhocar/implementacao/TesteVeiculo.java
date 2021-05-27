package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	public static void main(String[] args) {
		// 1 Instanciar o objeto
		Veiculo objeto = new Veiculo(); // instacia um objeto
		
		objeto.preencherModelo("camaro");
		objeto.preencherValor(200000);
		
		// Exibir os resultados
		System.out.println("Modelo: "+ objeto.retornarModelo());
		objeto.ligar();
		objeto.acelerar(20);
		objeto.acelerar(10);
		objeto.desacelerar(15);
		System.out.println("Depois de ligar: \n" + objeto.retornarTudo());
		objeto.desligar();
		System.out.println("Depois de desligar: \n" + objeto.retornarTudo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
