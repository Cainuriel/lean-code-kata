import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashRegisterTest {
    @Test
    public void apple_costs_100_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("apple");

        assertEquals(100, cashRegister.total());
    }

    @Test
    public void banana_costs_150_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("banana");

        assertEquals(150, cashRegister.total());
    }


    @Test
    public void cherry_costs_75_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("cherry");

        assertEquals(75, cashRegister.total());
    }
}
