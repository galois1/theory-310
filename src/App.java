import ca.qc.dawson.Faculty;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Faculty f = new Faculty();
        f.setName("Hanneli Tavante");
        f.setSalary(40000.00);
        System.out.println("Your taxes will be: " + f.calculate_tax() + "\n");
    }
}
