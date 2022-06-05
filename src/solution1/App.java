package solution1;

public class App {
    public static void main(String[] args) {
        S1Faculty f = new S1Faculty();
        f.setName("Hanneli T.");
        f.setSalary(40000.00);
        System.out.println("Taxes for " + f.getName() + " will be: " + f.calculate_tax() + "\n");
        
    }
    
}
