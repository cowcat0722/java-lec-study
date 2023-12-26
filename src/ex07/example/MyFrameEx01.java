package ex07.example;

import javax.swing.*;

public class MyFrameEx01 {

    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // jf.setLayout(new BorderLayout());
        jf.setSize(300,500);

        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");


        JLabel la1 = new JLabel((num+""));


        jf.add("North",btn1);
        jf.add("South",btn2);
        jf.add("Center",la1);

        btn1.addActionListener(e -> {
            num++;
            la1.setText(num+"");
        });

        btn2.addActionListener(e -> { // Ctrl + Enter 하면 자동 양식
            num--;
            la1.setText(num+"");
        });

        jf.setVisible(true);

    }
}
