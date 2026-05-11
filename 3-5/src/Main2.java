public class Main2 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        Player hero=new Player();
        hero.name="勇者";
        hero.hp=30;

        displayInfo(hero);

        HealingPotion potion=new HealingPotion();

        potion.heal(hero);

        System.out.println("プレイヤーのHP: "+hero.hp);
    }

    public static void displayInfo(Player player){
        System.out.println("プレイヤー名: "+player.name);
        System.out.println("プレイヤーHP: "+player.hp);
    }
}