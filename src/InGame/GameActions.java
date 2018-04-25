package InGame;

import GameObjects.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GameActions {
    public static ArrayList<Token> SellGoods(GameContent game, ArrayList<Card> tradeList) {
        if (tradeList.isEmpty())
            return null;

        var goodTypes = tradeList.stream().map(e -> (GoodsCard) e).collect(groupingBy(GoodsCard::getGoodType));
        if (goodTypes.size() > 1)
            return null;

        var group = goodTypes.values().stream().findFirst().get();
        var type = group.stream().findFirst().get().getGoodType();
        var amount = group.size();

        if (amount == 1 && (type == GoodType.Diamonds || type == GoodType.Gold || type == GoodType.Silver))
            return null;

        ArrayList<Token> tokens = game.getTokens().stream()
                .filter(x -> ((GoodsToken)x).getGoodType() == type)
                .limit(amount).map(x -> (Token)x).collect(Collectors.toCollection(ArrayList::new));

        if (amount > 2)
            tokens.add(game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken)x).getAmount() == Math.min(amount,5)).limit(1).findFirst().get());


        return tokens;
    }
}
