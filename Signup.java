import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.rmi.ssl.SslRMIClientSocketFactory;




/**
 * @author global village
 */
public class Signup extends JFrame implements ActionListener {
    public Signup() {
        initComponents();
    }
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\database.txt");
    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();


        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Sign Up");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(15, 15, 135, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0xF8676B));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 350, 45);

        //---- label2 ----
        label2.setText("Username");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 80), label2.getPreferredSize()));
        label2.setForeground(Color.white);

        //---- textField2 ----
        textField2.setBackground(new Color(0xF8676B));
        contentPane.add(textField2);
        textField2.setBounds(20, 170, 350, 45);

        //---- label3 ----
        label3.setText("Password");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 155), label3.getPreferredSize()));
        label3.setForeground(Color.white);

        //---- textField4 ----
        textField4.setBackground(new Color(0xF8676B));
        contentPane.add(textField4);
        textField4.setBounds(20, 245, 350, 45);


        //---- label4 ----
        label4.setText("Email");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(25, 230), label4.getPreferredSize()));
        label4.setForeground(Color.white);

        //---- textField3 ----
        textField3.setBackground(new Color(0xF8676B));
        contentPane.add(textField3);
        textField3.setBounds(20, 320, 350, 45);


        //---- label5 ----
        label5.setText("Number");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(25, 305), label5.getPreferredSize()));
        label5.setForeground(Color.white);


        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xFFAD2D2F,true));
        button1.setForeground(Color.white);
        contentPane.add(button1);
        button1.setBounds(65, 465, 120, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Sign up");
        button2.setBackground(new Color(0xF8676B));
        button2.setForeground(Color.white);
        contentPane.add(button2);
        button2.setBounds(210, 465, 125, 45);
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
        setSize(405, 570);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static String username;
    public static String password;
    public static String email;
    public static String number;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label5;
    private JButton button1;
    private JButton button2;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Menu menu = new Menu();
        }

        if(e.getSource() == button2){
            username = textField1.getText();
            password = textField2.getText();
            email = textField4.getText();
            number = textField3.getText();

            if (username.equals("admin") && password.equals("admin")){
                dispose();

            }
            else {
            UserInfo user = new UserInfo(username,password,email,number);


            ArrayList<String> info = new ArrayList<>();
            info.add(username);
            info.add(password);
            info.add(email);
            info.add(number);

            try {
                FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                if (!file.exists()) {
                    file.createNewFile();
                }
                writer.write("\n" + info);
                writer.close();

            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }

            dispose();
            WelcomeNewMem welcomeNewMem = new WelcomeNewMem();
            }

        }
    }




}
