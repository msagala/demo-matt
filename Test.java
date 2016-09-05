package org.lotto.codes.model.codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.lotto.codes.model.Person;

public class Test {

	public static void main(String[] args) {
		
	Person person1 = new Person();
	person1.setName("Matthew");
	person1.setGender("Male");
	Person person2 = new Person();
	person2.setName("Vanessa");
	person2.setGender("Female");
	Person person3 = new Person();
	person3.setName("Sudara");
	person3.setGender("Gay");
	
	List<Person> persons = new ArrayList<Person>();
	persons.add(person1);
	persons.add(person2);
	persons.add(person3);
	
	Iterator<Person> iteratePerson = persons.iterator();
	while(iteratePerson.hasNext()) {
		Person person = iteratePerson.next();
		System.out.println(person.getName());
		System.out.println(person.getGender());
		System.out.println();
	}
	
	}
}
