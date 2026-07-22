import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        GameCharacter hero=new GameCharacter("勇者A");
        Equipment sword=new Equipment("伝説の剣", 100, 0);
        Equipment shield=new Equipment("光の盾", 0, 80);
        Equipment shoes=new Equipment("魔法の靴", 10, 20);

        hero.addEquipment(sword);
        hero.addEquipment(shield);
        hero.addEquipment(shoes);

        System.out.println("--- キャラクター装備情報 ---");
        hero.showEquipments();
        System.out.println( );

        Equipment cloneSword=sword.clone();
        if(cloneSword!=null&&cloneSword.equals(sword)){
            System.out.println("装備の複製テスト: OK");
        }else{
            System.out.println("装備の複製テスト: NG");
        }

        if(sword.compareTo(shield)<0){
            System.out.println("装備の比較テスト: OK");
        }else{
            System.out.println("装備の比較テスト: NG");
        }

        hero.sortEquipments();
        ArrayList<Equipment>sortedList=hero.getEquipments();

        if(sortedList.get(0).getPower()==100&&
            sortedList.get(1).getPower()==80&&
            sortedList.get(2).getPower()==30){
            System.out.println("装備の強さソート: OK");
        }else{System.out.println("装備の強さソート: NG ");
            
        }
    }
}