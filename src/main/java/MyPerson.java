import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class MyPerson implements Person {
    private int id;
    private String name;
    private BigInteger character;
    private int age;
    private HashMap<Person, Integer> map;
    private ArrayList<Person> acquaintance;

    public MyPerson(int id, String name, BigInteger character, int age) {
        this.id = id;
        this.name = name;
        this.character = character;
        this.age = age;
        map = new HashMap<Person, Integer>();
        acquaintance = new ArrayList<Person>();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigInteger getCharacter() {
        return character;
    }

    @Override
    public int getAge() {
        return age;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return person.getId() == id;
    }

    public int hashCode() {
        return id;
    }

    @Override
    public boolean isLinked(Person person) {
        if (person.getId() == id) {
            return true;
        } else {
            return map.containsKey(person);
        }
    }

    @Override
    public int queryValue(Person person) {
        return map.getOrDefault(person, 0);
    }

    @Override
    public int getAcquaintanceSum() {
        return map.size();
    }

    @Override
    public int compareTo(Person p2) {
        return name.compareTo(p2.getName());
    }

    public void setAcquaintance(Person person, int value) {
        map.put(person, value);
        acquaintance.add(person);
    }

    public ArrayList<Person> getAcquaintance() {
        return acquaintance;
    }

}
