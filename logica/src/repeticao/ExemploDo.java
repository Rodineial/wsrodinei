package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {
	public static void main(String[] args) {
		
		do {
		
String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso"));
float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"));
float imc = peso / (altura*altura);
System.out.printf("%s seu IMC �: %.2f\n",  nome, imc);

		}while(JOptionPane.showConfirmDialog
				(null, "continuar","Titulo", JOptionPane.YES_NO_OPTION)==0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
