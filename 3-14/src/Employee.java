public abstract class Employee {
    public String name;
    // ここにコードを書いてください
    public Employee(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public abstract String getRole();

    public abstract int calculateSalary();
}