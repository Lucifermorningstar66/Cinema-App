import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.rmi.ssl.SslRMIClientSocketFactory;




/**
 * @author global village
 */
public class AddMovie extends JFrame implements ActionListener {
    public AddMovie() {
        initComponents();
    }
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\movielist.txt");
    public static ArrayList<String> Movies = new ArrayList<>();
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
        label1.setText("Add MOVIE");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(15, 15, 200, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0xF8676B));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 350, 45);

        //---- label2 ----
        label2.setText("Title");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 80), label2.getPreferredSize()));
        label2.setForeground(Color.white);

        //---- textField2 ----
        textField2.setBackground(new Color(0xF8676B));
        contentPane.add(textField2);
        textField2.setBounds(20, 170, 350, 45);

        //---- label3 ----
        label3.setText("Director");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 155), label3.getPreferredSize()));
        label3.setForeground(Color.white);

        //---- textField4 ----
        textField4.setBackground(new Color(0xF8676B));
        contentPane.add(textField4);
        textField4.setBounds(20, 245, 350, 45);


        //---- label4 ----
        label4.setText("Genre");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(25, 230), label4.getPreferredSize()));
        label4.setForeground(Color.white);

        //---- textField3 ----
        textField3.setBackground(new Color(0xF8676B));
        contentPane.add(textField3);
        textField3.setBounds(20, 320, 350, 45);


        //---- label5 ----
        label5.setText("Time Length");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(25, 305), label5.getPreferredSize()));
        label5.setForeground(Color.white);

        //---- textField5 ----
        textField5.setBackground(new Color(0xF8676B));
        contentPane.add(textField5);
        textField5.setBounds(20, 395, 350, 45);
        textField5.setText("20--/--/-- - --:--");


        //---- label6 ----
        label6.setText("Date and Time");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(25, 380), label6.getPreferredSize()));
        label6.setForeground(Color.white);

        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xFFAD2D2F,true));
        button1.setForeground(Color.white);
        contentPane.add(button1);
        button1.setBounds(70, 470, 120, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Add");
        button2.setBackground(new Color(0xF8676B));
        button2.setForeground(Color.white);
        contentPane.add(button2);
        button2.setBounds(215, 470, 125, 45);
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
    private JButton button2;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Menu menu = new Menu();
        }

        if(e.getSource() == button2){
            name = textField1.getText();
            director = textField2.getText();
            genre = textField4.getText();
            timelen = textField3.getText();
            date = textField5.getText();

            Movie movie = new Movie(name,director,genre,timelen,date);


            ArrayList<String> info = new ArrayList<>();
            info.add(name);
            info.add(director);
            info.add(genre);
            info.add(timelen);
            info.add(date);

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
            MovieAdded movieAdded = new MovieAdded();

        }
    }




}
