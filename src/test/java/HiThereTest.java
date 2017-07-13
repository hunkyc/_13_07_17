import org.junit.Test;

import static org.junit.Assert.*;
//import static org.junit.assertTrue;

/**
 * Created by martinsmith on 13/7/17.
 */
public class HiThereTest {
    @Test

    public void testHiThere() throws Exception {
        HiThere h = new HiThere("Marty");
        assertTrue(h.getOutput().equals("Hi There Marty"));
    }
}