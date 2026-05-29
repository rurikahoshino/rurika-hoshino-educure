public class Library {
    // ここにコードを書いてください
    private static int availableBooks=100;

    public static void borrowBook(){
        if(availableBooks<=0){
            System.out.println("エラー：貸出可能な本がありません");
            return;
        }
        availableBooks--;
        System.out.println("1冊借りました");
    }

    public static void returnBook(){
        availableBooks++;
        System.out.println("本を返却しました");
    }

    public static int getAvailableBooks(){
        return availableBooks;
    }
}
