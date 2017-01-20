
public enum Menu {

	ADD_TO_ARRAYLIST(1, "1 - Dodaj u¿ytkownika do ArrayListy"), 
	PRINT_ARRAYLIST(2,"2 - Poka¿ zawartoœæ Arraylisty"), 
	ADD_TO_LINKEDLIST(3, "3 - Dodaj u¿ytkownika do LinkedListy"), 
	PRINT_LINKEDLIST(4,"4 - Poka¿ zawartoœæ LinkedListy"), 
	ADD_TO_TREESET(5, "5 - Dodaj u¿ytkownika do TreeSet"), 
	PRINT_TREESET(6,"6 - Poka¿ zawartoœæ Treeset"), 
	ADD_TO_HASHMAP(7,"7 - Dodaj u¿ytkownika do HashMapy"),
	EXIT(0, "0 - Wyjdz z programu");

	private int value;

	public int getValue() {
		return value;
	}

	private String opis;

	Menu(int value, String opis) {
		this.value = value;
		this.opis = opis;
	}

	public String getOpis() {
		return opis;
	}

	@Override
	public String toString() {
		return value + " - " + opis;
	}

	public static Menu createFromInt(int option){
		
		return Menu.values()[option];
	}


	}

