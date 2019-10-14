import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;
    private static final double DELTA = 0.01;


    @Before
    public void before(){
        developer = new Developer("Jordan", 98765, 20000.98);
    }

    @Test
    public void hasPayBonus(){
//        manager.payBonus();
        assertEquals(200.0098, developer.payBonus(),DELTA);
    }

    @Test
    public void hasPayRaise(){
        assertEquals(22001.078, developer.raiseSalary(),DELTA);
    }

}
