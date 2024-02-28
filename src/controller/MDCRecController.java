/*
* 5. 
* O máximo divisor comum (MDC ou M.D.C) 
* corresponde ao produto dos divisores comuns
* entre dois ou três números inteiros.
* Para calcular o máximo divisor comum (MDC) entre números,
* devemos realizar a fatoração por meio de decomposição
* em fatores primos dos números indicados.
* 
* Para exemplificar, vamos calcular através da fatoração o MDC do 20 e 24:
* 
* Para saber o MDC dos números, devemos olhar 
* à direita da fatoração e 
* ver quais números dividiram, simultaneamente, 
* nas duas colunas e multiplicá-los.
* 
* Assim, pela fatoração podemos concluir que o 4 (2 x 2) é 
* o maior número que divide ambos e, 
* portanto, é o máximo divisor comum de 20 e 24.
* 
* O máximo divisor comum (MDC) de dois números inteiros x e y 
* pode ser calculado usando-se uma definição recursiva:
*
* MDC(x,y) = MDC(x − y, y), se x > y
* MDC(x,y) = MDC(y,x)
* MDC(x,x) = x
* 
* Fazer uma função recursiva que receba 2 
* números inteiros positivos e apresente 
* o MDC desses números.
*/

 
 
package controller;
 
	public class MDCRecController {
		
		public MDCRecController() {
			
			super();
	}
 
		public static int calcularMDCRec (int x, int y) {
			
		//Condição de parada: 
    	//Quando ambos os números são iguais, o MDC é o próprio número
        if (x == y) {
            return x;
        }
 
        // Caso x seja maior que y, subtraímos y de x
        if (x > y) {
            return calcularMDCRec(x - y, y);
        }
 
        // Caso y seja maior que x, subtraímos x de y
        return calcularMDCRec(x, y - x);
		
		}
	}
