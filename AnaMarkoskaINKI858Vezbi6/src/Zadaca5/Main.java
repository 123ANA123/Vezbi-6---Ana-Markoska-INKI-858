package Zadaca5;

import java.util.ArrayList;
import java.util.List;

	public class Main {

		public static void main(String[] args) {
			List<Integer> lista = new ArrayList<Integer>();
			lista.add(10);
			lista.add(20);
			lista.add(30);
			lista.add(100);
			lista.add(200);
			
			System.out.println("Vtoriot element e: "+lista.get(1));
		}
	}
