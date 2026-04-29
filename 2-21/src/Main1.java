public class Main1 {
    public static void main(String[] args) {
        String text="Hello World";
        processString(text);
    }

    public static void processString(String input) {
        // ここにコードを書いてください
        String upper=input.toUpperCase();
        int count=input.length();
        System.out.println("大文字："+upper);
        System.out.println("文字数："+count);
    }
}