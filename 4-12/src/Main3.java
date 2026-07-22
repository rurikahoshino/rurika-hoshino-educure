import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        ArrayList<Character>party=new ArrayList<>();
        party.add(new Character("勇者A", 100, 50));
        party.add(new Character("魔法使いB", 70, 70));
        party.add(new Character("戦士C", 80, 40));

        System.out.println("--- 戦闘力順 ---");

        Collections.sort(party);

        for(Character member:party){
            System.out.println(member);
        }
    }
}