package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String formno){

        this.formno = formno;

        setTitle("Bank Account Signup - Page 3");
        setSize(600, 700);
        setLayout(null);
        setLocation(400, 100);
        getContentPane().setBackground(new Color(215, 252, 252));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(250, 10, 100, 80);
        add(image);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Rale way", Font.BOLD, 20));
        l1.setBounds(180, 100, 300, 30);
        add(l1);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Rale way", Font.BOLD, 16));
        l3.setBounds(50, 150, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(50, 180, 200, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(300, 180, 220, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(50, 210, 200, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(300, 210, 250, 30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Rale way", Font.BOLD, 16));
        l4.setBounds(50, 260, 200, 30);
        add(l4);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Rale way", Font.BOLD, 16));
        l6.setBounds(220, 260, 250, 30);
        add(l6);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Rale way", Font.BOLD, 16));
        l8.setBounds(50, 300, 100, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Rale way", Font.BOLD, 16));
        l9.setBounds(220, 300, 100, 30);
        add(l9);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Rale way", Font.BOLD, 16));
        l11.setBounds(50, 350, 200, 30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBounds(50, 380, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(300, 380, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(50, 420, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBounds(300, 420, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(50, 460, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(300, 460, 200, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above-entered details are correct to the best of my knowledge.", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Rale way", Font.BOLD, 12));
        c7.setBounds(50, 500, 500, 30);
        add(c7);

        s = new JButton("Submit");
        s.setBounds(180, 550, 100, 30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setBounds(300, 550, 100, 30);
        c.addActionListener(this);
        add(c);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype ="Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Connn c1 = new Connn();
                    String q1 = "insert into signupthree values('"+formno+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
