package GameObjects;


import java.util.ArrayList;
import java.util.List;

public class GameContent {
    private List<Card> deck;

    public GameContent()
    {
        deck = new ArrayList<>() {
        };
        for (int i=0;i<11;i++)
            deck.add(new CamelCard());
        for (int i=0;i<6;i++)
            deck.add(new GoodsCard(GoodType.Diamonds));
        for (int i=0;i<6;i++)
            deck.add(new GoodsCard(GoodType.Silver));
        for (int i=0;i<6;i++)
            deck.add(new GoodsCard(GoodType.Gold));
        for (int i=0;i<8;i++)
            deck.add(new GoodsCard(GoodType.Spice));
        for (int i=0;i<8;i++)
            deck.add(new GoodsCard(GoodType.Cloth));
        for (int i=0;i<10;i++)
            deck.add(new GoodsCard(GoodType.Leather));



    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}
