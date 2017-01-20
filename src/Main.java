import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User i = new User();
		
		
		ArrayList<User> arrayLista = new ArrayList<>();
		LinkedList<User> linkedLista = new LinkedList<>();
		TreeSet<User> treeSet = new TreeSet<>();
		HashMap<Integer, User> hashMap = new HashMap<>();
		int option = 50;
		
		
		
		while (option != 0){

			i.printOptions();
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				arrayLista.add(i.addUser());
				break;
			case 2:
				System.out.println(arrayLista);
				break;
			case 3:
				linkedLista.add(i.addUser());
				break;
			case 4:
				System.out.println(linkedLista);
				break;
			case 5:
				treeSet.add(i.addUser());
				break;
			case 6:
				System.out.println(treeSet);
				break;
			case 7:
				
			case 0:
				System.out.println("Dziêkujemy za skorzystanie z programu, do zobaczenia! ");
				return;
				
				default:
					
				System.out.println("Podaj, który numer wybierasz: ");
			}

		}

		sc.close();
	}

}
