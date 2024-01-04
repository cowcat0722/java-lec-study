package coffee;

import java.awt.*;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    //아메리카노, 카푸치노, 마끼야또, 에스프레소
    public Menu(List<String> item) {
        this.items = items;
    }

    public MenuItem choose(String name){
        for(MenuItem each : items){
            if(each.getName().equals(name)){
                return each;
            }
        }
        return null;
    }
}
