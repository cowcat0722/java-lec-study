package ex03;

import java.util.Arrays;

public class PizzaTopping {
    public static void main(String[] args) {

        String[] toppings = {"Pepperoni","Mushrooms","Onions","Sausage","Bacon"};

        for(String s : toppings){
            System.out.println(s + " ");
        }
        System.out.println(Arrays.toString(toppings)); // Array 클래스의 toString() 메소드 사용
    }
}
