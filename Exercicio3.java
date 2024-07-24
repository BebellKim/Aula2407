package Aula2407;
import java.util.ArrayList;

public class Exercicio3 {

	public static void main(String[] args) {
		 
		ArrayList<Integer> numeros = new ArrayList<> ();
		
		numeros.add(10);
		numeros.add(20);
		
		System.out.println(numeros.get(0)); // add um valor
		System.out.println(numeros.get(1));
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); //add um valor na posição 1
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); //add um valor na posição 0
		
		System.out.println(numeros.size()); // saída
		
	}

}
