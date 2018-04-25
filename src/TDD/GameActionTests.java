package TDD;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import GameObjects.*;
import InGame.GameActions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GameActionTests {
    @Test
    public void Sell0Goods(){
        //act
        var game = new GameContent();
        var tradeList = new ArrayList<Card>();

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertNull(tokenList);
    }

    @Test
    public void Sell1DiamondsGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Diamonds).limit(1).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertNull(tokenList);
    }

    @Test
    public void Sell1SpiceGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Spice).limit(1).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Spice && x.getPoints() == 5).count());
        assertEquals(1, tokenList.size());
    }

    @Test
    public void Sell2DiamondsGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Diamonds).limit(2).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertEquals(2, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Diamonds && x.getPoints() == 7).count());
        assertEquals(2, tokenList.size());
    }

    @Test
    public void Sell2LeatherGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Leather).limit(2).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 4).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 3).count());
        assertEquals(2, tokenList.size());
    }

    @Test
    public void Sell3LeatherGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Leather).limit(3).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 4).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 3).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 2).count());
        assertEquals(1, tokenList.stream().skip(3).filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 3).count());
        assertEquals(4, tokenList.size());
    }

    @Test
    public void Sell4LeatherGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Leather).limit(4).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 4).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 3).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 2).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 1).count());
        assertEquals(1, tokenList.stream().skip(4).filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 4).count());
        assertEquals(5, tokenList.size());
    }

    @Test
    public void Sell5LeatherGoods(){
        //act
        var game = new GameContent();
        ArrayList<Card> tradeList = game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Leather).limit(5).collect(Collectors.toCollection(ArrayList::new));

        //arrange
        var tokenList = GameActions.SellGoods(game, tradeList);

        //assert
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 4).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 3).count());
        assertEquals(1, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 2).count());
        assertEquals(2, tokenList.stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 1).count());
        assertEquals(1, tokenList.stream().skip(4).filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 5).count());
        assertEquals(6, tokenList.size());
    }
}
