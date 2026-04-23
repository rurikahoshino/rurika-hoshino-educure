public class Main2 {
    public static void main(String[] args) {
        int score = 85;  // 学生の得点
        // ここにコードを書いてください
        String grade=judgeGrade(score);
        
        System.out.println("得点:"+score+"点");
        System.out.println("成績:"+grade);
    }

    public static String judgeGrade(int s){
        if(s>=80){
            return "優";
        }else if(s>=70){
            return "良";
        }else if(s>=60){
            return "可";
        }else{
            return "不可";
        }
    }
}
