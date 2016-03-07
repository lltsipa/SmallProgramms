package testPrograms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by lodz on 2016/03/06.
 */
public class programTest {
    private Floating f2;
    private Integer i2;
    private ObjectEquality oE2;
    private ObjectIdentity oI;
    private Truth tru;
    private False fal;
    private Null nu;
    private NonNullness nns;
    private Failing failing;
    private Exceptions exceptions;
    private Disabling disabling;
    private ArrayContent arrayContent;
    @Before
    public void setUp() throws java.lang.Exception {
        f2 = new Floating();
        i2 = new Integer();
        oE2 = new ObjectEquality();
        tru = new Truth();
        fal = new False();
        nu = new Null();
        nns = new NonNullness();
        failing = new Failing();
        exceptions = new Exceptions();
        disabling = new Disabling();
        arrayContent = new ArrayContent();
    }

    @Test
    public void testFloat() throws java.lang.Exception {
        Assert.assertEquals(5.0f, f2.insertFloat(2.5f, 2.5f), 0);

    }

    @Test
    public void testInteger() throws java.lang.Exception {
        Assert.assertEquals(5,i2.insertInt(2,3));
    }

    @Test
    public void testObjectEquality() throws java.lang.Exception {
     //   ObjectEquality oE1 = new ObjectEquality();
        Assert.assertTrue(oE2.insertObject(7, 7));
    }

    @Test
    public void testObjectIdentity() throws java.lang.Exception {
        ObjectIdentity obj1 = new ObjectIdentity();
        ObjectIdentity obj2 = new ObjectIdentity();

        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testTruth() throws java.lang.Exception {
        Assert.assertTrue(tru.checkEven(4));

    }

    @Test
    public void testFalse() throws java.lang.Exception {
        Assert.assertFalse(fal.checkOdd(3));

    }

    @Test
    public void testNull() throws java.lang.Exception {
        Assert.assertNull(nu.checkNull());

    }

    @Test
    public void testNonNullness() throws java.lang.Exception {
        Assert.assertNotNull(nns.checkNonNull());
    }

    @Test
    public void testFailing() throws java.lang.Exception {
        Assert.assertEquals(3,failing.fail());
        fail("Failed even thou its correct");

    }

    @Test
    public void testException() throws Exception {
        try {
            Assert.assertEquals(exceptions.divideByZero(16, 0), 7);
        }catch (Exception e)
        {}


    }

    @Ignore
    public void testDisabling() throws Exception {

        Assert.assertEquals(2, disabling.number());
    }

    @Test
    public void testArrayContent() throws Exception {
        int [] alst = {1,2,3,4,5};
        
        Assert.assertArrayEquals(alst, arrayContent.valueList());

    }
}
