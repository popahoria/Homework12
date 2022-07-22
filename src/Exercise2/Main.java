package Exercise2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new LinkedList<>();
        person.add(new Person("Mihai", 30, "saten"));
        person.add(new Person("Andra", 27, "blond"));
        person.add(new Person("Adrian", 32, "brunet"));
        person.add(new Person("Valentina", 46, "roscat"));
        ListOfPerson listOfPerson = new ListOfPerson(person);
        System.out.println(listOfPerson.personName());
        System.out.println(listOfPerson.fromPersonToAge());
        System.out.println(listOfPerson.olderThanGivenAge(30));
        System.out.println(listOfPerson.fromHairColorToName());
        System.out.println(listOfPerson.fromAgeToPerson());

    }
}
