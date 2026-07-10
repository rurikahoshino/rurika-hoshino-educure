import java.nio.file.ClosedFileSystemException;
import java.util.ArrayList;
import java.util.Collections;

public class Equipment implements Cloneable,Comparable<Equipment>{
    private String name;
    private int attack;
    private int defense;

    public Equipment(String name,int attack,int defense){
        this.name=name;
        this.attack=attack;
        this.defense=defense;
    }

    public int getPower(){
        return this.attack+this.defense;
    }

    @Override
    public Equipment clone(){
        try{
            return(Equipment)super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Equipment other=(Equipment)obj;
        return this.attack==other.attack&&
                this.defense==other.defense&&
                (this.name!=null&&this.name.equals(other.name));
    }

    @Override
    public int compareTo(Equipment other){
        return other.getPower()-this.getPower();
    }

    @Override
    public String toString(){
        return this.name+"（攻撃力: "+this.attack+" 防御力: "+this.defense+"）";
    }
}
