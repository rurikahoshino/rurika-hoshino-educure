// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Integer型のArrayListを作成
        ArrayList<Integer> scores=new ArrayList<>();
        
        // 点数を追加
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(55);
        scores.add(43);
        
        // 点数リストを表示
        System.out.println("点数リスト: "+scores);

        int total=0;
        int max=scores.get(0);
        int failCount=0;

        for(int score:scores){
            total+=score;

            if(score>max){
                max=score;
            }

            if(score<=60){
                failCount++;
            }
        }
        
        // 平均点を計算
        double average=(double)total/scores.size();

        System.out.println("平均点: "+average);
        System.out.println("最高点: "+max);
        System.out.println("不合格者数: "+failCount);
    }
}