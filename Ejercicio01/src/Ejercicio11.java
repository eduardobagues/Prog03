import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N,num,prim,res=0,marca=0;
		
		System.out.println("Mete un numero");
		N = teclado.nextInt();
		
		
		for(num=1; num<=N; num++){
		
			for(prim=num; prim>=1;prim--){
			
			res = num%prim;
			
			if(res==0){
				
				marca++;
			}
			
			
			}
			
			if(marca == 2){System.out.print(num+" "); marca = 0;} else {marca = 0;}
				
		}
		
		
		
		
	}

}
