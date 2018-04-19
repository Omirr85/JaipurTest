package GameObjects;

public class SeriesToken extends Token {

    private int amount;

    public SeriesToken(int amount, int points ) {
        setAmount(amount);
        setPoints(points);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
