package ch18.ex01;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * リスト18.1 状態を持たないメソッドのテスト
 */
public class StringUtilsTest {
    @Test
    public void toSnakeCaseはスネークケースを返す_aaaの場合() {
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }

    @Test
    public void toSnakeCaseはスネークケースを返す_HelloWorldの場合() {
        assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
    }

    @Test
    public void toSnakeCaseはスネークケースを返す_practiceJunitの場合() {
        assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
    }

    @Test
    public void exceptionRule() {
        assertThrows(
            NullPointerException.class,
            () -> {
                StringUtils.toSnakeCase(null);
            }
        );
    }
}
