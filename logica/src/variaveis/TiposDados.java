package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	//main() é o start point de uma aplicação Java
	// é a chave de ignição do carro
	public static void main(String[] args) {
		
	//Sintaxe: <Tipo de dados> <nome da variavel> = <dados>;
		
		String nome =JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));
		double imc = peso / (altura * altura);
		
		
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura.: " + altura);
		System.out.println("IMC.... " + imc);
		
		
		
		/*
		 * Alfanumerico: é um texto,parte de um texto ou um número
		 * que não será utilizado em operações matemáticas.
		 * CEP (RH do Itau) => 00010-009 =>
		 * 
		 * Numérico: representa um dado que PODE ser utilizado em
		 * expressões matemáticas e /ou é considerado um dado crítico para o
		 * contexto.
		 * expressões matemáticas.
		 * CEP (Aplicação dos correrios) => ? 00010-009
		 * CPF (aplicação da receita federal)
		 * funcional (entre os colaboradores do Itau)
		 * RM (entre os alunos de uma facudade)
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
