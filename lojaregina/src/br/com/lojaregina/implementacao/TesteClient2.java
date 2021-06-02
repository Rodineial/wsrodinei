package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Endereco;

public class TesteClient2 {
	
	public static void main(String[] args) {
		
		Cliente objeto = new Cliente();
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua X");
		endereco.setComplemento("");
		endereco.setBairro("Centro");
		endereco.setCidade("S�o Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		
		objeto.setAll(endereco , 1, "Xpto", "xpto@xpto.com.br", "1234-4321");
		
		System.out.println(objeto.toString());
		System.out.println("Bairro: " + objeto.getEndereco().getBairro());
		System.out.println("Usuario: " + objeto.getUsuario());
		
		
		
		
		
		}
}
