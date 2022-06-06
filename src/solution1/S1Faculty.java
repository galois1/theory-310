package solution1;

public class S1Faculty extends DawsonStaff {
    
    // They can have custom methods
    // public double salaryWithTeachingBonus(double bonusPercentage){
    //     return (this.getSalary() * bonusPercentage);
    //     // this.salary * bonusPercentage; Why it won't work?
    // }

    public S1Faculty() {
        
    }

    public S1Faculty(String name, double salary) {
        super(name, salary);
    }
    
}
