import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tjung on 1/26/17.
 */
public class rideTest {
    @Test
    public void convertToCode() throws Exception {
        int code = ride.convertToCode("COMETQ");
        assertEquals(27, code);
    }
}