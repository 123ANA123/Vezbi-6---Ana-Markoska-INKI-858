package Zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fakultet> lista = new ArrayList<Fakultet>();

		Fakultet f =  new Fakultet("FIKT",3,1500);
		lista.add(f);
		lista.add(new Fakultet("FI", 3, 1500));
		lista.add(new Fakultet("FINKI", 7, 1400));
		lista.add(new Fakultet("PDU", 5, 800));
		lista.add(new Fakultet("PMF", 9, 1500));

		for(int i=0;i<lista.size();i++){
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getBrojSmerovi());
			System.out.println(lista.get(i).getVkupnoStudenti());
		}
	}
}
