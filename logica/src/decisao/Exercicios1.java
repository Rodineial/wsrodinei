package decisao;

import javax.swing.JOptionPane;

public class Exercicios1 {

	public static void main(String[] args) {

		/*

		 * Solicite dois valores e um operador matemático 
		 * (+, -, / ou *)
		 * Dependendendo do operador que foi digitado realize o calculo
		 * e exiba o resultado
		 * Dica.: Se utilizar String a comparação de String deve ser:
		 * if (variavel.equals("valorasercomparado")){
		 */

		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("valor1"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("valor 2"));
		char operador = JOptionPane.showInputDialog("Digite um operador").charAt(0);

		if (operador=='*') {
			System.out.println("Resultado: " + (valor1*valor2));
		}else if (operador=='/') {

			if (valor2!=0) {
				System.out.println("Resultado: " + (valor1*valor2));
			}else  {
				System.out.println("não é possivel realizar o calculo");
			}

		}else if (operador=='+') {
			System.out.println("Resultado: " + (valor1+valor2));
		}else if (operador=='+') {
			System.out.println("Resultado: " + (valor1+valor2));

		}else {
			System.out.println("Operador Inválido");


		}	
	}



















}


