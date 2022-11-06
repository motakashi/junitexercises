package ch18.ex05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ItemStockTest_初回登録の場合 {

    private ItemStock sut;

    @BeforeEach
    void setUp() {
        this.sut = new ItemStock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        // 1. モックオブジェクトの作成
        Item mockItem = Mockito.mock(Item.class);
        mockItem.name = "test";
        mockItem.price = 100;

        this.sut.add(mockItem);
        assertSame(1, this.sut.getNum(mockItem));
    }
}

class ItemStockTest_2回以上の登録の場合 {

    private ItemStock sut;

    @BeforeEach
    void setUp() {
        this.sut = new ItemStock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        // 1. モックオブジェクトの作成
        Item mockItem = Mockito.mock(Item.class);
        mockItem.name = "test";
        mockItem.price = 100;

        this.sut.add(mockItem);
        this.sut.add(mockItem);
        assertSame(2, this.sut.getNum(mockItem));
    }
}