package junit_4_18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class RPGCharacterTest {
    @Test
    void testInitialStatus() {
        // ここに初期状態のテストを書く
        RPGCharacter character=new RPGCharacter();
        
        assertEquals(1, character.getLevel(),"初期レベルは1であるはず");
        assertEquals(100, character.getHP(),"初期HPは100であるはず");
        assertEquals(50, character.getMP(),"初期MPは50であるはず");
    }

    @Test
    void testNormalLevelUp() {
        // ここに通常のレベルアップテストを書く
        RPGCharacter character=new RPGCharacter();
        character.levelUp();

        assertEquals(2, character.getLevel(),"レベルが2になるはず");
        assertEquals(110, character.getHP(),"HPが110になるはず");
        assertEquals(55, character.getMP(),"MPが55になるはず");
    }

    @Test
    void testMaxLevel() {
        // ここに境界値のテストを書く
        RPGCharacter character=new RPGCharacter();

        for(int i=0;i<97;i++){
            character.levelUp();
        }
        assertEquals(98, character.getLevel(),"レベルが98になるはず");

        character.levelUp();
        assertEquals(99, character.getLevel(),"レベルが99になるはず");

        assertEquals(1080, character.getHP(),"レベル99のHPは1080であるはず");
        assertEquals(540, character.getMP(),"レベル99のMPは540であるはず");

        try{
            character.levelUp();
            fail("最大レベルで例外が発生するはず");
        }catch(IllegalStateException e){
            assertEquals("最大レベルに達しています", e.getMessage(),"例外メッセージが一致するはず");
        }

        IllegalStateException exception=assertThrows(
            IllegalStateException.class,()->character.levelUp(),
            "最大レベルで例外が発生するはず" 
        );
        assertEquals("最大レベルに達しています", exception.getMessage(),"例外メッセージが一致するはず");
    }
}