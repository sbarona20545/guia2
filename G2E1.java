// Ejercicio 1
 
import java.util.Scanner;
public class G2E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 1 - Ejercicio de Conversion de Unidades");

 
		Scanner entrada=new Scanner(System.in);		
		
		System.out.println("Unidad de Medida");		
		String unidad = buff.readLine();
		
		System.out.println("Valor a Convertir");		
		double valor = entrada.nextDouble();
		double PUL = 0 ;
		
		switch (unidad) {
        case "P":
        	PUL = valor * 12 ;
        break;
        case "C":
        	PUL = valor / 2.54 ;
        break;
        case "L":
        	PUL = valor * 190080 ;
        break;
        case "Y":
        	PUL = valor * 36 ;
        break;
 }		
	System.out.println("El valor convertido es = "+ PUL );				
			
		
	}

}

