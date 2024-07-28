import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
public class MainPage extends JFrame implements ActionListener {
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\movielist.txt");
    public static File file2 = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\ticketlist.txt");

    public MainPage () {
        initComponents();
    }

    private void initComponents () {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

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
        button1.setBackground(new Color(0xB66064));
        button1.setForeground(new Color(0xeeeeee));
        contentPane.add(button1);
        button1.setBounds(150, 145, 190, 125);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Ticket Booking");
        button2.setBackground(new Color(0xF8676B));
        button2.setForeground(new Color(0xeeeeee));
        contentPane.add(button2);
        button2.setBounds(365, 145, 190, 125);
        button2.addActionListener(this::actionPerformed);

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
        button4.setBounds(538, 0,77,26);
        button4.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("My Ticket");
        button5.setBackground(new Color(0xB66064));
        button5.setForeground(Color.white);
        contentPane.add(button5);
        button5.setBounds(new Rectangle(new Point(450, 0), button5.getPreferredSize()));
        button5.addActionListener(this::actionPerformed);

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
    public static ArrayList<String> Tx = new ArrayList<>();
    public boolean found = false;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd   HH : mm : ss");
    private LocalDateTime now = LocalDateTime.now();






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
                    AdminMainPage.f1 = true;
                    break;
                case 2:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true;
                    break;
                case 3:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true;
                    break;
                case 4:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true;
                    break;
                case 5:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true; AdminMainPage.f5 = true;
                    break;
                case 6:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true; AdminMainPage.f5 = true; AdminMainPage.f6 = true;
                    break;
                case 7:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true; AdminMainPage.f5 = true; AdminMainPage.f6 = true; AdminMainPage.f7 = true;
                    break;
                case 8:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true; AdminMainPage.f5 = true; AdminMainPage.f6 = true; AdminMainPage.f7 = true; AdminMainPage.f8 = true;
                    break;
                case 9:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true; AdminMainPage.f5 = true; AdminMainPage.f6 = true; AdminMainPage.f7 = true; AdminMainPage.f8 = true; AdminMainPage.f9 = true;
                    break;
                case 10:
                    AdminMainPage.f1 = true; AdminMainPage.f2 = true; AdminMainPage.f3 = true; AdminMainPage.f4 = true; AdminMainPage.f5 = true; AdminMainPage.f6 = true; AdminMainPage.f7 = true; AdminMainPage.f8 = true; AdminMainPage.f9 = true; AdminMainPage.f10 = true;
                    break;
                default:
                    break;
            }

            if(AdminMainPage.f1){
                String mov1 = movies.get(0);
                mov1 = mov1.trim().substring(1,mov1.indexOf("]"));
                mov1 = mov1.replace(" ","");
                String[] m1 = mov1.split(",");

                AdminMainPage.n1 = "    " + m1[0] + "  |  " + " Drec." + m1[1] + "  |  " + m1[2] + "  |  " + m1[3] + "min";
                AdminMainPage.t1 = "    " + m1[4];
            }
            if(AdminMainPage.f2){
                String mov2 = movies.get(1);
                mov2 = mov2.trim().substring(1,mov2.indexOf("]"));
                mov2 = mov2.replace(" ","");
                String[] m2 = mov2.split(",");

                AdminMainPage.n2 = "    " + m2[0] + "  |  " + " Drec." + m2[1] + "  |  " + m2[2] + "  |  " + m2[3] + "min";
                AdminMainPage.t2 = "    " + m2[4];
            }
            if(AdminMainPage.f3){
                String mov3 = movies.get(2);
                mov3 = mov3.trim().substring(1,mov3.indexOf("]"));
                mov3 = mov3.replace(" ","");
                String[] m3 = mov3.split(",");

                AdminMainPage.n3 = "    " + m3[0] + "  |  " + " Drec." + m3[1] + "  |  " + m3[2] + "  |  " + m3[3] + "min";
                AdminMainPage.t3 = "    " + m3[4];

            }
            if(AdminMainPage.f4){
                String mov4 = movies.get(3);
                mov4 = mov4.trim().substring(1,mov4.indexOf("]"));
                mov4 = mov4.replace(" ","");
                String[] m4 = mov4.split(",");

                AdminMainPage.n4 = "    " + m4[0] + "  |  " + " Drec." + m4[1] + "  |  " + m4[2] + "  |  " + m4[3] + "min";
                AdminMainPage.t4 = "    " + m4[4];
            }
            if(AdminMainPage.f5){
                String mov5 = movies.get(4);
                mov5 = mov5.trim().substring(1,mov5.indexOf("]"));
                mov5 = mov5.replace(" ","");
                String[] m5 = mov5.split(",");

                AdminMainPage.n5 = "    " + m5[0] + "  |  " + " Drec." + m5[1] + "  |  " + m5[2] + "  |  " + m5[3] + "min";
                AdminMainPage.t5 = "    " + m5[4];
            }
            if(AdminMainPage.f6){
                String mov6 = movies.get(5);
                mov6 = mov6.trim().substring(1,mov6.indexOf("]"));
                mov6 = mov6.replace(" ","");
                String[] m6 = mov6.split(",");

                AdminMainPage.n6 = "    " + m6[0] + "  |  " + " Drec." + m6[1] + "  |  " + m6[2] + "  |  " + m6[3] + "min";
                AdminMainPage.t6 = "    " + m6[4];
            }
            if(AdminMainPage.f7){
                String mov7 = movies.get(6);
                mov7 = mov7.trim().substring(1,mov7.indexOf("]"));
                mov7 = mov7.replace(" ","");
                String[] m7 = mov7.split(",");

                AdminMainPage.n7 = "    " + m7[0] + "  |  " + " Drec." + m7[1] + "  |  " + m7[2] + "  |  " + m7[3] + "min";
                AdminMainPage.t7 = "    " + m7[4];
            }
            if(AdminMainPage.f8){
                String mov8 = movies.get(7);
                mov8 = mov8.trim().substring(1,mov8.indexOf("]"));
                mov8 = mov8.replace(" ","");
                String[] m8 = mov8.split(",");

                AdminMainPage.n8 = "    " + m8[0] + "  |  " + " Drec." + m8[1] + "  |  " + m8[2] + "  |  " + m8[3] + "min";
                AdminMainPage.t8 = "    " + m8[4];
            }
            if(AdminMainPage.f9){
                String mov9 = movies.get(8);
                mov9 = mov9.trim().substring(1,mov9.indexOf("]"));
                mov9 = mov9.replace(" ","");
                String[] m9 = mov9.split(",");

                AdminMainPage.n9 = "    " + m9[0] + "  |  " + " Drec." + m9[1] + "  |  " + m9[2] + "  |  " + m9[3] + "min";
                AdminMainPage.t9 = "    " + m9[4];
            }
            if(AdminMainPage.f10){
                String mov10 = movies.get(9);
                mov10 = mov10.trim().substring(1,mov10.indexOf("]"));
                mov10 = mov10.replace(" ","");
                String[] m10 = mov10.split(",");

                AdminMainPage.n10 = "    " + m10[0] + "  |  " + " Drec." + m10[1] + "  |  " + m10[2] + "  |  " + m10[3] + "min";
                AdminMainPage.t10 = "    " + m10[4];
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
        if(e.getSource() == button3){
            dispose();
            Profile profile = new Profile();
        }
        if(e.getSource() == button4){
            dispose();
            Menu menu = new Menu();
        }
        if (e.getSource() == button5){
            dispose();

            try{
                Scanner scanner = new Scanner(file2);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");


                    if(list[1].contains(Login.User)){
                        Tx.add(Arrays.toString(list));
                        found = true;
                    }
        }
                }catch (FileNotFoundException ex) {
    throw new RuntimeException(ex);
}

            if (found){
                System.out.println(Tx.size());
                for (int i = 0 ; i < 9-Tx.size() ; i++){
                    Tx.add(" ");
                }
                dispose();
                MyTicket myTicket = new MyTicket();
            }
            else {
                NoTicket noTicket = new NoTicket();
            }

}
        }
        }

