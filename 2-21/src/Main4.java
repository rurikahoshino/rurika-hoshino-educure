import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers={5,2,8,1,9};
        processNumbers(numbers);
    }

    public static void processNumbers(int[] numbers) {
        // ここにコードを書いてください
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:numbers){
            list.add(num);
        }
        System.out.println("元のリスト："+list);
        Collections.sort(list);
        int min=Collections.min(list);
        int max=Collections.max(list);
        System.out.println("ソート後："+list);
        System.out.println("最大値："+max);
        System.out.println("最小値："+min);
    }
}
