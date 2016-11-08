import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int cont=0;
		float media,N,suma=0,menor,mayor=0;
		
		
		System.out.println("Mete un numero");
		N = teclado.nextInt();
		menor = N;
		
		while(N != 0){	
			
			if(N < menor){menor = N;}
			if(N > mayor){ mayor = N;}
			
			cont++;
			System.out.println("Mete un numero");
			N = teclado.nextInt();
			suma = suma + N;
			
			
		}

		cont--;
		media = suma / cont;
		System.out.println("La media es "+media);
		System.out.println("Mayor "+mayor+" ,menor "+menor);
		
	
	
	}

}
