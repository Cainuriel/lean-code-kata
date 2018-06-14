public class CashRegister {

    int total = 0;
    int apples = 0;
    int bananas = 0;
    int cherries = 0;

    public void add(String product) {
        if ("apple".equals(product)) {
            apples++;
            total += 100;
        } else if ("banana".equals(product)) {
            total += 150;
            bananas++;
        } else if ("cherry".equals(product)) {
            cherries++;
            if (cherries % 2 == 0) {
                total += 45;
            } else {
                total += 75;
            }
        }
    }

    public int total() {
        return total;
    }
}
