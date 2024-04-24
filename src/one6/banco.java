package one6;

import java.util.Scanner;

public class banco {

	
	public static void main (String []args) {
		
		String nombre ="Eli";
		String tipoDeCuenta = "corriente";
		double saldo =1599.99;
		int opcion =0;	
		System.out.println(" **********************");
		
		System.out.println(" \n NOMBRE DEL CLIENTE ES :"+nombre);
		System.out.println(" El titulo de cuenta es:"+tipoDeCuenta);
		System.out.println(" su saldo disponible es:"+saldo+ "S/.");
		
		System.out.println(" \n ****************************");//salto de linea//
        
		String menu = """
				
				
				***Escriba el numero de la opcion deseada ***
				1-consultar saldo**
				2-Retirar
				3-Depositar
				9-Salir
				""";
		
		Scanner teclado=new Scanner (System.in);
		
		while(opcion !=9) {
			
			System.out.println(menu);
			opcion = teclado.nextInt();
			
			
			switch (opcion ) {
			
			case 1:
				System.out.println("el saldo actualizado es:"+saldo+"s./");
			break ;
			
			case 2:
				System.out.println(" ¿Cual es el valor que desea retirar?");
		   double valorARetirar =teclado.nextDouble()
;
		   if( valorARetirar > saldo) {
			   System.out.println(" saldo insuficiente");
			   
		   }else {
			   saldo = saldo -valorARetirar;
			   System.out.println(" el saldo actualizado es:" +saldo);
			   
		   }
		   break;
			case 3: 
				System.out.println(" ¿cual es el valor que desea depositar?");
				double valorADepositar =teclado.nextDouble()
;
				saldo+=valorADepositar;
				System.out.println(" El saldo es:"+saldo);
				break;
				
			case 9:
				System.out.println(" saliendo del programa gracias por utilizar nuestro servicios");
			break;
			
			default:
				System.out.println("opcion nio valida");
				
			}
			
		}
		
		}
		
		
	
	}

