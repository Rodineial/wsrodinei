package variaveis;

public class ManipulaString {
	public static void main(String[] args) {
		
		/*
		 * Identificadores (nomes dos elementos que criamos:variaveis,classes,
		 * pacotes etc.
		 * - Regras:
		 * 1 - n�o comer�s com numero. Exemplo: 1berto (errado) h1berto (certo)
		 * 2 - N�o utilizar�s palavras reservadas.Exemplos:int,double, class, void
		 * 3 - N�o far�s uso de caracteres especiais. Exemplo: n@me, tr#s, nome clientes...
		 * - Padr�es:
		 * 1) CamelCase: da segunda palavra em diante (em uma composicao)
		 * deve come�ar com letra maiuscula.
		 * certo => dataNascimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * errado => data_Nascimento
		 * 
		 * 2) UML: � responsavel por padronizar elementos da Orienta��o a Objetos
		 * - Toda classe deve come�ar com a letra maiuscula
		 * - Toda variavel/pacote deve come�ar com letra minuscula
		 * - Todo m�todo deve come�ar com a letra minuscula e deve ser seguido de parenteses.
		 * 
		 * 
		 */
		
	String email = "rodinEIal@hoTMail.Com";
	System.out.println("Original:" + email);
	System.out.println("Minuscula: " + email.toLowerCase());
	System.out.println("Maiusculo:" + email.toUpperCase());
	System.out.println("Tem arroba?" + email.contains("@"));
	System.out.println("Posi��o do @: " + email.indexOf("@"));
	System.out.println("Qtde Caracteres: " + email.length());
	System.out.println("Do 2 at� o quinto caracter: " + email.substring(0,4));
	System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
	System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")).toLowerCase());
	System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
	System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0));
	
	
	
	
	
	//usuario do email
	// o servidor do email
	
	// boas praticas para nimenclaturas
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
