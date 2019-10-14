import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;
    private static final double DELTA = 0.01;

    @Before
    public void before(){
        manager = new Manager("Ted", 9999, 50000.00, "Management");
    }

    @Test
    public void hasDept(){
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canSetName(){
        manager.setName("Dave");
        manager.setName(null);
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void hasPayBonus(){
//        manager.payBonus();
        assertEquals(500.0, manager.payBonus(),DELTA);
    }

    @Test
    public void hasPayRaise(){
        assertEquals(55000.00000000001, manager.raiseSalary(),DELTA);
    }

    @Test
    public void hasNegativePayRaise(){
        assertEquals(0.00, manager.raiseSalary(),DELTA);
    }

}
