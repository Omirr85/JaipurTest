package GameObjects;

public class GoodsToken extends  Token {
    public GoodsToken(GameObjects.GoodType goodType, int points) {
        setGoodType(goodType);
        setPoints(points);
    }

    public GoodType getGoodType() {
        return GoodType;
    }

    public void setGoodType(GoodType goodType) {
        this.GoodType = goodType;
    }

    GoodType GoodType;
}
