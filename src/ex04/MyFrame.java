package ex04;

import javax.swing.*;

public class MyFrame {

    public static void main(String[] args) {
        JFrame jf = new JFrame("hello");

        JButton btn1 = new JButton("클릭");
        jf.add(btn1);

        btn1.addActionListener(e -> {
            System.out.println("버튼 클릭됨");
        });

        jf.setSize(300, 500);
        jf.setVisible(true);
    }
}
