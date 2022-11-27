public class Employee extends Person {
    
    public int salary;
    public int experience;
    public boolean isHappy;
    public Laptop laptop;
    
    public Employee() {};
    
    public Employee(String name, int age, String sex, int salary, int experience) {
        
        super(name, age, sex);
        this.salary = salary;
        this.experience = experience;
    
        if(salary > 40000) {
            this.isHappy = true;
        }
        else {
            this.isHappy = false;
        }
    }
    
    public void print() {
        System.out.printf("Name = %s, age = %d, sex = %s, salary = %d, experience = %d, isHappy = %b \n", this.name, this.age, this.sex, this.salary, this.experience, this.isHappy);
    }
    
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        laptop.owner = this;
    }
    
    public void returnLaptop() {
        this.laptop.owner = null;
        this.laptop = null;
    }
}
