import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Dec 30 15:15:23 IRST 2023
 */



/**
 * @author global village
 */
public class TicketBook extends JFrame implements ActionListener {

    public static ArrayList<Ticket> ticketRoll = new ArrayList<>();
    public TicketBook() throws IOException {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        textField3 = new JTextField();
        textField5 = new JTextField();
        textField7 = new JTextField();
        textField9 = new JTextField();
        textField11 = new JTextField();
        textField13 = new JTextField();
        textField15 = new JTextField();
        textField17 = new JTextField();
        textField19 = new JTextField();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        checkBox5 = new JCheckBox();
        checkBox6 = new JCheckBox();
        checkBox7 = new JCheckBox();
        checkBox8 = new JCheckBox();
        checkBox9 = new JCheckBox();
        checkBox10 = new JCheckBox();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("BOOK TICKET");
        label1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label1.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 18));
        label1.setForeground(new Color(0xFFFFFF));
        contentPane.add(label1);
        label1.setBounds(255, 10, label1.getPreferredSize().width, 40);

        contentPane.add(textField1);
        textField1.setBounds(25, 70, 620, 40);
        textField1.setBackground(new Color(0xEF777A));
        textField1.setText(AdminMainPage.n1);

        contentPane.add(textField3);
        textField3.setBounds(25, 110, 620, 40);
        textField3.setBackground(new Color(0xEF777A));
        textField3.setText(AdminMainPage.n2);


        contentPane.add(textField5);
        textField5.setBounds(25, 150, 620, 40);
        textField5.setBackground(new Color(0xEF777A));
        textField5.setText(AdminMainPage.n3);


        contentPane.add(textField7);
        textField7.setBounds(25, 190, 620, 40);
        textField7.setBackground(new Color(0xEF777A));
        textField7.setText(AdminMainPage.n4);


        contentPane.add(textField9);
        textField9.setBounds(25, 230, 620, 40);
        textField9.setBackground(new Color(0xEF777A));
        textField9.setText(AdminMainPage.n5);


        contentPane.add(textField11);
        textField11.setBounds(25, 270, 620, 40);
        textField11.setBackground(new Color(0xEF777A));
        textField11.setText(AdminMainPage.n6);


        contentPane.add(textField13);
        textField13.setBounds(25, 310, 620, 40);
        textField13.setBackground(new Color(0xEF777A));
        textField13.setText(AdminMainPage.n7);


        contentPane.add(textField15);
        textField15.setBounds(25, 350, 620, 40);
        textField15.setBackground(new Color(0xEF777A));
        textField15.setText(AdminMainPage.n8);


        contentPane.add(textField17);
        textField17.setBounds(25, 390, 620, 40);
        textField17.setBackground(new Color(0xEF777A));
        textField17.setText(AdminMainPage.n9);


        contentPane.add(textField19);
        textField19.setBounds(25, 430, 620, 40);
        textField19.setBackground(new Color(0xEF777A));
        textField19.setText(AdminMainPage.n10);


        contentPane.add(checkBox1);
        checkBox1.setBounds(new Rectangle(new Point(670, 80), checkBox1.getPreferredSize()));
        checkBox1.addActionListener(this::actionPerformed);
        contentPane.add(checkBox2);
        checkBox2.setBounds(new Rectangle(new Point(670, 120), checkBox2.getPreferredSize()));
        checkBox2.addActionListener(this::actionPerformed);
        contentPane.add(checkBox3);
        checkBox3.setBounds(new Rectangle(new Point(670, 160), checkBox3.getPreferredSize()));
        checkBox3.addActionListener(this::actionPerformed);
        contentPane.add(checkBox4);
        checkBox4.setBounds(new Rectangle(new Point(670, 200), checkBox4.getPreferredSize()));
        checkBox4.addActionListener(this::actionPerformed);
        contentPane.add(checkBox5);
        checkBox5.setBounds(670, 240, 20, 20);
        checkBox5.addActionListener(this::actionPerformed);
        contentPane.add(checkBox6);
        checkBox6.setBounds(new Rectangle(new Point(670, 280), checkBox6.getPreferredSize()));
        checkBox6.addActionListener(this::actionPerformed);
        contentPane.add(checkBox7);
        checkBox7.setBounds(new Rectangle(new Point(670, 320), checkBox7.getPreferredSize()));
        checkBox7.addActionListener(this::actionPerformed);
        contentPane.add(checkBox8);
        checkBox8.setBounds(new Rectangle(new Point(670, 360), checkBox8.getPreferredSize()));
        checkBox8.addActionListener(this::actionPerformed);
        contentPane.add(checkBox9);
        checkBox9.setBounds(new Rectangle(new Point(670, 400), checkBox9.getPreferredSize()));
        checkBox9.addActionListener(this::actionPerformed);
        contentPane.add(checkBox10);
        checkBox10.setBounds(new Rectangle(new Point(670, 440), checkBox10.getPreferredSize()));
        checkBox10.addActionListener(this::actionPerformed);

        //---- button1 ----
        button1.setText("Choose Your Seat");
        button1.setBackground(new Color(0xF8676B));
        button1.setForeground(Color.WHITE);
        contentPane.add(button1);
        button1.setBounds(550, 505, 155, 35);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Cancel");
        button2.setBackground(new Color(0xcc0000));
        button2.setForeground(Color.WHITE);
        contentPane.add(button2);
        button2.setBounds(455, 505, 90, 35);
        button2.addActionListener(this::actionPerformed);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(730, 585);
        setVisible(true);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField7;
    private JTextField textField9;
    private JTextField textField11;
    private JTextField textField13;
    private JTextField textField15;
    private JTextField textField17;
    private JTextField textField19;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JButton button1;
    private JButton button2;
    private int count;
    public static String T1,T3,T5,T7,T9,T11,T13,T15,T17,T19,ToT;




    @Override
    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == checkBox1){
            if (checkBox1.isSelected()){
                T1=textField1.getText();
                if (T1!=null){
                    count++;
                    textField1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else{
                    count--;
                    T1="";
                }
            }
            else{
                count--;
                textField1.setBorder(null);
                T1="";
            }
        }
        if (e.getSource() == checkBox2){
            if (checkBox2.isSelected()){
                T3=textField3.getText();
                if (T3!=null){
                    count++;
                    textField3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else {
                    count--;
                    T3="";
                }
            }
            else{
                count--;
                textField3.setBorder(null);
                T3="";
            }
        }
        if (e.getSource() == checkBox3){
            if (checkBox3.isSelected()){
                T5=textField5.getText();
                if (T5!=null){
                    count++;
                    textField5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else{
                    count--;
                    T5="";
                }
            }
            else{
                count--;
                textField5.setBorder(null);
                T5="";
            }
        }
        if (e.getSource() == checkBox4){
            if (checkBox4.isSelected()){
                T7=textField7.getText();
                if(T7!=null){
                    count++;
                    textField7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else {
                    count--;
                    T7="";
                }
            }
            else{
                count--;
                textField7.setBorder(null);
                T7="";
            }
        }
        if (e.getSource() == checkBox5){
            if (checkBox5.isSelected()){
                T9=textField9.getText();
                if (T9!=null){
                    count++;
                    textField9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else {
                    count--;
                    T9="";
                }
            }
            else{
                count--;
                textField9.setBorder(null);
                T9="";
            }
        }
        if (e.getSource() == checkBox6){
            if (checkBox6.isSelected()){
                T11=textField11.getText();
                if(T11!=null){
                    count++;
                    textField11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else {
                    count--;
                    T11="";
                }
            }
            else{
                count--;
                textField11.setBorder(null);
                T11="";
            }
        }
        if (e.getSource() == checkBox7){
            if (checkBox7.isSelected()){
                T13=textField13.getText();
                if(T13!=null){
                    count++;
                    textField13.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else {
                    count--;
                    T13="";
                }
            }
            else{
                count--;
                textField13.setBorder(null);
                T13="";
            }
        }
        if (e.getSource() == checkBox8){
            if (checkBox8.isSelected()){
                T15=textField15.getText();
                if(T15!=null){
                    count++;
                    textField15.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else {
                    count--;
                    T15="";
                }
            }
            else{
                count--;
                textField15.setBorder(null);
                T15="";
            }
        }
        if (e.getSource() == checkBox9){
            if (checkBox9.isSelected()){
                T17=textField17.getText();
                if (T17!=null){
                    count++;
                    textField17.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else{
                    count--;
                    T17="";
                }

            }
            else{
                count--;
                textField17.setBorder(null);
                T17="";
            }
        }
        if (e.getSource() == checkBox10){
            if (checkBox10.isSelected()){
                T19=textField19.getText();

                if (T19!=null){
                    count++;
                    textField19.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
                }else{
                    count--;
                    T19="";
                }

            }
            else{
                count--;
                textField19.setBorder(null);
                T19="";
            }
        }






        if (e.getSource() == button2){
            dispose();
            if(Login.User.equals("admin") && Login.Pass.equals("admin")){
                AdminMainPage adminMainPage = new AdminMainPage();
            }
            else{
                MainPage mainPage = new MainPage();
            }
        }
        if(e.getSource() == button1){
            dispose();
            if(count > 1 || count == 0){
                Error error = new Error();
            }
            else {

                if(checkBox1.isSelected()){ToT = T1;}
                else if(checkBox2.isSelected()){ToT = T3;}
                else if(checkBox3.isSelected()){ToT = T5;}
                else if(checkBox4.isSelected()){ToT = T7;}
                else if(checkBox5.isSelected()){ToT = T9;}
                else if(checkBox6.isSelected()){ToT = T11;}
                else if(checkBox7.isSelected()){ToT = T13;}
                else if(checkBox8.isSelected()){ToT = T15;}
                else if(checkBox9.isSelected()){ToT = T17;}
                else if(checkBox10.isSelected()){ToT = T19;}

                SeatSelection seatSelection = new SeatSelection();

            }
            }







        }
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

