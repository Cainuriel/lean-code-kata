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

    @Test
    public void unknown_product_costs_0_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("any product");

        assertEquals(0, cashRegister.total());
    }

    @Test
    public void should_return_the_total_of_two_products() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("banana");
        cashRegister.add("cherry");

        assertEquals(225, cashRegister.total());
    }

    @Test
    public void cherries_have_20_cents_discount_buying_two_products() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("cherry");
        cashRegister.add("cherry");

        assertEquals(130, cashRegister.total());
    }

    @Test
    public void buy_two_bananas_and_get_one_free() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("banana");
        cashRegister.add("banana");

        assertEquals(150, cashRegister.total());
    }
}
