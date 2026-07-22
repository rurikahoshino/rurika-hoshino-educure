public class Character implements Comparable<Character> {
    private String name;
    private int hp;
    private int attack;
    
    public Character(String name,int hp,int attack){
        this.name=name;
        this.hp=hp;
        this.attack=attack;
    }

    public int getBattlePower(){
        return this.hp+this.attack;
    }

    @Override
    public int compareTo(Character other){
        return Integer.compare(other.getBattlePower(), this.getBattlePower());
    }

    @Override
    public String toString(){
        return this.name+" (HP:"+this.hp+"攻撃力"+this.attack+") 戦闘力"+getBattlePower();
    }
}
