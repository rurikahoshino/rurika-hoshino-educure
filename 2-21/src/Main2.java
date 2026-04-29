public class Main2 {
    public static void main(String[] args) {
        double radius=5.0;
        System.out.println("半径が"+radius+"の場合：");
        calculateCircle(radius);
    }

    public static void calculateCircle(double radius) {
        // ここにコードを書いてください
        double area=radius*radius*Math.PI;
        double circumference=2*radius*Math.PI;
        System.out.println("円の面積："+area);
        System.out.println("円周："+circumference);
    }
}
