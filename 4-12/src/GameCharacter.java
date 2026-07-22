import java.util.ArrayList;
import java.util.Collections;

class GameCharacter{
    private String name;
    private ArrayList<Equipment>equipments;

    public GameCharacter(String name){
        this.name=name;
        this.equipments=new ArrayList<>();
    }

    public void addEquipment(Equipment equipment){
        this.equipments.add(equipment);
    }

    public void showEquipments(){
        System.out.println(this.name+"の装備: ");
        for(int i=0;i<equipments.size();i++){
            System.out.println((i+1)+". "+equipments.get(i));
        }
    }

    public void sortEpuipments(){
        Collections.sort(this.equipments);
    }

    public ArrayList<Equipment>getEquipments(){
        return this.equipments;
    }
}