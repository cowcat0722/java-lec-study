package ex06.example7;

public class BurgerSet { // has Burger, Coke -> composition
    private Burger burger; // 결합할때는 상태에 적기
    private Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice(){
        return this.burger.getPrice()+this.coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
