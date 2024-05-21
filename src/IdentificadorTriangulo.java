import java.util.Scanner;

public class IdentificadorTriangulo {
	/* Algoritmo identificador de um triângulo qualquer
	 * 
	 * Esse é um algoritmo feito para identificar o tipo
	 * de um triângulo, que é definido pelo usuário. Esse
	 * programa usa o utilitário Scanner, nativo do Java, 
	 * para receber três variáveis diferentes do usuário 
	 * e, com elas, chamar o método "identificarTriangulo",
	 * que realiza a identificação fora do escopo principal.
	 * ------------------------------------------------------
	 * Repositório no Github:
	 * https://github.com/gusmmmao/identificadorDeTriangulos/
	 */
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a medida do primeiro lado:");
		int ladoUm=scanner.nextInt();
		System.out.println("Digite a medida do segundo lado:");
		int ladoDois=scanner.nextInt();
		System.out.println("Digite a medida do terceiro lado:");
		int ladoTres=scanner.nextInt();
		
		identificarTriangulo(ladoUm, ladoDois, ladoTres);
		
		scanner.close();
	}
	
	public static void identificarTriangulo(int tamanhoLateralUm, int tamanhoLateralDois, int tamanhoLateralTres) {
		if (tamanhoLateralUm == tamanhoLateralDois && tamanhoLateralUm == tamanhoLateralTres) {
			System.out.println("Esse triângulo é equilátero");
		}
		else if (tamanhoLateralUm == tamanhoLateralDois || tamanhoLateralUm == tamanhoLateralTres) {
			System.out.println("Esse é um triângulo isóceles");
		}
		else if (tamanhoLateralUm != tamanhoLateralDois || tamanhoLateralUm != tamanhoLateralTres) {
			System.out.println("Esse é um triângulo escaleno");
		}
	}
}
