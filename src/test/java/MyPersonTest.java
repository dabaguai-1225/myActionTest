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
        Person p = new MyPerson(1, "xmy", BigInteger.ONE, 21);
        assert (p.getId() == 1);
        System.out.println("finish");
    }

    /**
     * Method: getName()
     */
    @Test
    public void testGetName() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getCharacter()
     */
    @Test
    public void testGetCharacter() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAge()
     */
    @Test
    public void testGetAge() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: equals(Object obj)
     */
    @Test
    public void testEquals() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: hashCode()
     */
    @Test
    public void testHashCode() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: isLinked(Person person)
     */
    @Test
    public void testIsLinked() throws Exception {
//TODO: Test goes here... 
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
