import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("攻撃力を入力してください：");
        String atk=scanner.nextLine();
        System.out.println("防御力を入力してください：");
        String def=scanner.nextLine();
        int attack=Integer.parseInt(atk);
        int defense=Integer.parseInt(def);
        int damage=attack-defense;
        System.out.println("通常ダメージ："+damage);
        double criticalDamage=damage*1.5;
        int critDamage=(int)criticalDamage;
        System.out.println("クリティカルダメージ："+critDamage);
        scanner.close();
    }
}
