import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n,cont=1,res;
		System.out.println("Introduce un numero\n");
		
		n = teclado.nextInt();
		
		if (n>1 && n<100){
			
			System.out.println("Tabla de multiplicar de "+n);
			
			while(cont<=10){
				
			res = n * cont;
			
			System.out.println(n+" * "+cont+" = "+res);
				
			cont++;	
			}
			
		}
		else {System.out.println("Debe estar entre el 1 y 100");}
			
		
	}

}
