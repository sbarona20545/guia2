
/**
 * Write a description of class punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 

import java.util.Scanner;

public class G2E2 extends G2E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Ejercicio 2 - Area sombreada en el Circulo");
		Scanner entrada=new Scanner(System.in);
				
		System.out.println("Radio ");		
		double r = entrada.nextDouble();
 
		double area = 0 ;
		
 		area = Math.pow( (3.141559 -2 )*r , 2) ;
 		
		System.out.println( "Area sombreada  = " + area );		
	
	
	
	}

}
