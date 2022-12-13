package Zadaca2;

import java.util.ArrayList;
import java.util.List;

	public class Main {

		public static void main(String[] args) {
			List<String> lista = new ArrayList<String>();
			lista.add("Makedonija");
			lista.add("Srbija");
			lista.add("Italija");
			lista.add("Slovenija");
			lista.add("Turcija");

			System.out.println("Listata sodrzi "+ lista.size()+" elementi.");

			if(lista.size() == 3) {    
				lista.add("Rusija");
				lista.add("Austrija");

				System.out.println(lista);
			}
			else {
				System.out.println(lista);
			}
		}
	}
