import org.junit.Test;

import static org.junit.Assert.*;
public class CashBackServiceTest {
    @Test

    public void shouldCalcSumRemain() {
        CashBackService service = new CashBackService();

        int amount;
        int actual = service.remain(200);
        int expected = 800;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldShowNull() {
        CashBackService service = new CashBackService();

        int amount;
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
  
}