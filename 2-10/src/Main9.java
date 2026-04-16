public class Main9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '+';  // +, -, *, / のいずれか
        // ここにコードを書いてください
        switch (operator) {
            case '+':
                System.out.println("結果: "+(num1+num2));
                break;
            case '-':
                System.out.println("結果: "+(num1-num2));
                break;
            case '*':
                System.out.println("結果: "+(num1*num2));
                break;
            case '/':
                if (num2!=0){
                    System.out.println("結果: "+(num1/num2));
                }else{
                    System.out.println("エラー: 0で割ることはできません");
                }
            default:
                System.out.println("エラー: 無効な演算子です");
                break;
        }
    }
}
