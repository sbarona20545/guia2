


 

import java.util.Scanner;

public class G2E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ejercicio 3 - Ejercicio del Colectivo de Bus");
		
		System.out.println("Tipo de Vehiculo    a = Automovil   c = Camioneta");	
		String tipo;
		Scanner teclado = new Scanner(System.in);
		tipo = teclado.nextLine();

		Scanner entrada=new Scanner(System.in);
		System.out.println("Precio ");		
		int precio = entrada.nextInt();		
		
		double impuesto = 0 ;
		

		if ( tipo == a )  // Automovil 
		{
			if ( precio < 20 )  // Automovil 
			{
				impuesto = 5 ;
			}
			if ( precio > 20) or ( precio < 40 )// Automovil 

			{
				impuesto = precio / 5 ;
			}
			if ( precio > 40 )  // Automovil 
			{
				impuesto = 9 ;
			}			
			
        } 		
		
		if ( tipo == c )   // Camioneta 
		{
			if ( precio < 80 )  // Automovil 
			{
				impuesto = 0 ;
			}
			if ( precio > 80 )  // Automovil 
			{
				impuesto = precio / 2 ;
			}            

        } 				
		
		
 		System.out.println( "Impuesto liquidado es = " + impuesto  );	
		
		
		
		
	}

}
