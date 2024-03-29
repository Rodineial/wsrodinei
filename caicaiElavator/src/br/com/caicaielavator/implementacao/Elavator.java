package br.com.caicaielavator.implementacao;

public class Elavator {
	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;
	
	public void entrar(int qtde) {
		int resultado = qtdePessoas + qtde;
		if (resultado<=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}
	
	public void sair(int qtde) {
		int resultado = qtdePessoas - qtde;
		if (resultado>=0) {
			qtdePessoas-=qtde;
		}
	}
	
	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Descendo";
		}else {
			return "J� est� no andar m�nimo";
		}
	}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo";
		}else {
			return "J� est� no �ltimo andar";
		}
		
		
	}
	
	public String retornarResumo() {
		return 
				"Nome...: " + nome + "\n" +
				"Andar..: " + andarAtual + "\n" + 
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

