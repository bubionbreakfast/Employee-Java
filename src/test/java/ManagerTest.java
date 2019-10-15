import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;
    private Manager manager2;
    private static final double DELTA = 0.01;

    @Before
    public void before(){
        manager = new Manager("Ted", 9999, 50000.00, "Management");
        manager2 = new Manager("Ted", 9999, 4444.00, "Management");
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
        manager.payBonus();
        assertEquals(50000.0, manager.getSalary(),DELTA);
    }

    @Test
    public void hasPayRaise(){
        manager.raiseSalary();
        assertEquals(4444.0, manager2.getSalary(),DELTA);
    }

    @Test
    public void hasNegativePayRaise(){
//        manager2.payIncrease(9.77);
//        manager.setRaiseSalary(2.22);
        assertEquals(57727.56, manager2.payIncrease(12.99),DELTA);
    }

}
