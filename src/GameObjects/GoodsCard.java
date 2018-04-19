package GameObjects;

public class GoodsCard extends Card {
    public GoodsCard(GameObjects.GoodType goodtype) {
        setGoodType(goodtype);
    }

    public GoodType getGoodType() {
        return GoodType;
    }

    public void setGoodType(GoodType goodType) {
        this.GoodType = goodType;
    }

    GoodType GoodType;
}


