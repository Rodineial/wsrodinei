package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chutando alto.");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chutando baixo.");
			}
		}while(numero!=chute);
		JOptionPane.showMessageDialog(null, "Parabéns você acertou com " + contador + " tentativa(s)");
		
		
		/*
		 * Missão 1:
		 * O jogador um digita um numero inteiro.
		 * A partir dai o jogador 2 deve advinhar o numero,
		 * somente quando ele acertar deverá aparecer amensagem
		 * "Parabens, você acertou"
		 * 
		 * Missão 2:
		 * Acrescente dicas para o jogador2, informando se o numero que ele
		 * tem que advinhar é maior ou menor que o numero que ele esta digitando.
		 * 
		 * Missão 3:
		 * Acrescentar um contador de tentativas, que será exibido quando
		 * o jogador 2 acertar, a mensagem deverá ser:
		 * "Parabens,você acertou com X tentativas(s)".
		 * Dicas:terão que criar uma variavel para contar
		 * 
		 * != =>não é igual
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
