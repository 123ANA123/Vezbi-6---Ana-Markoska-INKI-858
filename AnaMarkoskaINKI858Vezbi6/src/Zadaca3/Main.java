package Zadaca3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("INKI");
		lista.add("IKT");
		lista.add("KNI");
		System.out.println("Pred dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(lista);

		lista.add(2, "MIS");
		System.out.println("Po dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(lista);
	}
}