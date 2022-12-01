import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.swing.JOptionPane;

/**
 * @author Milan Palmer
 * @version 1.0
 */

public class ShopTest
{
    @Test
    public void constructorTest(){
        Shop poundland = new Shop(100);
        assertEquals(100, poundland.getPrice());
        assertEquals(0,   poundland.getNoOfItemsSold());
        
        Shop fiverr = new Shop(500);
        assertEquals(500, fiverr.getPrice());
        assertEquals(0,   fiverr.getNoOfItemsSold());
        
    }
    
    @Test
    public void sellTest(){
        Shop poundland = new Shop(100);
        poundland.sell(4);
        assertEquals(100, poundland.getPrice());
        assertEquals(4,   poundland.getNoOfItemsSold());
        poundland.sell(6);
        assertEquals(100, poundland.getPrice());
        assertEquals(10,   poundland.getNoOfItemsSold());
    }
    
    @Test
    public void totalTest(){
        Shop poundland = new Shop(100);
        poundland.sell(4);
        assertEquals(400, poundland.getTotal());
        poundland.sell(6);
        assertEquals(1000, poundland.getTotal());
        JOptionPane.showMessageDialog(null,poundland);
    }
    
}
