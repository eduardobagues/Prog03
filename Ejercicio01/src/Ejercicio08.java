import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int N,res,cont;



		System.out.println("Mete un numero para calcular su factorial");
		N = teclado.nextInt();

		if(N > 0){

			res = N;
			for(cont=N-1; cont>=1;cont--){

				res = res * cont;
			}

			System.out.println("\nFactorial "+res);
		}
		else {System.out.println("\nN debe ser mayor que 0");}


		System.out.println("\n== FIN ==");

	}

}
