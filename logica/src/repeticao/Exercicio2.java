package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/* Exercicio 2
		 * Solicite o nome do cliente e o email, pergunte a ele se deseja adicionar
		 * itens para sua compra, e enquanto ele responder que sim, pe�a:
		 * nome do produto, valor e qtde. 
		 * Exiba para cada produto o total de cada um.
		 * Quando terminar de adicionar produtos exiba no final o total da conta.
		 */ 
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		String produto="";
		int qtde=0;
		float valor=0;
		float totalGlobal=0;
		float totalProduto=0;
		do {
			produto = JOptionPane.showInputDialog("Produto").toUpperCase();
			qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
			valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
			totalProduto = valor*qtde;
			System.out.printf("Para o produto %s o valor �: R$ %.2f e a quantidade � %d resulta um total de R$ %.2f\n", produto, valor, qtde, totalProduto);
			totalGlobal=totalGlobal + totalProduto;
			// totalGlobal+=totalProduto;
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println(nome + " o total das suas compras �:  " + totalGlobal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
