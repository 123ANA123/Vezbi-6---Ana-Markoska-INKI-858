package Zadaca11;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> l1 =  new ArrayList<String>();
		l1.add("Eden");
		l1.add("Dva");
		l1.add("Tri");

		List<String> l2 = new ArrayList<String>();
		l2.add("Cetiri");
		l2.add("Pet");
		l2.add("Sest");

		l1.retainAll(l2);

		System.out.println(l1);
	}
}
