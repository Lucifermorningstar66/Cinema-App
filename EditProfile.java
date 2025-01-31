import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;




/**
 * @author global village
 */
public class EditProfile extends JFrame implements ActionListener {
    public String filePath = "C:\\Users\\global village\\OneDrive\\Desktop\\proX\\database.txt";
    public EditProfile() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Editing");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle(), label1.getFont().getSize() + 15));
        label1.setBackground(Color.black);
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(15, 15, 135, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0xF8676B));
        contentPane.add(textField1);
        textField1.setBounds(20, 85, 350, 45);

        //---- textField2 ----
        textField2.setBackground(new Color(0xF8676B));
        contentPane.add(textField2);
        textField2.setBounds(20, 160, 350, 45);

        //---- label2 ----
        label2.setText("Part You Wanna Edit (user/pass/email/number)");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 70), label2.getPreferredSize()));
        label2.setForeground(Color.white);

        //---- label3 ----
        label3.setText("Type The New One");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 145), label3.getPreferredSize()));
        label3.setForeground(Color.white);


        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xFFAD2D2F,true));
        button1.setForeground(new Color(0xeeeeee));
        contentPane.add(button1);
        button1.setBounds(65, 315, 115, 35);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Done");
        button2.setBackground(new Color(0xF8676B));
        button2.setForeground(new Color(0xeeeeee));
        contentPane.add(button2);
        button2.setBounds(210, 315, 115, 35);
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
        setSize(395, 445);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    public static boolean invalid;
    public static String User;
    public static String Pass;
    public static String Email;
    public static String Number;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JButton button1;
    private JButton button2;@Override



    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Profile profile = new Profile();
        }
        if(e.getSource() == button2){
            try{
                Scanner scanner = new Scanner(Signup.file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(1,array.indexOf("]"));
                    array = array.replace(" ","");
                    String[] list = array.split(",");

                    if(Login.User.equals(list[0]) && Login.Pass.equals(list[1])){
                        if (textField1.getText().equals("user")){
                            try {
                                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                                content = content.replaceAll(list[0], textField2.getText());
                                Files.write(Paths.get(filePath), content.getBytes());
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        else if(textField1.getText().equals("pass")){
                            try {
                                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                                content = content.replaceAll(list[1], textField2.getText());
                                Files.write(Paths.get(filePath), content.getBytes());
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        else if(textField1.getText().equals("email")){
                            try {
                                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                                content = content.replaceAll(list[2], textField2.getText());
                                Files.write(Paths.get(filePath), content.getBytes());
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        else if(textField1.getText().equals("number")){
                            try {
                                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                                content = content.replaceAll(list[3], textField2.getText());
                                Files.write(Paths.get(filePath), content.getBytes());
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        break;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }
            dispose();
            Profile profile = new Profile();
        }

    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

//ddd
//[d, d, d]