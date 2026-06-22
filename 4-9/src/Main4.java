public class Main4 {
    public static void main(String[] args){
        StudentManager manager=new StudentManager();

        manager.addStudent("アリス");
        manager.addStudent("ボブ");
        manager.addStudent("チャーリー");
        manager.addStudent(null);
        manager.addStudent("イヴ");

        manager.addStudent("フランク");

        String s2=manager.getStudent(2);
        if(s2!=null){
            System.out.println("学生ID 2: "+s2);
        }

        String s3=manager.getStudent(3);
        System.out.println("学生ID 3: "+s3);

        String s10=manager.getStudent(10);
        System.out.println("学生ID 10: "+s10);

        manager.updateStudent(0, "フランク");
        manager.updateStudent(1,"ボビー");

        System.out.println("更新後の学生ID 1: "+manager.getStudent(1));

        manager.updateStudent(10, "ダミー");
    }
}
