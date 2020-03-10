import java.util.Locale;
import java.util.Scanner;

public class vectorType1 {
	public static void main(String[] args) {
	
		// Program prepared to make simple vect calc
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
	// simple format when I´ve already know the numbers
		int v[] = {4,5,6,7,8};
		for( int i=0; i<=4; i++) {
			System.out.println("Na posição "
			+ i 
			+" temos o valor " + v[i]);	
			}
		System.out.println(" ---------------------------------");
		System.out.println();
				
	// Using Avarege calc
	//format when the operator has to put the numbers 
								
		System.out.println(" Enter the Number of candidades :");
		int n = sc.nextInt();
		double vect[] = new double [n];
		for( int c=0; c<n; c++) {		
			System.out.println( "Candidate N#" + c  + " Enter height : ");
			vect[c]= sc.nextDouble();	
			}	
		double soma = 0;
		for ( int c=0; c<n; c++) {		
			soma+=vect[c];	
			}
		double avg = (soma/n);
		System.out.printf(" Average Height is %.2f%n",avg);
		sc.close();
			}
		}

	
