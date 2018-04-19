package GameObjects;

public class GoodsToken extends  Token {
    public GoodType getGoodType() {
        return GoodType;
    }

    public void setGoodType(GoodType goodType) {
        this.GoodType = goodType;
    }

    GoodType GoodType;
}
