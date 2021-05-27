package br.com.caicaielavator.implementacao;

public class Elavator {
	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo";
					
		}else {
			return
		}
	}
	
	public String retornarResumo() {
		return 
				"Nome..: " + nome + "\n" +
				"Andar.": " + andarAtual + "\n" +
				"Pessoas: " + qtdePessoas;
				
	}
	
	public void inicializar(int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas=pCapPessoas;
	}
	public void preencherNome(String param) {
		nome=param;
	}
	public String retornarNome() {
		return nome;
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}


