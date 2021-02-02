package dias_semnana;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		 int numeroDigitado ;
		 
		 System.out.print("Digite um número ente 1 e 7: ");
			numeroDigitado = leitura.nextInt();
			
			if( numeroDigitado >=1 &&  numeroDigitado <= 7) {
			System.out.print("\nO número digitado equivale a : ");
			}

	        switch (numeroDigitado){
	            case 1:
	                System.out.println("Domingo,");
	                break;
	            case 2:
	                System.out.println("Segunda-feira.");
	                break;
	            case 3:
	                System.out.println("Terça-feira.");
	                break;  
	            case 4:
	                System.out.println("Quarta-feira.");
	                break;      
	            case 5:
	                System.out.println("Quinta-feira.");
	                break;  
	            case 6:
	                System.out.println("Sexta-feira.");
	                break; 
	            case 7:
	                System.out.println("Sábado.");
	                break; 
	            default:
	                System.out.println("\nDIGITE SOMENTE NÚMEROS ENTRE 1 e 7");
	                break; 
	        }
	    leitura.close();     
	}
}
