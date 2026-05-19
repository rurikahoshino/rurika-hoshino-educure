class PartTimeEmployee extends Employee {
    // ここにコードを書いてください
    private int hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name,int hourlyWage,int hoursWoked){
        super(name);
        this.hourlyWage=hourlyWage;
        this.hoursWorked=hoursWoked;
    }

    @Override
    public String getRole(){
        return "パートタイム";
    }

    @Override
    public int calculateSalary(){
        return hourlyWage*hoursWorked;
    }
}