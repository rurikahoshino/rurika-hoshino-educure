import java.util.ArrayList;

public class PartyMember implements Cloneable {
    private String name;
    private ArrayList<String>skills;
    
    public PartyMember(String name){
        this.name=name;
        this.skills=new ArrayList<>();
    }

    public void addSkill(String skill){
        this.skills.add(skill);
    }

    @Override
    public PartyMember clone(){
        try{
            PartyMember cloned=(PartyMember)super.clone();

            cloned.skills=new ArrayList<>(this.skills);

            return cloned;
        }catch(CloneNotSupportedException e){
            return null;
        }
    }

    public void showSkills(){
        System.out.println("キャラクター「"+this.name+"」のスキル: "+this.skills);
    }

    public String getName(){
        return this.name;
    }
}
