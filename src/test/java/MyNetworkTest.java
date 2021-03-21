import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.math.BigInteger;

/**
 * MyNetwork Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>3月 21, 2021</pre>
 */
public class MyNetworkTest {
    // windows 系统创建的文件编码默认为gbk，需要手动修改为UTF-8
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: contains(int id)
     */
    @Test
    public void testContains() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getPerson(int id)
     */
    @Test
    public void testGetPerson() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addPerson(Person person)
     */
    @Test
    public void testAddPerson() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addRelation(int id1, int id2, int value)
     */
    @Test
    public void testAddRelation() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryValue(int id1, int id2)
     */
    @Test
    public void testQueryValue() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryConflict(int id1, int id2)
     */
    @Test
    public void testQueryConflict() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryAcquaintanceSum(int id)
     */
    @Test
    public void testQueryAcquaintanceSum() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: compareAge(int id1, int id2)
     */
    @Test
    public void testCompareAge() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: compareName(int id1, int id2)
     */
    @Test
    public void testCompareName() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryPeopleSum()
     */
    @Test
    public void testQueryPeopleSum() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryNameRank(int id)
     */
    @Test
    public void testQueryNameRank() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: isCircle(int id1, int id2)
     */
    @Test
    public void testIsCircle() throws Exception {
//TODO: Test goes here...
        System.out.println("----testIsCircle----");
        MyPerson p = new MyPerson(1, "xmy", BigInteger.ONE, 233);
        MyPerson p1 = new MyPerson(2, "xmy2", BigInteger.ONE, 233);
        MyPerson p2 = new MyPerson(3, "xmy3", BigInteger.ONE, 233);
        MyPerson p3 = new MyPerson(4, "xmy4", BigInteger.ONE, 233);
        MyPerson p4 = new MyPerson(5, "xmy5", BigInteger.ONE, 233);
        MyPerson p5 = new MyPerson(6, "xmy6", BigInteger.ONE, 233);
        MyPerson p6 = new MyPerson(7, "xmy7", BigInteger.ONE, 233);
        MyPerson p7 = new MyPerson(8, "xmy8", BigInteger.ONE, 233);
        MyPerson p8 = new MyPerson(9, "xmy9", BigInteger.ONE, 233);
        MyPerson p9 = new MyPerson(10, "xm10", BigInteger.ONE, 233);
        MyNetwork network = new MyNetwork();
        network.addPerson(p);
        network.addPerson(p1);
        network.addPerson(p2);
        network.addPerson(p3);
        network.addPerson(p4);
        network.addPerson(p5);
        network.addPerson(p6);
        network.addPerson(p7);
        network.addPerson(p8);
        network.addPerson(p9);
        network.addRelation(1, 2, 233);
        network.addRelation(2, 3, 233);
        network.addRelation(3, 4, 233);
        network.addRelation(4, 5, 233);
        network.addRelation(6,7,244);
        network.addRelation(7,8,24);
        network.addRelation(8,6,21);
        network.addRelation(9,8,201);
        assert (network.isCircle(1, 5));
        assert (!network.isCircle(1, 6));
        assert (network.isCircle(6,9));
        network.addRelation(1,9,250);
        assert (network.isCircle(6,5));
        assert (network.isCircle(10,10));
        assert (!network.isCircle(10,7));
        network.addRelation(10,1,666);
        assert (network.isCircle(10,7));
        System.out.println("----finish-----");
    }


    /**
     * Method: checkCircle(Person p, int id2)
     */
    @Test
    public void testCheckCircle() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MyNetwork.getClass().getMethod("checkCircle", Person.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
