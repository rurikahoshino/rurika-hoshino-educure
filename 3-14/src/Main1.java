public class Main1 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        Animal dog=new Dog();
        System.out.print("犬の鳴き声：");
        dog.makeSound();

        Animal cat=new Cat();
        System.out.print("猫の鳴き声：");
        cat.makeSound();
    }
} 