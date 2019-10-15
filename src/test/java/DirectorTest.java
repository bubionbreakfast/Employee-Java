import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;
    private static final double DELTA = 0.01;


    @Before
    public void before(){
        director = new Director("Alison", 98765, 100.09, 1111.11);
    }

    @Test
    public void hasBudget(){
        assertEquals(1111.11, director.getBudget(),DELTA);
    }
    @Test
    public void hasPayBonus(){
//        manager.payBonus();
        assertEquals(2.0018000000000002, director.payBonus(),DELTA);
    }

    @Test
    public void hasPayRaise(){
        assertEquals(110.09900000000002, director.raiseSalary(),DELTA);
    }
}
