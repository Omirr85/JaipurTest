package GameObjects;


import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GameContent {
    private List<Card> deck;
    private List<Token> tokens;

    public GameContent()
    {
        deck = new ArrayList<>() {};
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

        tokens = new ArrayList<>() {};
        AddGoodsTokens(GoodType.Diamonds, new Pair[]{new Pair<>(2,7),new Pair<>(3,5)});
        AddGoodsTokens(GoodType.Gold, new Pair[]{new Pair<>(2,6),new Pair<>(3,5)});
        AddGoodsTokens(GoodType.Silver, new Pair[]{new Pair<>(5,5)});
        AddGoodsTokens(GoodType.Leather, new Pair[]{new Pair<>(1,4),new Pair<>(1,3),new Pair<>(1,2),new Pair<>(6,1)});
        AddGoodsTokens(GoodType.Spice, new Pair[]{new Pair<>(1,5),new Pair<>(2,3),new Pair<>(2,2),new Pair<>(2,1)});
        AddGoodsTokens(GoodType.Cloth, new Pair[]{new Pair<>(1,5),new Pair<>(2,3),new Pair<>(2,2),new Pair<>(2,1)});

        AddSeriesTokens(3, new Pair[]{new Pair<>(2,3),new Pair<>(3,2),new Pair<>(2,1)});
        AddSeriesTokens(4, new Pair[]{new Pair<>(2,4),new Pair<>(2,5),new Pair<>(2,6)});
        AddSeriesTokens(5, new Pair[]{new Pair<>(2,8),new Pair<>(1,9),new Pair<>(2,10)});
    }

    private void AddGoodsTokens(GoodType goodType, Pair<Integer,Integer>[] pairs) {
        for (Pair<Integer,Integer> pair : pairs)
            IntStream.iterate(0, i -> i < pair.getKey(), i -> i + 1).forEach(i -> tokens.add(new GoodsToken(goodType, pair.getValue())));
   }

    private void AddSeriesTokens(int amount, Pair<Integer,Integer>[] pairs) {
        for (Pair<Integer,Integer> pair : pairs)
            IntStream.iterate(0, i -> i < pair.getKey(), i -> i + 1).forEach(i -> tokens.add(new SeriesToken(amount, pair.getValue())));
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<Token> getTokens() {
        return tokens;
    }
}
