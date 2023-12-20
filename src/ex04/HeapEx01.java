package ex04;

class Cat{
    String name;

    Cat(){
        // this.name = "토비";
        this("토비");
    }
    Cat(String name){
        this.name = name;
    }
}

public class HeapEx01 {
    Cat c = new Cat();

}
