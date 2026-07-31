package junit_4_18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        // ここにテストコードを書く
        Calculator calc=new Calculator();
        assertEquals(5, calc.add(2, 3),"2+3は5になるはず");
        assertEquals(4, calc.add(-1,5),"-1+5は4になるはず");
        assertEquals(4, calc.add(0,4),"0+4は4になるはず");
    }

    @Test
    void testSubtract() {
        // ここにテストコードを書く
        Calculator calc=new Calculator();
        assertEquals(2, calc.subtract(5, 3),"5-3は2になるはず");
        assertEquals(-3, calc.subtract(-1, 2),"-1-2は-3になるはず");
        assertEquals(4, calc.subtract(4, 0),"4-0は4になるはず");
    }
}
