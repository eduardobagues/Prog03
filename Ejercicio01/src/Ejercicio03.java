import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int N,cont,res;
		
		System.out.println("Introduce un numero\n");
		N = teclado.nextInt();
		
		cont = N-1;
		
		while (cont>0){
			
			res = N%cont;
			
			if(res==0){
				System.out.println("divisores "+cont);
				
			}
			
			cont--;
		}
		
		

	}

}
