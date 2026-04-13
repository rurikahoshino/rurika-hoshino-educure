import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("現在の経験値を入力してください：");
        String exp=scanner.nextLine();
        int expPoints=Integer.parseInt(exp);
        double totalExp=expPoints*1.25;
        int experiencePoints=(int)totalExp;
        System.out.println("ボーナス後の経験値: "+experiencePoints);
        scanner.close();
    }
}
