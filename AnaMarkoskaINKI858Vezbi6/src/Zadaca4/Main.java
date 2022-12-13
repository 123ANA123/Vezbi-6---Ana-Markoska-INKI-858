package Zadaca4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2002);
		lista.add(5);
		lista.add(2468);
		lista.add(1010);
		lista.add(2);
				
		Collections.sort(lista);	
		
		System.out.println(lista);
	}
}
