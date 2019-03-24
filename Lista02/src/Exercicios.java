import java.util.ArrayList;

/**
 * Classe para executar os exerc�cios da lista 02
 * 
 * @author 1829799
 *
 */
public class Exercicios {
	
	/**
	 * Multiplica dois vetores de double
	 * @param arrayA Array de double
	 * @param arrayB Array de double
	 * @return ArrayList com resultado da multiplica��o dos itens dos arrays
	 */
	public static ArrayList<Double> multiplicarArray(double[] arrayA, double[] arrayB) {

		ArrayList<Double> resultado = new ArrayList<>();

		for (int i = 0; i < arrayA.length; i++) {

			resultado.add(arrayA[i] * arrayB[i]);
		}

		return resultado;
	}

}
