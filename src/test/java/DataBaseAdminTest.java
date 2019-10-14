import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    private DataBaseAdmin dataBaseAdmin;
    private static final double DELTA = 0.01;


    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Ahmed", 87654, 89000.37);
    }

    @Test
    public void hasPayBonus(){
//        manager.payBonus();
        assertEquals(890.0037, dataBaseAdmin.payBonus(),DELTA);
    }

    @Test
    public void hasPayRaise(){
        assertEquals(97900.407, dataBaseAdmin.raiseSalary(),DELTA);
    }
}
