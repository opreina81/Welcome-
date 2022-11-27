public class Manager extends Employee {
    
    private int bonus;
    
    public Manager(String name, int age, String sex, int salary, int experience) {
        super(name, age, sex, salary, experience);
        this.bonus = generateBonus();
    }
    
    private int generateBonus() {
        return this.salary * this.experience / 10;
    }
    
    public int getBonus() {
        return this.bonus;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
        this.bonus = this.generateBonus();
    }
    
}
