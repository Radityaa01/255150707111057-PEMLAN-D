public class MainPayble {
    public static void main(String[] args) {
        Invoice[] belanjaan = {
            new Invoice("Beras", 2, 60000),
            new Invoice("Minyak Goreng", 3, 20000),
            new Invoice("Gula", 1, 15000)
        };

        Employee emp = new Employee(101, "Raditya", 2000000, belanjaan);

        System.out.println(emp);
    }
}
