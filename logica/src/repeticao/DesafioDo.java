package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chutando alto.");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chutando baixo.");
			}
		}while(numero!=chute);
		JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)");
		
		
		/*
		 * Miss�o 1:
		 * O jogador um digita um numero inteiro.
		 * A partir dai o jogador 2 deve advinhar o numero,
		 * somente quando ele acertar dever� aparecer amensagem
		 * "Parabens, voc� acertou"
		 * 
		 * Miss�o 2:
		 * Acrescente dicas para o jogador2, informando se o numero que ele
		 * tem que advinhar � maior ou menor que o numero que ele esta digitando.
		 * 
		 * Miss�o 3:
		 * Acrescentar um contador de tentativas, que ser� exibido quando
		 * o jogador 2 acertar, a mensagem dever� ser:
		 * "Parabens,voc� acertou com X tentativas(s)".
		 * Dicas:ter�o que criar uma variavel para contar
		 * 
		 * != =>n�o � igual
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
