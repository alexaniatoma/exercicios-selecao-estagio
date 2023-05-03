/* 
 * Exercício 1
 * Observe o trecho de código abaixo:
 * int INDICE = 13, SOMA = 0, K = 0;
 * enquanto K < INDICE faça
 * {
 * K = K + 1;
 * SOMA = SOMA + K;
 * }
 * imprimir(SOMA);
 * 
 * 
 * Ao final do processamento, qual será o valor da variável SOMA?
 * 
 */


public class Ex1Soma {

	public static void main(String[] args) {
		int INDICE = 13;
		int SOMA = 0;
		int K = 0;
		
		//do {
			//K = K + 1;
			//SOMA = SOMA + K;
			
		//} while (K < INDICE);
		
		//System.out.println(SOMA + " DO");
		
		//for(INDICE = 13 ; K <= INDICE; K++) {
		
			//SOMA = SOMA + K;
		
		//System.out.println(SOMA + " FOR");
		
	//}
		while(K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}
		
		System.out.println(SOMA + " WHILE");
			
		}
		
}








