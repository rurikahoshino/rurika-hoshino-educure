// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<String>allMonsters=List.of("スライム","ドラゴン","ゴブリン","フェニックス","ユニコーン");

        HashSet<String>discoveredMonsters=new HashSet<>();

        ArrayList<String>battleHistory=new ArrayList<>();

        for(int i=0;i<5;i++){
            battleHistory.add("スライム");
            discoveredMonsters.add("スライム");
        }

        for(int i=0;i<2;i++){
            battleHistory.add("ドラゴン");
            discoveredMonsters.add("ドラゴン");
        }

        for(int i=0;i<2;i++){
            battleHistory.add("ゴブリン");
            discoveredMonsters.add("ゴブリン");
        }

        System.out.println("発見済みモンスター: "+discoveredMonsters);

        System.out.println("発見済みモンスター数: "+discoveredMonsters.size());

        int slimeCount=0;
        for(String monster:battleHistory){
            if(monster.equals("スライム")){
                slimeCount++;
            }
        }
        System.out.println("スライムとの戦闘回数: "+slimeCount);

        ArrayList<String>undiscoveredMonsters=new ArrayList<>();
        for(String monster:allMonsters){
            if(!discoveredMonsters.contains(monster)){
                undiscoveredMonsters.add(monster);
            }
        }
        System.out.println("未発見のモンスター: "+undiscoveredMonsters);
    }
}