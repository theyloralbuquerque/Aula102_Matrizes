import java.util.Locale;
import java.util.Scanner;

public class Program_Matrizes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da Matriz: ");
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];  // sintaxe da matriz. Instanciação
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) { // length = quantidade de colunas
				System.out.printf("Digite a posição %d.%d: ", i+1, j+1);
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.printf("\n"); // quebra a linha ao fim do for de dentro.
		}
		
		System.out.println("Diagonal Principal: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				} 
			}
		}
		
		System.out.println();
		System.out.print("Números Negativos: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j]<0) {
					System.out.print(mat[i][j] + " ");
				} 
			}
		}
		
		sc.close();
	}

}
