package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	/*
	 * Tipos Primitivos (Todos aqueles que começam com a letra minuscula)
	 * boolean =>Lógico (True/False)
	 * char => um caracter entre apostrofos
	 * 
	 * byte => -128/+128
	 * short => -32 mil / 32 mil
	 * int => -2 trilhoes / + 2 trilhoes
	 * long => (-) 9 quintilhoes / (+) 9 quintilhoes
	 * 
	 * float => até 5 casas decimais.
	 * double acima disso.
	 */
 
	public static void main(String[] args) {
	
	/*
	 * Capturem:
	 * - nome do produto
	 * - qtde do produto
	 * - valor unitario
	 * exibir no final:
	 * - nome do produto
	 * - valor total
	 * - valor do imposto (17% sobre o valor total)	
	 */
		
		String produto =JOptionPane.showInputDialog("Digite o nome do produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade do produto"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("valor unitario"));
		float total = valor*quantidade;
		// float imposto = total* (float) 0.17; //cast => casting (ajuste de tamanho)
		
		System.out.println("Total...: " + (valor*quantidade));
		System.out.println("Imposto..: " + ((valor*quantidade)*0.17));
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
