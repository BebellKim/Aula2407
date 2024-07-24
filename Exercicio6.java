package Aula2407;
import java.util.ArrayList;
import java.util.Random;

public class Exercicio6 {

	public static void main(String[] args) {
		
		 ArrayList<Integer> numeros= new ArrayList<> ();
		 int mult=0;
			
			Random random = new Random();
			
			for (int i = 0; i < 10; i++) {
				int numeroAleatorio = random.nextInt(10);
				numeros.add(numeroAleatorio);
				
			}
			
			for (int numero :numeros) {
				System.out.print(numero + " ");
			}
			
			System.out.println("  ");
			System.out.println("A multiplicação de cada números equivale a: ");
			
			for (int numero :numeros) {
				System.out.print(numero*2 + " ");
			}
			 
			
			

	}

}
