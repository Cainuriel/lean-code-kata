public class CashRegister {

    int total = 0;

    public void add(String product) {
        if ("apple".equals(product)) {
            total += 100;
        } else if ("banana".equals(product)) {
            total += 150;
        } else if ("cherry".equals(product)) {
            total += 75;
        }
    }

    public int total() {
        return total;
    }
}
