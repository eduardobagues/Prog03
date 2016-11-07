import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int N,pares=0,impares=0;
		boolean poss=false;

			
		do{
			System.out.println("Mete un numero");
			N = teclado.nextInt();
			
			if(poss==false){
				impares = impares +N ;
				poss = true;
				
			}
			else{
				
				pares = pares + N;
				poss = false;
				
			}
			
			
			
			
		}while(N != 0);	
			
		
		System.out.println("=== FIN ===");
		System.out.println("Suma de impares "+impares);
		System.out.println("Suma de pares "+pares);
		
	
	}

}