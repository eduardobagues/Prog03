import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a,b,c,res1,res2=0,res3=0;
		
		System.out.println("Introduce valores para a b y c\nSegun ax^2 + bx + c = 0");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		
		res1 = (b*b)-(4*a*b);
		
		if(res1<0){
			
			System.out.println("No se puede resolver");
		}
		else{
			
			
			res2 = (-b+(Math.sqrt(res1)))/(2*a);
			res3 = (-b-(Math.sqrt(res1)))/(2*a);
			
			System.out.println("El resultado es x = "+res2+" y x = "+res3);
		}
		
		
		
		
		
	}

}
