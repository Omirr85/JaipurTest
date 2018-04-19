package TDD;

import static org.junit.jupiter.api.Assertions.*;

import GameObjects.CamelCard;
import GameObjects.GameContent;
import GameObjects.GoodType;
import GameObjects.GoodsCard;
import org.junit.jupiter.api.Test;

public class GameContentTest {
    @Test
    public void CheckContentAfterInit()
    {
        // arrange
        // act
        var game = new GameContent();
        // assert
        assertEquals(game.getDeck().stream().filter(x -> x instanceof CamelCard).count(), 11);
        assertEquals(game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Diamonds).count(), 6);
        assertEquals(game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Silver).count(), 6);
        assertEquals(game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Gold).count(), 6);
        assertEquals(game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Spice).count(), 8);
        assertEquals(game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Cloth).count(), 8);
        assertEquals(game.getDeck().stream().filter(x -> x instanceof GoodsCard && ((GoodsCard) x).getGoodType() == GoodType.Leather).count(), 10);
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