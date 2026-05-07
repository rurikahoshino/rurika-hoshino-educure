public class Pet {
    String name;
    int energy;

    void eat(){
        System.out.println(name+"は食事をして元気になった！");
        energy+=10;
    }

    void play(){
        System.out.println(name+"は遊んで疲れた！");
        energy-=20;
    }

    void showEnergy(){
        System.out.println("現在の体力："+energy);
    }
}
