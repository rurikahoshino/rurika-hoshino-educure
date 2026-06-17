// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        // 学生の名簿を管理するArrayListを作成
        ArrayList<String> students=new ArrayList<>();

        // 学生を追加
        students.add("田中");
        students.add("佐藤");
        students.add("鈴木");

        // 学生リストを表示
        System.out.println("学生リスト: "+students);
        
        // 2番目の学生を取得（インデックスは0から始まるので1を指定）
        String secondStudent=students.get(1);
        System.out.println("2番目の学生: "+secondStudent);
        
        // 学生数を取得
        int count=students.size();
        System.out.println("学生数: "+count);
        
        // 特定の学生が含まれているか確認
        boolean hasSuzuki=students.contains("鈴木");
        System.out.println("鈴木さんは含まれていますか？: "+hasSuzuki);
    }
}