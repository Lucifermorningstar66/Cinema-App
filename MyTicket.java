import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Jul 25 14:49:43 IRST 2024
 */



/**
 * @author global village
 */
public class MyTicket extends JFrame implements ActionListener {

    public MyTicket() {
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
        label1.setText("My Ticket");
        label1.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
        label1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label1.setForeground(new Color(0xFFFFFFFF,true));
        contentPane.add(label1);
        label1.setBounds(385, 5, 110, 40);

        //---- label2 ----
        label2.setText(MainPage.Tx.get(0));
        label2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label2.setForeground(new Color(0xFFFFFFFF,true));
        contentPane.add(label2);
        label2.setBounds(15, 65, 825, 40);

        //---- label3 ----
        label3.setText(MainPage.Tx.get(1));
        label3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label3.setForeground(new Color(0xFFFFFFFF,true));
        contentPane.add(label3);
        label3.setBounds(15, 105, 825, 40);

        //---- label4 ----
        label4.setText(MainPage.Tx.get(2));
        label4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label4.setForeground(new Color(0xFFFFFFFF,true));
        contentPane.add(label4);
        label4.setBounds(15, 140, 825, 40);

        //---- label5 ----
        label5.setText(MainPage.Tx.get(3));
        label5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label5.setForeground(new Color(0xFFFFFFFF,true));
        contentPane.add(label5);
        label5.setBounds(15, 180, 825, 40);

        //---- label6 ----
        label6.setText(MainPage.Tx.get(4));
        label6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        label6.setForeground(new Color(0xFFFFFFFF,true));
        contentPane.add(label6);
        label6.setBounds(15, 220, 825, 40);

        //---- button1 ----
        button1.setText("Done");
        button1.setBackground(new Color(0xB66064));
        button1.setForeground(Color.WHITE);
        contentPane.add(button1);
        button1.setBounds(730, 340, 103, 35);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Cancel Ticket");
        button2.setBackground(new Color(0x7A2B30));
        button2.setForeground(Color.WHITE);
        contentPane.add(button2);
        button2.setBounds(610, 340, 112, 35);
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
        setSize(865, 425);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
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
        if (e.getSource() == button2){
            dispose();
            CancelTicket cancelTicket = new CancelTicket();
        }
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
