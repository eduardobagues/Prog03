import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N,cont,res,marca=0;
		
		System.out.println("Introduce un numero\n");
		N = teclado.nextInt();
		
		for(cont=N; cont>0; cont--){
			
			res = N%cont;
			
			if(res==0){
				
				marca++;
				
			}
			
		}
		
		if(marca <= 2){System.out.println(N+" es primo");} else {System.out.println(N+" no es primo");}
		

	}

}
