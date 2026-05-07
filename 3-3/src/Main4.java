public class Main4 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        Weapon sword=new Weapon();

        sword.setWeapon("伝説の剣", 100);

        for(int i=0;i<10;i++){
            sword.use();
        }

        sword.use();

        sword.repair();

        sword.use();
    }
}