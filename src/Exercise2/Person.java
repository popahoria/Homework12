package Exercise2;

public class Person {
    private String name;
    private int age;
    private String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour='" + hairColour + '\'' +
                '}';
    }
}
