package Aula2407;
import java.util.ArrayList;
import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
    ArrayList<Integer> numeros= new ArrayList<> ();
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(10);
			numeros.add(numeroAleatorio);
			
		}
		
		for (int numero :numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(4);
		System.out.println(numeros);
	}

}
