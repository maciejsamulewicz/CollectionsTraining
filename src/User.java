
import java.util.NoSuchElementException;
import java.util.Scanner;

public class User {

	private String firstName;
	private String lastName;
	private String country;
	private int age;

	Scanner sc = new Scanner(System.in);

	public User(String firstName, String lastName, String country, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setCountry(country);
		setAge(age);

	}

	public User() {

	}

	public User addUser() {

		try {

			System.out.println("Podaj imiê u¿ytkownika: ");
			firstName = sc.nextLine();
			sc.nextLine();
			System.out.println("Podaj nazwisko u¿ytkownika: ");
			lastName = sc.nextLine();
			System.out.println("Podaj kraj, z którego pochodzi u¿ytkownik: ");
			country = sc.nextLine();
			System.out.println("Podaj wiek u¿ytkownika: ");
			age = sc.nextInt();

		} catch (NoSuchElementException | IllegalStateException e) {

			System.err.println("NoSuchElementException");
		}

		return new User(firstName, lastName, country, age);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "U¯YTKOWNIK: " + firstName + " " + lastName + " - " + country + ", wiek: " + age + " lat";
	}

	public void printOptions() {
		System.out.println("*****************************************");
		System.out.println("Dostêpne opcje programu: ");
		System.out.println();

		for (Menu m : Menu.values()) {

			System.out.println(m.getOpis());

		}
	}
}
