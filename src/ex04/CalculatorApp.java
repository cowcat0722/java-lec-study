package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int rAdd = cal.add(50,80);
        System.out.println("add: " +rAdd);

        int rMinus = cal.minus(50,80);
        System.out.println("minus: "+rMinus);

        double rDivide = cal.divide(50,80);
        System.out.println("divide: "+rDivide);

        int rMulti = cal.multi(50,80);
        System.out.println("multi: "+rMulti);


    }
}
