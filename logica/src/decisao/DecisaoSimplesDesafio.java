package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
public static void main(String[] args) {
	
	/*
	 * Capture o nome de uma pessoa e a idade
	 * De acordo com as leis eleitorais apresente uma mensagens abaixo:
	 * - "Seu voto � obrigat�rio"
	 * - "Seu voto � facultativo"
	 * - " Voc� n�o pode votar"
	 */
	

	String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
	
	short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
	
	
	if (idade<16) {
		System.out.println("voc� n�o pode votar!");
		
	}
	
	if (idade>=18 && idade<=70) {
		System.out.println(nome + "se voto � obrigatorio.");
	}
	
		
		// && => and
		// ll => or
		if (idade==16 || idade==17 || idade>70) {
			System.out.println("seu voto facultativo.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
