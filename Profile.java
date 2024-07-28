import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame implements ActionListener {
    public Profile() {
        initComponents();
    }

    ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\2.png");
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Username : "+ Login.User);
        label1.setForeground(Color.WHITE);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label1);
        label1.setBounds(123, 210, 150, 150);

        //---- button1 ----
        button1.setText("Back");
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(0xE13F43));
        contentPane.add(button1);
        button1.setBounds(15, 500, 95, 35);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Edit");
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(0xE13F43));
        contentPane.add(button2);
        button2.setBounds(115, 500, 95, 35);
        button2.addActionListener(this::actionPerformed);

        //---- label2 ----
        label2.setText("CinemaTicket");
        label2.setFont(new Font("Rockwell", Font.BOLD, 20));
        contentPane.add(label2);
        label2.setBounds(135, 5, 170, 25);
        label2.setForeground(Color.WHITE);

        //---- label3 ----
        label3.setIcon(imageIcon1);
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setBounds(128,50,100,100);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setSize(146,150);
        contentPane.add(label3);

        //---- label5 ----
        label5.setText("Password : "+ Login.Pass);
        label5.setForeground(Color.WHITE);
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setVerticalAlignment(SwingConstants.TOP);
        label5.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label5);
        label5.setBounds(100, 235, 200, 150);

        //---- label6 ----
        label6.setText("Email : "+ Login.Email);
        label6.setForeground(Color.white);
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setVerticalAlignment(SwingConstants.TOP);
        label6.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label6);
        label6.setBounds(100, 260, 250, 150);

        //---- label7 ----
        label7.setText("Number : "+ Login.Number);
        label7.setForeground(Color.WHITE);
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setVerticalAlignment(SwingConstants.TOP);
        label7.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label7);
        label7.setBounds(85, 285, 200, 150);

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
        setSize(400, 580);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label7;
    private JLabel label6;
    private JLabel label5;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            if(Login.User.equals("admin") && Login.Pass.equals("admin")){
                AdminMainPage adminMainPage = new AdminMainPage();
            }
            else{
                MainPage mainPage = new MainPage();
            }
        }
        if(e.getSource() == button2){
            dispose();
            EditProfile editProfile = new EditProfile();
        }
    }


    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

