public class Fruit<T,U> {
    private T name;
    private U price;
    
    public void setData(T name, U price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("果物: " + this.name);
        System.out.println("価格: " + this.price + "円");
    }
}