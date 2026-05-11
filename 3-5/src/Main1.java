public class Main1 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        Weapon sword =new Weapon();
        sword.name="魔法の剣";
        sword.power=50;

        GameCharacter alex=new GameCharacter();
        alex.name="剣士アレックス";
        alex.hp=100;

        alex.weapon=sword;

        System.out.println(alex.name+"は"+alex.weapon.name+"を装備しています");
    }
}
