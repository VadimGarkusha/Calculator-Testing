import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by m18 on 23.12.2015.
 */
public class TestMyCalculator {

    @BeforeClass
    public static void TestStarted() {System.out.println("All tests started!");}

    @Before
    public void StartTest() {System.out.println("Test started.");}

    @After
    public void FinishTest() {System.out.println("Test passed.");}

    @AfterClass
    public static void TestFinished() {System.out.println("All successfully tests finished!");}

    /*addiotion*/
    @Test
    public void AddPosValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 4.0, calc.add(2,2), 0.001 );
    }

    @Test
    public void AddNegValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( -4.0, calc.add(-2,-2), 0.001 );
    }

    /**subtraction*/
    @Test
    public void SubPosValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 2.0, calc.sub(4,2), 0.001 );
    }

    @Test
    public void SubNegValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( -2.0, calc.sub(-4,-2), 0.001 );
    }

    /*multiplication*/
    @Test
    public void MultPosValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 8.0, calc.mult(4,2), 0.001 );
    }
    @Test
    public void MultNegValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 8.0, calc.mult(-4,-2), 0.001 );
    }

    /*division*/
    @Test
    public void DivPosValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 2.0, calc.div(4,2), 0.001 );
    }
    @Test
    public void DivNegValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 2.0, calc.div(-4,-2), 0.001 );
    }

    /*extraction of root(only positive values)*/
    @Test
    public void SqrtPosValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 2.0, calc.sqrt(4), 0.001 );
    }

    /*sqr values*/
    @Test
    public void SqrPosValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 4.0, calc.pow(2,2), 0.001 );
    }
    @Test
    public void SqrNegValues() {

        MyCalculator calc = new MyCalculator();
        assertEquals( 4.0, calc.pow(-2,2), 0.001 );
    }
















    }





































