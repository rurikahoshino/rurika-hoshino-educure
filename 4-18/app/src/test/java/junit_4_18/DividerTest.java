package junit_4_18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DividerTest {
    @Test
    void testNormalDivision() {
        Divider divider = new Divider();
        // 正の数の除算テスト
        assertEquals(3.0, divider.divide(6.0, 2.0), 0.0001, "6÷2は3になるはず");
        // ここに他のテストケースを追加
        assertEquals(-4.0,divider.divide(-8.0, 2.0),0.0001,"-8÷2は-4になるはず");
        assertEquals(2.5, divider.divide(5.0, 2.0),0.0001,"5.0÷2.0は2.5になるはず");
        assertEquals(5.0, divider.divide(-10.0, -2.0),"-10÷-2は5になるはず");
    }

    @Test
    void testExceptionDivision() {
        Divider divider = new Divider();
        assertThrows(IllegalArgumentException.class,()-> divider.divide(5.0,0.0),"ゼロ除算で例外が発生するはず");
        assertThrows(IllegalArgumentException.class,()-> divider.divide(-3.0, 0.0),"ゼロ除算で例外が発生するはず");
        assertThrows(IllegalArgumentException.class,()-> divider.divide(0.0, 0.0),"ゼロ除算で例外が発生するはず");

        IllegalArgumentException exception1=assertThrows(IllegalArgumentException.class,()->{
            divider.divide(10.0, 0.0);
        });
        assertEquals("ゼロで除算はできません", exception1.getMessage(),"ゼロ除算で例外が発生するはず");

        IllegalArgumentException exception2=assertThrows(IllegalArgumentException.class,()-> {
            divider.divide(100.0, 0.0);
        });
        assertEquals("ゼロで除算はできません", exception2.getMessage(),"ゼロ除算で例外が発生するはず");
    }
}
