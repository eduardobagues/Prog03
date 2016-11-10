import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int N,Z,cont,cont1,res,marca=0;
		boolean bol = false;

		System.out.println("Mete un num y le muestro su primo superior mas cercano");
		N = teclado.nextInt();

		for(cont1=1; bol==false ;cont1++){
			
			Z = N + cont1;

			for(cont=Z; cont>=1; cont--){

				res = Z % cont;

				if(res==0){	marca++;}

			}

			if(marca<=2){ 
				System.out.println(Z+" es primo");
				bol = true;
			} 
			else {	marca=0;}
		}

	}

	}


