package ex05;

public class PizzaTest01 {
    public static void main(String[] args) {
        Pizza01 p1 =new Pizza01("Super Supreme");
        Pizza01 p2 =new Pizza01("Cheese");
        Pizza01 p3 =new Pizza01("Pepperoni");
        int n = Pizza01.count;
        System.out.println("지금까지 판매된 피자 개수 = "+n);
    }
}
