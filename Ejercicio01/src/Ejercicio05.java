import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int N,suma=0,cont=0;




		do{

			System.out.println("Mete un numero");
			N = teclado.nextInt();
			
			suma = suma +N;
			
			cont++;


		}while(N != 0);


		System.out.println("Se han metido "+(cont-1)+" numeros");
		System.out.println("La suma es "+suma);
	}

}
