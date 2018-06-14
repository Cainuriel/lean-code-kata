public class CashRegister {

    int total = 0;

    public void add(String product) {
        if ("apple".equals(product)) {
            total += 100;
        } else {
            total += 150;
        }
    }

    public int total() {
        return total;
    }
}
