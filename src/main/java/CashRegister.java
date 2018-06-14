public class CashRegister {

    int total = 0;
    int apples = 0;
    int bananas = 0;
    int cherries = 0;

    public void add(String product) {
        if (isApple(product)) {
            apples++;
            total += 100;
        } else if (isBanana(product)) {
            bananas++;
            if (bananas % 2 == 1) {
                total += 150;
            }
        } else if (isCherry(product)) {
            cherries++;
            if (cherries % 2 == 0) {
                total += 55;
            } else {
                total += 75;
            }
        }
    }

    public int total() {
        return total;
    }

    private boolean isApple(String product) {
        return "apple".equals(product) || "manzana".equals(product) || "apfel".equals(product);
    }

    private boolean isBanana(String product) {
        return "banana".equals(product);
    }

    private boolean isCherry(String product) {
        return "cherry".equals(product);
    }
}
