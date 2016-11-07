import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int N,divs,cont,res=0;
		
		// 6 +3+2+1 = 6
		
		System.out.println("Mete un numero para comprobar si es PERFECTO");
		N = teclado.nextInt();
		
		
		for(cont = N-1; cont >=1 ;cont--){
			
			divs = N%cont;
			
			if(divs == 0){ 
				
				res = res + cont;
			}
			
		}
		
		if(res == N){
			System.out.println(N+" es PERFECTO");
			} 
		else {
			System.out.println(N+" NO es perfecto");
			}
		
		
		
	}

}
