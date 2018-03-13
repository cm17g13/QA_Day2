import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

	private static ArrayList<String> names;
	private static ArrayList<Integer> ages;
	private static ArrayList<String> jobs;
	private static ArrayList<Person> personList;
	
	public static void main(String[] args) {
		names = new ArrayList<String>();
		ages = new ArrayList<Integer>();
		jobs = new ArrayList<String>();
		personList = new ArrayList<Person>();
		names.addAll(Arrays.asList("Peter", "John", "Steve", "Mike", "Luke"));
		ages.addAll(Arrays.asList(22, 31, 55, 75, 26));
		jobs.addAll(Arrays.asList("Postman", "QA Consultant", "Sysadmin", "Programmer", "CEO"));

		for(int i = 0; i < names.size(); i++) {
			personList.add(new Person(names.get(i), ages.get(i), jobs.get(i)));
			System.out.println(personList.get(i));
		}
		
		
		Random rand = new Random();
		int n = rand.nextInt(5);
		System.out.println("You were looking for " + names.get(n) + ", you found: " + searchName(names.get(n)));
	
	}
	
	private static Person searchName(String name) {
		 for (Person person : personList) {
             if(person.toString().contains("Name: "+ name)){
                 return person;
             }
         }
		 return null;
	}

}
