public class Main2 {
    public static void main(String[] args) {
        // テスト用配列の準備
        int[] numbers = {10, 20, 30};
        ArrayAccessor accessor = new ArrayAccessor(numbers);

        System.out.println("位置1の要素");
        try{
            int element=accessor.getElement(1);
            System.out.println(element);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー: "+e.getMessage());
        }
        
        System.out.println("\n位置5の要素");
        // TODO: try-catchで位置5の要素を取得
        try {
            int element=accessor.getElement(5);
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: "+e.getMessage());
        }
    }
}