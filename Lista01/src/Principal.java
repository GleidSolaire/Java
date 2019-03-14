
/**
 * A classe principal vai fazer o que voc� quer que ela fa�a.
 * 
 * @author 1829799
 * @version 1.0
 * @since 28/02/2019
 */
public class Principal {

	/**
	 * Fun��o para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	String[] opcoes = {"En�simo termo da PA",
						"Distancia entre pontos",
						"M�dia Aritm�tica",
						"M�dia Ponderada",
						"M�dia Arm�nica"};
	
	boolean continua = true;
	
	do {
	
	int opcao = Console.mostrarMenu(opcoes, "Lista 01", null);
	
	switch (opcao) {
	case 1:
		calcularEnesimoTermoPa();
		break;
	case 2:
		calcularDistanciaEntreDoisPontos();
		break;
	case 3:
		calcularMediaAritimetica();
		break;
	case 4:
		calcularMediaPonderada();
		break;
	case 5:
		calcularMediaArmonica();
		break;
	case -1:
		continua = false;
		break;
	}

	} while (continua);
	
	}
	
	/**
	 * Exec�cio 01 - Calcular enesimo termo da PA
	 */
	public static void calcularEnesimoTermoPa() {
		
		int a1 = Console.recuperaInteiro("Digite o termo a1: ");
		int n = Console.recuperaInteiro("Digite o n: ");
		int r = Console.recuperaInteiro("Digite a raz�o: ");

		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		System.out.println("Resultado: " + an);
	}
	
	/**
	 * Exerc�cio 02 - Calcular distancia entre 2 pontos no plano cartesiano
	 */
	public static void calcularDistanciaEntreDoisPontos() {
		double x1 = Console.recuperaDecimal("Informe a coordenada x1: ");
		double y1 = Console.recuperaDecimal("Informe a coordenada y1: ");
		double x2 = Console.recuperaDecimal("Informe a coordenada x2: ");
		double y2 = Console.recuperaDecimal("Informe a coordenada y2: ");
		
		double distancia = Exercicios.calcularDistanciaEntreDoisPontos(x1, y1, x2, y2);
		
		System.out.printf("Distancia entre os 2 pontos %.2f", distancia);
		
	}
	
	/**
	 * Exerc�cio 03 - Calcula a m�dia aritim�tica de tr�s notas 
	 */
	public static void calcularMediaAritimetica() {
		
		double n1 = Console.recuperaDecimal("Digite a 1� Nota: ");
		double n2 = Console.recuperaDecimal("Digite a 2� Nota: ");
		double n3 = Console.recuperaDecimal("Digite a 3� Nota: ");
	
		double media = Exercicios.calcularMediaAritimetica(n1, n2, n3);
	
		System.out.printf("M�dia Aritimetica: %.2f", media);
			
	}
	
	/**
	 * Exerc�cio 04 - Calcular a M�dia Ponderada de tr�s notas
	 */
	public static void calcularMediaPonderada() {
		double n1 = Console.recuperaDecimal("Digite a 1� Nota: ");
		double n2 = Console.recuperaDecimal("Digite a 2� Nota: ");
		double n3 = Console.recuperaDecimal("Digite a 3� Nota: ");
		
		double mediaP = Exercicios.calcularMediaPonderada(n1, n2, n3);
		
		System.out.printf("M�dia Ponderada: %.2f", mediaP);
	}
	
	/**
	 * Exerc�cio 05 - Calcular a m�dia arm�nica de tr�s notas
	 */
	public static void calcularMediaArmonica () {
		
		double n1 = Console.recuperaDecimal("Digite a 1� Nota: ");
		double n2 = Console.recuperaDecimal("Digite a 2� Nota: ");
		double n3 = Console.recuperaDecimal("Digite a 3� Nota: ");
		
		double mediaA = Exercicios.calcularMediaArmonica(n1, n2, n3);
		
		System.out.printf("M�dia Arm�nica: %.2f", mediaA);
	}
}
