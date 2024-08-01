import java.util.*;

public class Main {

    public static void selectCustomers(List<Customer> list, CustomerSelectionInterface csi) {
        for (Customer c : list) {
            if (csi.select(c))
                System.out.println(c);
        }
    }

    public static void main(String[] args) {
        List<Customer> shoeStoreCustomers = new ArrayList<>(
                Arrays.asList(
                        new Customer("Mary", "Jones", 6.5),
                        new Customer("John", "Smith", 7.0),
                        new Customer("John", "Abercrombie", 9.5),
                        new Customer("Monique", "Smith", 4.0),
                        new Customer("David", "Jackson", 8.5),
                        new Customer("Brandy", "Edwards", 10.5)
                )
        );
        System.out.println(shoeStoreCustomers);
        Collections.sort(shoeStoreCustomers, (a, b) -> a.getLast().compareTo(b.getLast()));
        System.out.println(shoeStoreCustomers);
        selectCustomers(shoeStoreCustomers, c -> true);


    }
}