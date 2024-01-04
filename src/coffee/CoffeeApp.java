package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Customer customer = new Customer(barista);

        customer.order("아메리카노");
    }
}
