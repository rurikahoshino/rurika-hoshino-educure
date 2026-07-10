public class Main4 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        PartyMember original=new PartyMember("アリス");
        original.addSkill("ファイア");
        original.addSkill("ブリザード");

        PartyMember copy=original.clone();

        if(copy!=null){
            copy.addSkill("サンダー");
        }

        System.out.println("--- 深いコピー後にスキル追加 ---");

        System.out.print("元の");
        original.showSkills();

        System.out.print("コピーした");
        if(copy!=null){
            copy.showSkills();
        }
    }
}