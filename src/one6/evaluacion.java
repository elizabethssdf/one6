package one6;
import java.util.Scanner;
public class evaluacion {
public static void main (String[]args) {
	Scanner teclado=new Scanner (System.in);
	
	double nota=8;
	double mediaevaluacion= 0;
	double totalEvaluaciones =0;
	while(nota != -1) {
		
		System.out.println(" ESCRIBE LA NOTA QUE DARIAS A LA PELICULA MATRIX")
;
		nota=teclado.nextDouble();
		
		if (nota != -1) {
			mediaevaluacion+= nota;
			
			totalEvaluaciones ++;
			
		}
		
	
	}
	System.out.println(" la media de evaluaciones para matrix es:"+mediaevaluacion /totalEvaluaciones);
	
	
}
}
