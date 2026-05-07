public class Main1 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        Pet myPet=new Pet();
        myPet.name="ポチ";
        myPet.energy=100;

        System.out.println(myPet.name+"を生み出しました！");
        System.out.print("初期体力：");
        myPet.showEnergy();

        myPet.eat();
        myPet.showEnergy();

        myPet.play();
        myPet.showEnergy();
    }
}