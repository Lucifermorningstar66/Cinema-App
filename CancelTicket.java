import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import javax.rmi.ssl.SslRMIClientSocketFactory;




/**
 * @author global village
 */
public class CancelTicket extends JFrame implements ActionListener {
    public CancelTicket () {
        initComponents();
    }

    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\ticketlist.txt");
    public static String filePath = "C:\\Users\\global village\\OneDrive\\Desktop\\proX\\ticketlist.txt";

    private void initComponents () {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();


        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Cancel TICKET");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(15, 15, 200, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0xF8676B));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 250, 45);

        //---- textField2 ----
        textField2.setBackground(new Color(0xF8676B));
        contentPane.add(textField2);
        textField2.setBounds(280, 95, 90, 45);

        //---- label2 ----
        label2.setText("Title");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 80), label2.getPreferredSize()));
        label2.setForeground(Color.white);

        //---- label3 ----
        label3.setText("Seat Number");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(285, 80), label3.getPreferredSize()));
        label3.setForeground(Color.white);

        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xFFAD2D2F,true));
        button1.setForeground(Color.white);
        contentPane.add(button1);
        button1.setBounds(60, 180, 120, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Remove");
        button2.setBackground(new Color(0xF8676B));
        button2.setForeground(Color.white);
        contentPane.add(button2);
        button2.setBounds(205, 180, 125, 45);
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
        setSize(405, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static String name;
    public static String director;
    public static String genre;
    public static String timelen;
    public static String date;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton button2;
    public boolean err = true;
    @Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            MyTicket myTicket = new MyTicket();
        }

        if(e.getSource() == button2){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

//                    System.out.println(Arrays.toString(list));
//                    System.out.println(list[0].contains(textField1.getText()));
//                    System.out.println(list[1].contains(Login.User));
//                    System.out.println(list[2].equals(" seatNumber="+textField2.getText()));
//                    System.out.println("  seatNumber="+textField2.getText());

                    if(list[0].contains(textField1.getText()) && list[1].contains(Login.User) && list[2].equals(" seatNumber="+textField2.getText())){
                        err = false;
                        try {
                            String content = new String(Files.readAllBytes(Paths.get(filePath)));
                            content = content.replaceAll(list[0], " - ");
                            content = content.replaceAll(list[1], " - ");
                            content = content.replaceAll(list[2], " - ");
                            Files.write(Paths.get(filePath), content.getBytes());

                            dispose();
                            TicketCanceled ticketCanceled = new TicketCanceled();

                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        break;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(err){
                dispose();
                Error error = new Error();
            }
        }




    }
}






