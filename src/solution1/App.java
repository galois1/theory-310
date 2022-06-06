package solution1;

public class App {
    public static void main(String[] args) {
        S1Faculty f = new S1Faculty();
        f.setName("Hanneli T.");
        f.setSalary(40000.00);
        System.out.println("Taxes for " + f.getName() + " will be: " + f.calculate_tax() + "\n");
        // System.out.println("Teaching bonus: " + f.salaryWithTeachingBonus(1.1));
        // S1Faculty f2 = new S1Faculty("Another Faculty", 50000.00);
        // System.out.println("Taxes for " + f2.getName() + " will be: " + f2.calculate_tax() + "\n");
        System.out.println(f.getClass().getName());
        DawsonStaff ds = new S1Faculty();
        ds.setName("DS.");
        ds.setSalary(40000.00);
        System.out.println("Taxes for " + ds.getName() + " will be: " + ds.calculate_tax() + "\n");
        // System.out.println("Teaching bonus: " + ds.salaryWithTeachingBonus(1.1));

        System.out.println(ds.getClass().getName());
    }
    
}
