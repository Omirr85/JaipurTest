package TDD;

import static org.junit.jupiter.api.Assertions.*;

import GameObjects.*;
import org.junit.jupiter.api.Test;

public class GameContentTest {
    @Test
    public void CheckContentAfterInit()
    {
        // arrange
        // act
        var game = new GameContent();
        // assert
        assertEquals(11, game.getDeck().stream().filter(x -> x instanceof CamelCard).count());
        assertEquals(6, game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Diamonds).count());
        assertEquals(6, game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Silver).count());
        assertEquals(6, game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Gold).count());
        assertEquals(8, game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Spice).count());
        assertEquals(8, game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Cloth).count());
        assertEquals(10, game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Leather).count());

        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Diamonds && x.getPoints() == 7).count());
        assertEquals(3,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Diamonds && x.getPoints() == 5).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Gold && x.getPoints() == 6).count());
        assertEquals(3,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Gold && x.getPoints() == 5).count());
        assertEquals(5,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Silver && x.getPoints() == 5).count());
        assertEquals(1,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 4).count());
        assertEquals(1,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 3).count());
        assertEquals(1,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 2).count());
        assertEquals(6,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Leather && x.getPoints() == 1).count());

        assertEquals(1,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Spice && x.getPoints() == 5).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Spice && x.getPoints() == 3).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Spice && x.getPoints() == 2).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Spice && x.getPoints() == 1).count());
        assertEquals(1,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Cloth && x.getPoints() == 5).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Cloth && x.getPoints() == 3).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Cloth && x.getPoints() == 2).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof GoodsToken && ((GoodsToken) x).getGoodType() == GoodType.Cloth && x.getPoints() == 1).count());

        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 3 && x.getPoints() == 3).count());
        assertEquals(3,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 3 && x.getPoints() == 2).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 3 && x.getPoints() == 1).count());

        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 4 && x.getPoints() == 6).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 4 && x.getPoints() == 5).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 4 && x.getPoints() == 4).count());

        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 5 && x.getPoints() == 10).count());
        assertEquals(1,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 5 && x.getPoints() == 9).count());
        assertEquals(2,game.getTokens().stream().filter(x -> x instanceof SeriesToken && ((SeriesToken) x).getAmount() == 5 && x.getPoints() == 8).count());

    }
}
/*
6 Diamonds
        6 Gold
        6 Silver
        8 Cloth
        8 Spice
        10 Leather
        11 Camels*/