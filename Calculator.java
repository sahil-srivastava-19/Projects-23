package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame jf=new JFrame("CalculatoR");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(300,250,520,500);
        Container c=jf.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.getHSBColor(140,71,83));
        JTextField jt=new JTextField();
        JTextField jt1=new JTextField();
        JTextField res=new JTextField();
        jt.setBounds(200,100,200,30);
        jt1.setBounds(200,150,200,30);
        res.setBounds(200,310,200,30);
        c.add(jt);
        c.add(jt1);
        c.add(res);
        JLabel lf=new JLabel("First Number");
        JLabel ls=new JLabel("Second Number");
        JLabel rs=new JLabel("Result");
        lf.setBounds(100,100,200,30);
        ls.setBounds(100,150,200,30);
        rs.setBounds(100,310,200,30);
        c.add(lf);
        c.add(ls);
        c.add(rs);
        JButton btn1=new JButton("+");
        btn1.setFont(new Font("Arial",Font.BOLD,30));
        btn1.setBounds(100,200,100,30);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (btn1 == e.getSource()) {
                        double a = Integer.parseInt(jt.getText());
                        double b = Integer.parseInt(jt1.getText());
                        String r = (a + b) + "";
                        res.setText(r);
                    }
                }
                catch(NumberFormatException e1){
                    res.setText("Invalid(NumberFormatException)");
                }
            }
        });
        c.add(btn1);
        JButton btn2=new JButton("-");
        btn2.setFont(new Font("Arial",Font.BOLD,30));
        btn2.setBounds(300,200,100,30);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (btn2 == e.getSource()) {
                        double a = Integer.parseInt(jt.getText());
                        double b = Integer.parseInt(jt1.getText());
                        String r = (a - b) + "";
                        res.setText(r);
                    }
                }catch(NumberFormatException e1){
                    res.setText("Invalid(NumberFormatException)");
                }
            }
        });
        c.add(btn2);
        JButton btn3=new JButton("x");
        btn3.setFont(new Font("Arial",Font.BOLD,30));
        btn3.setBounds(200,230,100,30);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(btn3==e.getSource()){
                        double a=Integer.parseInt(jt.getText());
                        double b=Integer.parseInt(jt1.getText());
                        String r=(double)(a*b)+"";
                        res.setText (r);
                    }
                }
                catch(NumberFormatException e1){
                    res.setText("Invalid(NumberFormatException)");
                }
            }
        });
        c.add(btn3);
        JButton btn4=new JButton("/");
        btn4.setFont(new Font("Arial",Font.BOLD,30));
        btn4.setBounds(100,260,100,30);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(btn4==e.getSource()){
                        double a=Integer.parseInt(jt.getText());
                        double b=Integer.parseInt(jt1.getText());
                        if(b==0){
                            res.setText("Invalid!(ArithmeticException)");
                        }else {
                            String r = (a / b) + "";
                            res.setText(r);
                        }
                    }
                }catch(NumberFormatException e1){
                    res.setText("Invalid(NumberFormatException)");
                }
            }
        });
        c.add(btn4);
        JButton btn5=new JButton("%");
        btn5.setFont(new Font("Arial",Font.BOLD,30));
        btn5.setBounds(300,260,100,30);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(btn5==e.getSource()){
                        double a=Integer.parseInt(jt.getText());
                        double b=Integer.parseInt(jt1.getText());
                        if(b==0){
                            res.setText("Invalid(ArithmeticException)");
                        }else {
                            String r = (a % b) + "";
                            res.setText(r);
                        }
                    }
                }catch(NumberFormatException e1){
                    res.setText("Invalid(NumberFormatException)");
                }
            }
        });
        c.add(btn5);
        JButton clear=new JButton("CLEAR");
        clear.setFont(new Font("Arial",Font.ITALIC,10));
        clear.setBounds(325,350,75,15);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res.setText("");
                jt.setText("");
                jt1.setText("");
            }
        });
        c.add(clear);

        jf.setVisible(true);
    }
}
