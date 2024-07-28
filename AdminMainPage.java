import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.*;

/*
 * Created by JFormDesigner on Tue Dec 26 02:43:32 IRST 2023
 */



/**
 * @author global village
 */
public class AdminMainPage extends JFrame implements ActionListener {
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\movielist.txt");
    public static File file2 = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\ticketlist.txt");
    public AdminMainPage() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Welcome to CinemaTicket, " + Login.User);
        label1.setFont(new Font("JetBrains Mono ExtraLight", Font.BOLD, 20));
        label1.setBackground(Color.black);
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(10, 0, 425, 50);

        //---- label2 ----
        label2.setText(dtf.format(now));
        label2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 16));
        label2.setForeground(Color.white);
        contentPane.add(label2);
        label2.setBounds(10, 40, 180, 40);

        //---- button1 ----
        button1.setText("Movie List");
        button1.setBackground(new Color(0xF8676B));
        button1.setForeground(new Color(0xeeeeee));
        contentPane.add(button1);
        button1.setBounds(50, 145, 175, 110);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Ticket Booking");
        button2.setBackground(new Color(0xF8676B));
        button2.setForeground(new Color(0xeeeeee));
        contentPane.add(button2);
        button2.setBounds(265, 145, 175, 110);
        button2.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("Add Movie");
        button5.setBackground(new Color(0xF8676B));
        button5.setForeground(new Color(0xeeeeee));
        contentPane.add(button5);
        button5.setBounds(480, 145, 175, 50);
        button5.addActionListener(this::actionPerformed);

        //---- button6 ----
        button6.setText("Remove Movie");
        button6.setBackground(new Color(0xF8676B));
        button6.setForeground(new Color(0xeeeeee));
        contentPane.add(button6);
        button6.setBounds(480, 205, 175, 50);
        button6.addActionListener(this::actionPerformed);

        //---- button7 ----
        button7.setText("My Ticket");
        button7.setBackground(new Color(0xB9144E));
        button7.setForeground(new Color(0xeeeeee));
        contentPane.add(button7);
        button7.setBounds(440, 0, 90, 26);
        button7.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("Profile");
        button3.setBackground(new Color(0x6E2336));
        button3.setForeground(Color.white);
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(615, 0), button3.getPreferredSize()));
        button3.addActionListener(this::actionPerformed);

        //---- button4 ----
        button4.setText("Exit");
        button4.setBackground(new Color(0xE14D51));
        button4.setForeground(Color.white);
        contentPane.add(button4);
        button4.setBounds(535, 0,77,26);
        button4.addActionListener(this::actionPerformed);

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
        setSize(705, 360);
        setVisible(true);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd   HH : mm : ss");
    private LocalDateTime now = LocalDateTime.now();

    public static String n1;
    public static String n2;
    public static String n3;
    public static String n4;
    public static String n5;
    public static String n6;
    public static String n7;
    public static String n8;
    public static String n9;
    public static String n10;
    public static String t1;
    public static String t2;
    public static String t3;
    public static String t4;
    public static String t5;
    public static String t6;
    public static String t7;
    public static String t8;
    public static String t9;
    public static String t10;
    public static boolean f1 = false;
    public static boolean f2 = false;
    public static boolean f3 = false;
    public static boolean f4 = false;
    public static boolean f5 = false;
    public static boolean f6 = false;
    public static boolean f7 = false;
    public static boolean f8 = false;
    public static boolean f9 = false;
    public static boolean f10 = false;







    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == button1){
            dispose();

            ArrayList<String> movies = new ArrayList<>();

            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(1,array.indexOf("]"));
                    array = array.replace(" ","");
                    String[] list = array.split(",");
                    movies.add(Arrays.toString(list));
                }
                System.out.println(movies);
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            int n = movies.size();

            switch (n){
                case 1:
                    f1 = true;
                    break;
                case 2:
                    f1 = true; f2 = true;
                    break;
                case 3:
                    f1 = true; f2 = true; f3 = true;
                    break;
                case 4:
                    f1 = true; f2 = true; f3 = true; f4 = true;
                    break;
                case 5:
                    f1 = true; f2 = true; f3 = true; f4 = true; f5 = true;
                    break;
                case 6:
                    f1 = true; f2 = true; f3 = true; f4 = true; f5 = true; f6 = true;
                    break;
                case 7:
                    f1 = true; f2 = true; f3 = true; f4 = true; f5 = true; f6 = true; f7 = true;
                    break;
                case 8:
                    f1 = true; f2 = true; f3 = true; f4 = true; f5 = true; f6 = true; f7 = true; f8 = true;
                    break;
                case 9:
                    f1 = true; f2 = true; f3 = true; f4 = true; f5 = true; f6 = true; f7 = true; f8 = true; f9 = true;
                    break;
                case 10:
                    f1 = true; f2 = true; f3 = true; f4 = true; f5 = true; f6 = true; f7 = true; f8 = true; f9 = true; f10 = true;
                    break;
                default:
                    break;
            }

            if(f1){
                String mov1 = movies.get(0);
                mov1 = mov1.trim().substring(1,mov1.indexOf("]"));
                mov1 = mov1.replace(" ","");
                String[] m1 = mov1.split(",");

                n1 = "    " + m1[0] + "  |  " + " Drec." + m1[1] + "  |  " + m1[2] + "  |  " + m1[3] + "min";
                t1 = "    " + m1[4];
            }
            if(f2){
                String mov2 = movies.get(1);
                mov2 = mov2.trim().substring(1,mov2.indexOf("]"));
                mov2 = mov2.replace(" ","");
                String[] m2 = mov2.split(",");

                n2 = "    " + m2[0] + "  |  " + " Drec." + m2[1] + "  |  " + m2[2] + "  |  " + m2[3] + "min";
                t2 = "    " + m2[4];
            }
            if(f3){
                String mov3 = movies.get(2);
                mov3 = mov3.trim().substring(1,mov3.indexOf("]"));
                mov3 = mov3.replace(" ","");
                String[] m3 = mov3.split(",");

                n3 = "    " + m3[0] + "  |  " + " Drec." + m3[1] + "  |  " + m3[2] + "  |  " + m3[3] + "min";
                t3 = "    " + m3[4];

            }
            if(f4){
                String mov4 = movies.get(3);
                mov4 = mov4.trim().substring(1,mov4.indexOf("]"));
                mov4 = mov4.replace(" ","");
                String[] m4 = mov4.split(",");

                n4 = "    " + m4[0] + "  |  " + " Drec." + m4[1] + "  |  " + m4[2] + "  |  " + m4[3] + "min";
                t4 = "    " + m4[4];
            }
            if(f5){
                String mov5 = movies.get(4);
                mov5 = mov5.trim().substring(1,mov5.indexOf("]"));
                mov5 = mov5.replace(" ","");
                String[] m5 = mov5.split(",");

                n5 = "    " + m5[0] + "  |  " + " Drec." + m5[1] + "  |  " + m5[2] + "  |  " + m5[3] + "min";
                t5 = "    " + m5[4];
            }
            if(f6){
                String mov6 = movies.get(5);
                mov6 = mov6.trim().substring(1,mov6.indexOf("]"));
                mov6 = mov6.replace(" ","");
                String[] m6 = mov6.split(",");

                n6 = "    " + m6[0] + "  |  " + " Drec." + m6[1] + "  |  " + m6[2] + "  |  " + m6[3] + "min";
                t6 = "    " + m6[4];
            }
            if(f7){
                String mov7 = movies.get(6);
                mov7 = mov7.trim().substring(1,mov7.indexOf("]"));
                mov7 = mov7.replace(" ","");
                String[] m7 = mov7.split(",");

                n7 = "    " + m7[0] + "  |  " + " Drec." + m7[1] + "  |  " + m7[2] + "  |  " + m7[3] + "min";
                t7 = "    " + m7[4];
            }
            if(f8){
                String mov8 = movies.get(7);
                mov8 = mov8.trim().substring(1,mov8.indexOf("]"));
                mov8 = mov8.replace(" ","");
                String[] m8 = mov8.split(",");

                n8 = "    " + m8[0] + "  |  " + " Drec." + m8[1] + "  |  " + m8[2] + "  |  " + m8[3] + "min";
                t8 = "    " + m8[4];
            }
            if(f9){
                String mov9 = movies.get(8);
                mov9 = mov9.trim().substring(1,mov9.indexOf("]"));
                mov9 = mov9.replace(" ","");
                String[] m9 = mov9.split(",");

                n9 = "    " + m9[0] + "  |  " + " Drec." + m9[1] + "  |  " + m9[2] + "  |  " + m9[3] + "min";
                t9 = "    " + m9[4];
            }
            if(f10){
                String mov10 = movies.get(9);
                mov10 = mov10.trim().substring(1,mov10.indexOf("]"));
                mov10 = mov10.replace(" ","");
                String[] m10 = mov10.split(",");

                n10 = "    " + m10[0] + "  |  " + " Drec." + m10[1] + "  |  " + m10[2] + "  |  " + m10[3] + "min";
                t10 = "    " + m10[4];
            }


            MovieList movieList = new MovieList();
        }
        if(e.getSource() == button2){
            dispose();
            try {
TicketBook ticketBook = new TicketBook();} catch (IOException ex) {
    throw new RuntimeException(ex);
}
        }
        if(e.getSource() == button5){
            dispose();
            AddMovie addMovie = new AddMovie();
        }
        if(e.getSource() == button3){
            dispose();
            Profile profile = new Profile();
        }
        if(e.getSource() == button4){
            dispose();
            Menu menu = new Menu();
        }
        if(e.getSource() == button6){
            dispose();
            RemoveMovie removeMovie = new RemoveMovie();
        }

    }

}
