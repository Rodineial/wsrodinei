package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
public static void main(String[] args) {
	
	String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
	
	while (email.contains("@")==false || email.indexOf("@")<2) {
		email = JOptionPane.showInputDialog("Digite o email novamente").toLowerCase();
}
	System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
	
	String nome = JOptionPane.showInputDialog("Digite o nome: ").toLowerCase();
	// O nome n�o pode ter menos que 3 caracteres e mais que 20 caracteres
	
	
	while (nome.length()<3 || nome.length()>20) {
		nome = JOptionPane.showInputDialog("Digite o nome novamente").toLowerCase();
}
	System.out.println("Nome validado: " + nome);
	
	
	

	
	
	
	
	
	

	
	
	
	
	
	
	
}
}
