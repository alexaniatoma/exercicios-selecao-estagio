/*
 * Exercício 2
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre 
 * será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
 * sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou 
 * não a sequência.
 * 
 * IMPORTANTE:
 * Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser
 *  previamente definido no código;
*/

public class Ex2TesteFibonacci {

	public static void main(String[] args) {
		Ex2Fibonacci fibonacci = new Ex2Fibonacci();

		boolean flag = false;
		Integer n = 3;
		for (int i = 0; i < n; i++) {
          
		Integer total = fibonacci.calcular(i);
		if(n.equals(total)){
			flag = true;
		}
		
		
			System.out.println(total);
		
		
		}
		
		if(flag == true) {
			System.out.println("O numero informado " + n + " pertence a sequencia de Fibonacci");
		
		}else {
			System.out.println("O numero informado " + n + " não pertence a sequencia Fibonacci");
		}
		
	}
	
}

