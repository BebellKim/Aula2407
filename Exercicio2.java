package Aula2407;
import java.util.ArrayList;

import java.util.Arrays;

public class Exercicio2 {


	public static void main(String[] args) {
    	String[] disciplinas = {"Matemática", "Filosofia", "História", "Física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Língua Inglesa");
		novaLista.add("Educação Física");
		novaLista.add("Sociologia");
		
		
		for(String i: novaLista)
		{
			System.out.println("Disciplina: "+ i);
		
		
		}
	}

}
