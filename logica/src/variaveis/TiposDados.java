package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	//main() � o start point de uma aplica��o Java
	// � a chave de igni��o do carro
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
		 * Alfanumerico: � um texto,parte de um texto ou um n�mero
		 * que n�o ser� utilizado em opera��es matem�ticas.
		 * CEP (RH do Itau) => 00010-009 =>
		 * 
		 * Num�rico: representa um dado que PODE ser utilizado em
		 * express�es matem�ticas e /ou � considerado um dado cr�tico para o
		 * contexto.
		 * express�es matem�ticas.
		 * CEP (Aplica��o dos correrios) => ? 00010-009
		 * CPF (aplica��o da receita federal)
		 * funcional (entre os colaboradores do Itau)
		 * RM (entre os alunos de uma facudade)
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
