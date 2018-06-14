import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashRegisterTest {

    private static final int APPLE_PRICE = 100;
    private static final int BANANA_PRICE = 150;
    private static final int CHERRY_PRICE = 75;

    @Test
    public void apple_costs_100_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("apple");

        assertEquals(APPLE_PRICE, cashRegister.total());
    }

    @Test
    public void banana_costs_150_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("banana");

        assertEquals(BANANA_PRICE, cashRegister.total());
    }

    @Test
    public void cherry_costs_75_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("cherry");

        assertEquals(CHERRY_PRICE, cashRegister.total());
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

        assertEquals(BANANA_PRICE + CHERRY_PRICE, cashRegister.total());
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

        assertEquals(BANANA_PRICE, cashRegister.total());
    }

    @Test
    public void manzana_is_equivalent_to_apple() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("manzana");

        assertEquals(APPLE_PRICE, cashRegister.total());
    }

    @Test
    public void apfel_is_equivalent_to_apple() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("apfel");

        assertEquals(APPLE_PRICE, cashRegister.total());
    }

    @Test
    public void three_manzanas_cost_200_cents() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("manzana");
        cashRegister.add("manzana");
        cashRegister.add("manzana");

        assertEquals(APPLE_PRICE * 2, cashRegister.total());
    }

    @Test
    @Ignore
    public void iteration5_acceptance_test() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.add("apfel");
        cashRegister.add("manzana");
        cashRegister.add("manzana");
        cashRegister.add("apple");
        cashRegister.add("manzana");
        cashRegister.add("apfel");
        cashRegister.add("cherry");
        cashRegister.add("cherry");

        assertEquals(580, cashRegister.total());
    }
}
