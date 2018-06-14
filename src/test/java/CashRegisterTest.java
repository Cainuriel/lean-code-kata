import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashRegisterTest {
    @Test
    public void apple_costs_100_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("apple");

        assertEquals(100, cashRegister.total());
    }
}
