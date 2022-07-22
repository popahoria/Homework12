package Exercise2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListOfPerson {
    private List<Person> listOfPerson;

    public ListOfPerson(List<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

    public List<String> personName() {
        List<String> nameList = new LinkedList<>();
        for (Person person : listOfPerson) {
            nameList.add(person.getName());
        }
        return nameList;
    }

    public Map<String, Integer> fromPersonToAge() {
        Map<String, Integer> nameToAge = new HashMap<>();
        for (Person person : listOfPerson) {
            nameToAge.put(person.getName(), person.getAge());
        }
        return nameToAge;
    }

    public List<Person> olderThanGivenAge(int age) {
        List<Person> olderPerson = new LinkedList<>();
        for (Person person : listOfPerson) {
            if (person.getAge() > age) {
                olderPerson.add(person);
            }
        }
        return olderPerson;
    }

    public Map<String, List<String>> fromHairColorToName() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : listOfPerson) {
            List<String> name = result.get(person.getHairColour());
            if (name == null) {
                name = new LinkedList<>();
                result.put(person.getHairColour(), name);
            }
            name.add(person.getName());
        }
        return result;
    }

    public Map<Integer, List<Person>> fromAgeToPerson() {
        Map<Integer, List<Person>> result = new HashMap<>();
        for (Person person : listOfPerson) {
            List<Person> name = result.get(person.getAge());
            if (name == null) {
                name = new LinkedList<>();
                result.put(person.getAge(), name);
            }
            name.add(person);
        }
        return result;
    }
}
