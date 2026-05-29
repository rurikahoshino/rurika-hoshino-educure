public class Main3 {
    public static void main(String[] args) {
       // ここにコードを書いてください
       System.out.println("貸出可能な本："+Library.getAvailableBooks()+"冊");
       
       Library.borrowBook();
       System.out.println("貸出可能な本："+Library.getAvailableBooks()+"冊");

       Library.returnBook();
       System.out.println("貸出可能な本："+Library.getAvailableBooks()+"冊");
    }
} 
