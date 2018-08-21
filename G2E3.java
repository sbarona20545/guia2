


 

import java.util.Scanner;

public class G2E3 extends G2E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ejercicio 3 - Ejercicio del Colectivo de Bus");
		Scanner entrada=new Scanner(System.in);
				
		System.out.println("Personas que viajan en Bus ");		
		int n = entrada.nextInt();
 
		System.out.println("Numero de turistas");		
		int t = entrada.nextInt();

		
		int V = 0 ;  // Numero de viajes
		int C = 0 ;  // Valor a pagar al colectivo
		int P = 0 ;	 // Valor al Propietario
		
 		V = Math.round(t/n) ;
 		C = 1000*t ;
 		P = V*2000 ;
 	
 		System.out.println( "Numero de viajes = " + V );		
 		System.out.println( "Valor a pagar al colectivo = " + C );
 		System.out.println( "Valor para el Propietario = " + P );		
		
	}
}


