package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName ,textFname, textEmail,textAdd,textcity,textState,textPin;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super ("APPLICATION FORM");
        setVisible(true);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,10,70,70);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(100,20,400,30);
        label1.setFont(new Font("Rale way",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Railway",Font.BOLD, 22));
        label2.setBounds(250,60,100,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Rale way", Font.BOLD,22));
        label3.setBounds(220,90,200,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Rale way", Font.BOLD, 20));
        labelName.setBounds(50,130,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Rale way",Font.BOLD, 14));
        textName.setBounds(200,130,300,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Rale way", Font.BOLD, 20));
        labelfName.setBounds(50,170,150,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Rale way",Font.BOLD, 14));
        textFname.setBounds(200,170,300,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Rale way", Font.BOLD, 20));
        DOB.setBounds(50,250,150,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(200,250,300,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Rale way", Font.BOLD, 20));
        labelG.setBounds(50,210,100,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Rale way", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(200,210,80,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Rale way", Font.BOLD,14));
        r2.setBounds(300,210,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Rale way", Font.BOLD, 20));
        labelEmail.setBounds(50,290,150,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Rale way",Font.BOLD, 14));
        textEmail.setBounds(200,290,300,30);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Rale way", Font.BOLD, 20));
        labelMs.setBounds(50,330,150,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(200,330,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Rale way", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(300,330,100,30);
        m2.setFont(new Font("Rale way", Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(400,330,80,30);
        m3.setFont(new Font("Rale way", Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Rale way", Font.BOLD, 20));
        labelAdd.setBounds(50,370,150,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Rale way",Font.BOLD, 14));
        textAdd.setBounds(200,370,300,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Rale way", Font.BOLD, 20));
        labelCity.setBounds(50,410,100,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Rale way",Font.BOLD, 14));
        textcity.setBounds(200,410,300,30);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Rale way", Font.BOLD, 20));
        labelPin.setBounds(50,450,100,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Rale way",Font.BOLD, 14));
        textPin.setBounds(200,450,300,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Rale way", Font.BOLD, 20));
        labelstate.setBounds(50,490,100,30);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Rale way",Font.BOLD, 14));
        textState.setBounds(200,490,300,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Rale way",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(420,550,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(600,700);
        setLocationRelativeTo(null);
        //setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital =null;
        if (m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Connn c = new Connn();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}