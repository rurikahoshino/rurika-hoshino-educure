public class Main4 {
    public static void main(String[] args){
        StudentManager manager=new StudentManager();

        try{
            manager.addStudent("アリス");
            manager.addStudent("ボブ");
            manager.addStudent("チャーリー");
            manager.addStudent(null);
            manager.addStudent("イヴ");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー: "+e.getMessage());
        }

        try{
            manager.addStudent("フランク");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー: "+e.getMessage());
        }

        try{
            String s2=manager.getStudent(2);
            System.out.println("学生ID 2: "+s2);
        }catch(Exception e){
            System.out.println("エラー: "+e.getMessage());
        }

        String s3=null;
        try{
            s3=manager.getStudent(3);
        }catch(NullPointerException e){
            System.out.println("エラー: "+e.getMessage());
        }
        System.out.println("学生ID 3: "+s3);

        String s10=null;
        try{
            s10=manager.getStudent(10);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー: "+e.getMessage());
        }
        System.out.println("学生ID 10: "+s10);

        try{
            manager.updateStudent(0, "フランク");
            manager.updateStudent(1, "ボビー");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー: "+e.getMessage());
        }

        try{
            System.out.println("更新後の学生ID 1: "+manager.getStudent(1));
        }catch(Exception e){
            System.out.println("エラー: "+e.getMessage());
        }

        try{
            manager.updateStudent(10, "ダミー");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー: "+e.getMessage());
        }
    }
}
