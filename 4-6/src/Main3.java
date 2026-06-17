// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        // 商品名と在庫数を管理するHashMapを作成
        HashMap<String,Integer>inventory=new HashMap<>();
        
        // 商品を入荷（在庫を追加）
        inventory.put("おにぎり", 15);
        inventory.put("サンドイッチ", 8);
        inventory.put("お弁当", 5);
        
        // 現在の在庫状況を表示
        System.out.println("在庫状況: "+inventory);
        
        // おにぎりを1個販売
        int currrentOnigiri=inventory.get("おにぎり");
        inventory.put("おにぎり", currrentOnigiri-1);
        System.out.println("おにぎりを1個販売しました");
        
        // 更新後の在庫状況を表示
        System.out.println("在庫状況: "+inventory);
        
        // アイスクリームの在庫確認
        boolean hasIceCream=inventory.containsKey("アイスクリーム");
        System.out.println("アイスクリームは在庫がありますか？: "+hasIceCream);
    }
} 