public class CashRegister {

    int total = 0;
    int apples = 0;
    int bananas = 0;
    int cherries = 0;

    public void add(String product) {
        if ("apple".equals(product) || "manzana".equals(product) || "apfel".equals(product)) {
            apples++;
            total += 100;
        } else if ("banana".equals(product)) {
            bananas++;
            if (bananas % 2 == 1) {
                total += 150;
            }
        } else if ("cherry".equals(product)) {
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
}
