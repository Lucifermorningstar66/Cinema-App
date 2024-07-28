import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Dec 31 02:52:53 IRST 2023
 */



/**
 * @author global village
 */
public class MovieList extends JFrame implements ActionListener {
    public MovieList() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
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
        label1.setText(AdminMainPage.n1);
        label1.setForeground(new Color(0xFFFFFF));
        label1.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label1);
        label1.setBounds(15, 55, 545, 35);

        //---- label2 ----
        label2.setText(AdminMainPage.t1);
        label2.setForeground(new Color(0xFFFFFF));
        label2.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label2);
        label2.setBounds(575, 55, 130, 35);

        //---- label3 ----
        label3.setText(AdminMainPage.n2);
        label3.setForeground(new Color(0xFFFFFF));
        label3.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label3);
        label3.setBounds(15, 95, 545, 35);

        //---- label4 ----
        label4.setText(AdminMainPage.t2);
        label4.setForeground(new Color(0xFFFFFF));
        label4.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label4);
        label4.setBounds(575, 95, 130, 35);

        //---- label5 ----
        label5.setText(AdminMainPage.n3);
        label5.setForeground(new Color(0xFFFFFF));
        label5.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label5);
        label5.setBounds(15, 135, 545, 35);

        //---- label6 ----
        label6.setText(AdminMainPage.t3);
        label6.setForeground(new Color(0xFFFFFF));
        label6.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label6);
        label6.setBounds(575, 135, 130, 35);

        //---- label7 ----
        label7.setText(AdminMainPage.n4);
        label7.setForeground(new Color(0xFFFFFF));
        label7.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label7);
        label7.setBounds(15, 175, 545, 35);

        //---- label8 ----
        label8.setText(AdminMainPage.t4);
        label8.setForeground(new Color(0xFFFFFF));
        label8.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label8);
        label8.setBounds(575, 175, 130, 35);

        //---- label9 ----
        label9.setText(AdminMainPage.n5);
        label9.setForeground(new Color(0xFFFFFF));
        label9.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label9);
        label9.setBounds(15, 215, 545, 35);

        //---- label10 ----
        label10.setText(AdminMainPage.t5);
        label10.setForeground(new Color(0xFFFFFF));
        label10.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label10);
        label10.setBounds(575, 215, 130, 35);

        //---- label11 ----
        label11.setText(AdminMainPage.n6);
        label11.setForeground(new Color(0xFFFFFF));
        label11.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label11);
        label11.setBounds(15, 255, 545, 35);

        //---- label12 ----
        label12.setText(AdminMainPage.t6);
        label12.setForeground(new Color(0xFFFFFF));
        label12.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label12);
        label12.setBounds(575, 255, 130, 35);

        //---- label13 ----
        label13.setText(AdminMainPage.n7);
        label13.setForeground(new Color(0xFFFFFF));
        label13.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label13);
        label13.setBounds(15, 295, 545, 35);

        //---- label14 ----
        label14.setText(AdminMainPage.t7);
        label14.setForeground(new Color(0xFFFFFF));
        label14.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label14);
        label14.setBounds(575, 295, 130, 35);

        //---- label15 ----
        label15.setText(AdminMainPage.n8);
        label15.setForeground(new Color(0xFFFFFF));
        label15.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label15);
        label15.setBounds(15, 335, 545, 35);

        //---- label16 ----
        label16.setText(AdminMainPage.t8);
        label16.setForeground(new Color(0xFFFFFF));
        label16.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label16);
        label16.setBounds(575, 335, 130, 35);

        //---- label17 ----
        label17.setText(AdminMainPage.n9);
        label17.setForeground(new Color(0xFFFFFF));
        label17.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label17);
        label17.setBounds(15, 375, 545, 35);

        //---- label18 ----
        label18.setText(AdminMainPage.t9);
        label18.setForeground(new Color(0xFFFFFF));
        label18.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label18);
        label18.setBounds(575, 375, 130, 35);

        //---- label19 ----
        label19.setText(AdminMainPage.n10);
        label19.setForeground(new Color(0xFFFFFF));
        label19.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF), 2));
        contentPane.add(label19);
        label19.setBounds(15, 415, 545, 35);

        //---- label20 ----
        label20.setText(AdminMainPage.t10);
        label20.setForeground(new Color(0xFFFFFF));
        label20.setBorder(BorderFactory.createLineBorder(new Color(0x35C7AB), 2));
        contentPane.add(label20);
        label20.setBounds(575, 415, 130, 35);

        //---- label21 ----
        label21.setText("MOVIE LIST");
        label21.setFont(new Font("Papyrus", Font.BOLD, 20));
        label21.setForeground(new Color(0xFFFFFF));
        label21.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        contentPane.add(label21);
        label21.setBounds(new Rectangle(new Point(230, 5), label21.getPreferredSize()));


        //---- button1 ----
        button1.setText("Done");
        button1.setBackground(new Color(0xB66064));
        button1.setForeground(new Color(0xFFFFFF));
        contentPane.add(button1);
        button1.setBounds(610, 490, 95, 35);
        button1.addActionListener(this::actionPerformed);

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
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JButton button1;
    private JButton button2;




    @Override
    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == button1){
            dispose();
            if(Login.User.equals("admin") && Login.Pass.equals("admin")){
                AdminMainPage adminMainPage = new AdminMainPage();
            }
            else{
                MainPage mainPage = new MainPage();
            }
        }

    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
