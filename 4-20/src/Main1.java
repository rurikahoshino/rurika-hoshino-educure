import java.io.FileWriter;

public class Main1 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        try(FileWriter writer=new FileWriter("exercise.txt")){
            writer.write("Hello,World!");

            System.out.println("ファイルに書き込みが完了しました。");
        } catch (Exception e) {
            System.out.println("ファイルの書き込み中にエラーが発生しました。");
        }
    }
}