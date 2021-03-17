import com.oocourse.spec1.exceptions.EqualPersonIdException;
import com.oocourse.spec1.exceptions.EqualRelationException;
import com.oocourse.spec1.exceptions.PersonIdNotFoundException;
import com.oocourse.spec1.exceptions.RelationNotFoundException;
import com.oocourse.spec1.main.Network;
import com.oocourse.spec1.main.Person;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MyNetwork implements Network {
    private HashMap<Integer, Person> people;
    private HashSet<Person> hashSet;

    public MyNetwork() {
        people = new HashMap<Integer, Person>();
        hashSet = new HashSet<Person>();
    }

    @Override
    public boolean contains(int id) {
        return people.containsKey(id);
    }

    @Override
    public Person getPerson(int id) {
        if (contains(id)) {
            return people.get(id);
        } else {
            return null;
        }
    }

    @Override
    public void addPerson(Person person) throws EqualPersonIdException {
        if (contains(person.getId())) {
            throw new EqualPersonIdException();
        } else {
            people.put(person.getId(), person);
        }
    }

    @Override
    public void addRelation(int id1, int id2, int value)
            throws PersonIdNotFoundException, EqualRelationException {
        if (!contains(id1) || !contains(id2)) {
            throw new PersonIdNotFoundException();
        } else {
            if (id1 != id2) {
                if (getPerson(id1).isLinked(getPerson(id2))) {
                    throw new EqualRelationException();
                } else {
                    MyPerson myPerson = (MyPerson) getPerson(id1);
                    myPerson.setAcquaintance(getPerson(id2), value);
                    myPerson = (MyPerson) getPerson(id2);
                    myPerson.setAcquaintance(getPerson(id1), value);
                }
            }
        }
    }

    @Override
    public int queryValue(int id1, int id2)
            throws PersonIdNotFoundException, RelationNotFoundException {
        if (!contains(id1) || !contains(id2)) {
            throw new PersonIdNotFoundException();
        } else if (!getPerson(id1).isLinked(getPerson(id2))) {
            throw new RelationNotFoundException();
        } else {
            return getPerson(id1).queryValue(getPerson(id2));
        }
    }

    @Override
    public BigInteger queryConflict(int id1, int id2) throws PersonIdNotFoundException {
        if (!contains(id1) || !contains(id2)) {
            throw new PersonIdNotFoundException();
        } else {
            return getPerson(id1).getCharacter().xor(getPerson(id2).getCharacter());
        }
    }

    @Override
    public int queryAcquaintanceSum(int id) throws PersonIdNotFoundException {
        if (!contains(id)) {
            throw new PersonIdNotFoundException();
        } else {
            return getPerson(id).getAcquaintanceSum();
        }
    }

    @Override
    public int compareAge(int id1, int id2) throws PersonIdNotFoundException {
        if (!contains(id1) || !contains(id2)) {
            throw new PersonIdNotFoundException();
        } else {
            return getPerson(id1).getAge() - getPerson(id2).getAge();
        }
    }

    @Override
    public int compareName(int id1, int id2) throws PersonIdNotFoundException {
        if (!contains(id1) || !contains(id2)) {
            throw new PersonIdNotFoundException();
        } else {
            return getPerson(id1).getName().compareTo(getPerson(id2).getName());
        }
    }

    @Override
    public int queryPeopleSum() {
        return people.size();
    }

    @Override
    public int queryNameRank(int id) throws PersonIdNotFoundException {
        if (!contains(id)) {
            throw new PersonIdNotFoundException();
        } else {
            int sum = 0;
            for (Map.Entry<Integer, Person> integerPersonEntry : people.entrySet()) {
                Person person = integerPersonEntry.getValue();
                if (compareName(id, person.getId()) > 0) {      //compare himself
                    sum++;
                }
            }
            return sum + 1;
        }
    }

    @Override
    public boolean isCircle(int id1, int id2) throws PersonIdNotFoundException {
        if (!contains(id1) || !contains(id2)) {
            throw new PersonIdNotFoundException();
        } else if (id1 == id2) {
            return true;
        } else {
            hashSet = new HashSet<Person>();
            hashSet.add(getPerson(id1));
            ArrayList<Person> people1 = ((MyPerson) getPerson(id1)).getAcquaintance();
            for (Person p : people1) {
                if (p.getId() == id2) {
                    return true;
                } else if (!hashSet.contains(p)) {
                    hashSet.add(p);
                    boolean r = checkCircle(p, id2);
                    if (r) {
                        return true;
                    }
                }
            }
        }
        for (Person p : hashSet) {      //其实没必要？
            if (p.getId() == id2) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCircle(Person p, int id2) {
        ArrayList<Person> people1 = ((MyPerson) p).getAcquaintance();
        for (Person temp : people1) {
            if (temp.getId() == id2) {
                return true;
            } else if (!hashSet.contains(temp)) {
                hashSet.add(temp);
                boolean r = checkCircle(temp, id2);
                if (r) {
                    return true;
                }
            }
        }
        return false;
    }
}
