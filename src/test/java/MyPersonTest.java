import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.math.BigInteger;

/**
 * MyPerson Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>3�� 17, 2021</pre>
 */
public class MyPersonTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getId()
     */
    @Test
    public void testGetId() throws Exception {
//TODO: Test goes here...
        System.out.println("----testGetId----");
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        assert (p.getId() == 1);
        System.out.println("----finish----");
    }

    /**
     * Method: getName()
     */
    @Test
    public void testGetName() throws Exception {
//TODO: Test goes here...
        System.out.println("----testGetName----");
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        assert (p.getName().compareTo("xmy") == 0);
        System.out.println("----finish----");
    }

    /**
     * Method: getCharacter()
     */
    @Test
    public void testGetCharacter() throws Exception {
//TODO: Test goes here...
        System.out.println("----testGetCharacter----");
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        assert (p.getCharacter().equals(BigInteger.ONE));
        System.out.println("----finish----");
    }

    /**
     * Method: getAge()
     */
    @Test
    public void testGetAge() throws Exception {
//TODO: Test goes here...
        System.out.println("----testGetAge----");
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        assert (p.getAge() == 21);
        System.out.println("----finish----");
    }

    /**
     * Method: equals(Object obj)
     */
    @Test
    public void testEquals() throws Exception {
//TODO: Test goes here...
        System.out.println("----testGetEquals----");
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        Person p1 = new MyPerson(1, "aaa", BigInteger.ZERO, 233);
        Person p2 = new MyPerson(2, "xmy", BigInteger.ONE, 21);
        assert (p.equals(p1));
        assert (!p.equals(p2));
        System.out.println("----finish----");
    }

    /**
     * Method: hashCode()
     */
    @Test
    public void testHashCode() throws Exception {
//TODO: Test goes here...
        System.out.println("----testHashCode----");
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        assert (p.hashCode() == 1);
        System.out.println("----finish----");
    }

    /**
     * Method: isLinked(Person person)
     */
    @Test
    public void testIsLinked() throws Exception {
//TODO: Test goes here...
        System.out.println("----testIsLinked----");
        MyPerson p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        MyPerson p1 = new MyPerson(2, "abb", BigInteger.ZERO, 22);
        p.setAcquaintance(p1, 233);
        assert (p.queryValue(p1) == 233);
        assert (p.isLinked(p));
        System.out.println("----finish----");
    }

    /**
     * Method: queryValue(Person person)
     */
    @Test
    public void testQueryValue() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAcquaintanceSum()
     */
    @Test
    public void testGetAcquaintanceSum() throws Exception {
//TODO: Test goes here...
        System.out.println("----testGetAcquaintanceSum----");
        MyPerson p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        MyPerson p1 = new MyPerson(2, "abb", BigInteger.ZERO, 22);
        MyPerson p2 = new MyPerson(3, "nmsl", BigInteger.ZERO, 22);
        MyPerson p3 = new MyPerson(4, "zakr", BigInteger.ZERO, 22);
        MyPerson p4 = new MyPerson(5, "zsnmdexac", BigInteger.ZERO, 22);
        p.setAcquaintance(p1, 233);
        p.setAcquaintance(p2, 23);
        p.setAcquaintance(p3, 2);
        p.setAcquaintance(p4, 222);
        p1.setAcquaintance(p, 233);
        p1.setAcquaintance(p1, 233);
        assert (p.getAcquaintanceSum() == 4);
        assert (p1.getAcquaintanceSum() == 2);
        System.out.println("----finish----");
    }

    /**
     * Method: compareTo(Person p2)
     */
    @Test
    public void testCompareTo() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setAcquaintance(Person person, int value)
     */
    @Test
    public void testSetAcquaintance() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAcquaintance()
     */
    @Test
    public void testGetAcquaintance() throws Exception {
//TODO: Test goes here... 
    }


} 
