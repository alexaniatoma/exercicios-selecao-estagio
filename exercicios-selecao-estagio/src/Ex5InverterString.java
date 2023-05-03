/*
 * Exercicio 05) 
 * Escreva um programa que inverta os caracteres de um string.
 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse;
 * 
*/


public class Ex5InverterString {
	public static void main(String[] args) {
	String texto = "alexania";
	String resultado = "";
	
		for( int i = texto.length()-1; i >= 0; i--) {
			resultado += texto.charAt(i);
		
			System.out.println(resultado);
		
		}
	}
}


