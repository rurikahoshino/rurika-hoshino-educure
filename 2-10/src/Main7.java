public class Main7 {
    public static void main(String[] args) {
        int key = 2;        // 押したキーの番号
        int pressCount = 2; // 押下回数
        // ここにコードを書いてください
        switch (key) {
            case 1:
                if (pressCount==1){
                    System.out.println("A");
                }else if (pressCount==2){
                    System.out.println("B");
                }else{
                    System.out.println("C");
                }
                break;
            case 2:
                if (pressCount==1){
                    System.out.println("D");
                }else if(pressCount==2){
                    System.out.println("E");
                }else{
                    System.out.println("F");
                }
                break;
            default:
                System.out.println("Invalid key");
                break;
        }
    }
}
