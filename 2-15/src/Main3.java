public class Main3 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        String[]days={"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
        // ここに平均気温を計算するコードを書いてください
        for(int i=0;i<temperatures.length;i++){
            System.out.println(days[i]+": "+temperatures[i]+"度");
        }
        double sum=0;
        for(double temp:temperatures){
            sum+=temp;
        }
        double avg=(double)sum/temperatures.length;
        System.out.println("平均温度: "+avg+"度");
    }
}
