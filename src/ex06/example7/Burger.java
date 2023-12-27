package ex06.example7;

public class Burger {
    private String name;
    private int price;

    public Burger(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name+"가 만들어졌어요");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }




}
