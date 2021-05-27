package variaveis;

public class ManipulaString {
	public static void main(String[] args) {
		
		/*
		 * Identificadores (nomes dos elementos que criamos:variaveis,classes,
		 * pacotes etc.
		 * - Regras:
		 * 1 - não comerás com numero. Exemplo: 1berto (errado) h1berto (certo)
		 * 2 - Não utilizarás palavras reservadas.Exemplos:int,double, class, void
		 * 3 - Não farás uso de caracteres especiais. Exemplo: n@me, tr#s, nome clientes...
		 * - Padrões:
		 * 1) CamelCase: da segunda palavra em diante (em uma composicao)
		 * deve começar com letra maiuscula.
		 * certo => dataNascimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * errado => data_Nascimento
		 * 
		 * 2) UML: é responsavel por padronizar elementos da Orientação a Objetos
		 * - Toda classe deve começar com a letra maiuscula
		 * - Toda variavel/pacote deve começar com letra minuscula
		 * - Todo método deve começar com a letra minuscula e deve ser seguido de parenteses.
		 * 
		 * 
		 */
		
	String email = "rodinEIal@hoTMail.Com";
	System.out.println("Original:" + email);
	System.out.println("Minuscula: " + email.toLowerCase());
	System.out.println("Maiusculo:" + email.toUpperCase());
	System.out.println("Tem arroba?" + email.contains("@"));
	System.out.println("Posição do @: " + email.indexOf("@"));
	System.out.println("Qtde Caracteres: " + email.length());
	System.out.println("Do 2 até o quinto caracter: " + email.substring(0,4));
	System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
	System.out.println("Usuário: " + email.substring(0, email.indexOf("@")).toLowerCase());
	System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
	System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0));
	
	
	
	
	
	//usuario do email
	// o servidor do email
	
	// boas praticas para nimenclaturas
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
