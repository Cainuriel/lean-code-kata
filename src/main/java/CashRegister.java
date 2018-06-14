public class CashRegister {

    private static final int APPLE_PRICE = 100;
    private static final int BANANA_PRICE = 150;
    private static final int CHERRY_PRICE = 75;
    private static final int CHERRY_PRICE_DISCOUNT = 20;
    private int total = 0;
    private int apples = 0;
    private int bananas = 0;
    private int cherries = 0;

    public void add(String product) {
        if ("apple".equals(product)) {
            apples++;
            total += APPLE_PRICE;
        } else if ("manzana".equals(product)) {
            apples++;
            if (apples % 3 != 0) {
                total += APPLE_PRICE;
            }
        } else if ("apfel".equals(product)) {
            apples++;
            total += APPLE_PRICE;
        } else if (isBanana(product)) {
            bananas++;
            if (bananas % 2 == 1) {
                total += BANANA_PRICE;
            }
        } else if (isCherry(product)) {
            cherries++;
            if (cherries % 2 == 0) {
                total += CHERRY_PRICE - CHERRY_PRICE_DISCOUNT;
            } else {
                total += CHERRY_PRICE;
            }
        }
    }

    public int total() {
        return total;
    }

    private boolean isBanana(String product) {
        return "banana".equals(product);
    }

    private boolean isCherry(String product) {
        return "cherry".equals(product);
    }
}
