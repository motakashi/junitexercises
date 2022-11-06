package ch18.ex05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ItemTest {

    private Item sut;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @MethodSource("constructorDateProvider")
    void Item_名前と価格を渡すとnameとpriceがセットされる(String name, int price){
        this.sut = new Item(name, price);

        assertSame(name, sut.name);
        assertSame(price, sut.price);
    }

    static Stream<Arguments> constructorDateProvider() {
        return Stream.of(
            arguments("test", 100),
            arguments("森", 0),
            arguments("髙橋", -100)
        );
    }
}