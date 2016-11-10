import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int N, base, altura, area; 
		
		System.out.println("Elige una opción 1.Triángulo 2.Cuadrado 3.Rectángulo");
		N = teclado.nextInt();
		
		switch(N){
		case 1: System.out.println("Pon una base");
				System.out.println("Pon una altura");
				base = teclado.nextInt();
				altura = teclado.nextInt();
				area=(base*altura)/2;
				System.out.println("El area es "+area);
				break;
		case 2: System.out.println("Pon una base");
				base = teclado.nextInt();
				area=(base*base);
				System.out.println("El area es "+area);
				break;		
		case 3: System.out.println("Pon una base");
				System.out.println("Pon una altura");
				base = teclado.nextInt();
				altura = teclado.nextInt();
				area=(base*altura);
				System.out.println("El area es "+area);
				break;		
				
				default: System.out.println("numero erroneo");
				break;
		}
	}

}
