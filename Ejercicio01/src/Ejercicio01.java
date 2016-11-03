import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a,b,res=0;
		
		
		System.out.println("Introduce un numero\n");
		a = teclado.nextInt();
		
		System.out.println("Introduce otro numero\n");
		b = teclado.nextInt();
		
		
		if(a<=b){
			
			while(a+1<=b-1){
				
				res = res + (a+1);
					
					a++;
			}
			
			System.out.println("La suma es "+res);	
			}
		
		else { System.out.println("\nA debe ser menor o igual que B");}
		
		

	}

}
