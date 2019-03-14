/**
 * Classe para executar os exerc�cios da lista 01.
 * 
 * @author 1829799
 *
 */
public class Exercicios  extends Console {
	/**
	 * Calcula o enesimo termo da PA
	 * 
	 * @param a1 - primeiro termo
	 * @param n  - indice do enesimo termo
	 * @param r  - raz�o da PA
	 * @return - Enesimo termo
	 */
	public static int calcularEnesimoTermoPA(int a1, int n, int r) {
		int an = a1 + (n - 1) * r;
		return an;
	}
	
	
	/**
	 * Calcula a m�dia aritimetica de tr�s notas informadas
	 * @param n1 1� nota do aluno
	 * @param n2 2� nota do aluno
	 * @param n3 3� nota do aluno
	 * @return media = M�dia Aritimetica
	 */
	public static double calcularMediaAritimetica (double n1, double n2, double n3) {
		double media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	/**
	 * Calcular dist�ncia entre 2 ponto no plano cartesiano
	 * @param x1 Coordenada de x do ponto 1
	 * @param y1 Coordenada de y do ponto 1
	 * @param x2 Coordenada de x do ponto 2
	 * @param y2 Coordenada de y do ponto 2
	 * @return A distancia entre os pontos
	 */
	public static double calcularDistanciaEntreDoisPontos (double x1, double y1, double x2, double y2 ) {
		
		return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
	
	/**
	 * Calcular M�dia Ponderada
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return
	 */
	public static double calcularMediaPonderada (double n1, double n2, double n3) {
		return ((n1*5)+(n2*3)+(n3*2)) / (5+3+2);
	}
	
	/**
	 Calcula a M�dia Ponderada de tr�s notas informadas
	 * @param n1 1� nota do aluno
	 * @param n2 2� nota do aluno
	 * @param n3 3� nota do aluno
	 * @return media = M�dia Ponderada
	 */
	public static double calcularMediaArmonica (double n1, double n2, double n3) {
		
		return 3/((1/n1)+(1/n2)+(1/n3));
		
	}
	

}
