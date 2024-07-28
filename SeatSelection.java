import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Jul 25 10:43:12 IRST 2024
 */



/**
 * @author global village
 */
public class SeatSelection extends JFrame implements ActionListener {
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\ticketlist.txt");
    public SeatSelection() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button21 = new JButton();
        button20 = new JButton();
        button19 = new JButton();
        button18 = new JButton();
        button17 = new JButton();
        button16 = new JButton();
        button15 = new JButton();
        button14 = new JButton();
        button13 = new JButton();
        button12 = new JButton();
        button11 = new JButton();
        button10 = new JButton();
        button9 = new JButton();
        button8 = new JButton();
        button7 = new JButton();
        button6 = new JButton();
        button5 = new JButton();
        button4 = new JButton();
        button3 = new JButton();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout());

        //---- button20 ----
        button21.setText("Back");
        contentPane.add(button21);
        button21.setBackground(new Color(0xD00E0E));
        button21.setForeground(new Color(0xeeeeee));
        button21.addActionListener(this::actionPerformed);

        //---- button20 ----
        button20.setText("20");
        contentPane.add(button20);
        button20.setBackground(new Color(0xB66064));
        button20.setForeground(new Color(0xeeeeee));
        button20.addActionListener(this::actionPerformed);

        //---- button19 ----
        button19.setText("19");
        contentPane.add(button19);
        button19.setBackground(new Color(0xB66064));
        button19.setForeground(new Color(0xeeeeee));
        button19.addActionListener(this::actionPerformed);

        //---- button18 ----
        button18.setText("18");
        contentPane.add(button18);
        button18.setBackground(new Color(0xB66064));
        button18.setForeground(new Color(0xeeeeee));
        button18.addActionListener(this::actionPerformed);

        //---- button17 ----
        button17.setText("17");
        contentPane.add(button17);
        button17.setBackground(new Color(0xB66064));
        button17.setForeground(new Color(0xeeeeee));
        button17.addActionListener(this::actionPerformed);

        //---- button16 ----
        button16.setText("16");
        contentPane.add(button16);
        button16.setBackground(new Color(0xB66064));
        button16.setForeground(new Color(0xeeeeee));
        button16.addActionListener(this::actionPerformed);

        //---- button15 ----
        button15.setText("15");
        contentPane.add(button15);
        button15.setBackground(new Color(0xB66064));
        button15.setForeground(new Color(0xeeeeee));
        button15.addActionListener(this::actionPerformed);

        //---- button14 ----
        button14.setText("14");
        contentPane.add(button14);
        button14.setBackground(new Color(0xB66064));
        button14.setForeground(new Color(0xeeeeee));
        button14.addActionListener(this::actionPerformed);

        //---- button13 ----
        button13.setText("13");
        contentPane.add(button13);
        button13.setBackground(new Color(0xB66064));
        button13.setForeground(new Color(0xeeeeee));
        button13.addActionListener(this::actionPerformed);

        //---- button12 ----
        button12.setText("12");
        contentPane.add(button12);
        button12.setBackground(new Color(0xB66064));
        button12.setForeground(new Color(0xeeeeee));
        button12.addActionListener(this::actionPerformed);

        //---- button11 ----
        button11.setText("11");
        contentPane.add(button11);
        button11.setBackground(new Color(0xB66064));
        button11.setForeground(new Color(0xeeeeee));
        button11.addActionListener(this::actionPerformed);

        //---- button10 ----
        button10.setText("10");
        contentPane.add(button10);
        button10.setBackground(new Color(0xB66064));
        button10.setForeground(new Color(0xeeeeee));
        button10.addActionListener(this::actionPerformed);

        //---- button9 ----
        button9.setText("9");
        contentPane.add(button9);
        button9.setBackground(new Color(0xB66064));
        button9.setForeground(new Color(0xeeeeee));
        button9.addActionListener(this::actionPerformed);

        //---- button8 ----
        button8.setText("8");
        contentPane.add(button8);
        button8.setBackground(new Color(0xB66064));
        button8.setForeground(new Color(0xeeeeee));
        button8.addActionListener(this::actionPerformed);

        //---- button7 ----
        button7.setText("7");
        contentPane.add(button7);
        button7.setBackground(new Color(0xB66064));
        button7.setForeground(new Color(0xeeeeee));
        button7.addActionListener(this::actionPerformed);

        //---- button6 ----
        button6.setText("6");
        contentPane.add(button6);
        button6.setBackground(new Color(0xB66064));
        button6.setForeground(new Color(0xeeeeee));
        button6.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("5");
        contentPane.add(button5);
        button5.setBackground(new Color(0xB66064));
        button5.setForeground(new Color(0xeeeeee));
        button5.addActionListener(this::actionPerformed);

        //---- button4 ----
        button4.setText("4");
        contentPane.add(button4);
        button4.setBackground(new Color(0xB66064));
        button4.setForeground(new Color(0xeeeeee));
        button4.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("3");
        contentPane.add(button3);
        button3.setBackground(new Color(0xB66064));
        button3.setForeground(new Color(0xeeeeee));
        button3.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("2");
        contentPane.add(button2);
        button2.setBackground(new Color(0xB66064));
        button2.setForeground(new Color(0xeeeeee));
        button2.addActionListener(this::actionPerformed);

        //---- button1 ----
        button1.setText("1");
        contentPane.add(button1);
        button1.setBackground(new Color(0xB66064));
        button1.setForeground(new Color(0xeeeeee));
        button1.addActionListener(this::actionPerformed);



        setSize(1400, 320);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button21;
    private JButton button20;
    private JButton button19;
    private JButton button18;
    private JButton button17;
    private JButton button16;
    private JButton button15;
    private JButton button14;
    private JButton button13;
    private JButton button12;
    private JButton button11;
    private JButton button10;
    private JButton button9;
    private JButton button8;
    private JButton button7;
    private JButton button6;
    private JButton button5;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    public static int seatNum = 0;
    public static boolean res = false;


    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=1")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 1;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }

        }

        if (e.getSource() == button2){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=2")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 2;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }


        }

        if (e.getSource() == button3){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=3")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 3;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }


        }

        if (e.getSource() == button4){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=4")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 4;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }


        }

        if (e.getSource() == button5){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=5")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 5;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button6){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=6")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 6;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button7){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=7")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 7;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button8){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=8")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 8;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button9){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=9")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 9;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button10){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=10")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 10;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button11){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=11")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 11;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button12){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=12")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 12;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button13){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=13")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 13;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button14){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=14")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 14;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button15){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=15")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 15;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button16){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=16")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 16;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button17){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=17")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                        res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 17;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button18){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=18")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 18;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button19){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=19")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                      res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 19;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button20){
            try{
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(array.indexOf("{")+9,array.indexOf("}"));
                    String[] list = array.split(",");

                    if(list[0].contains(TicketBook.ToT) && list[2].equals(" seatNumber=20")){
                        Reserved reserved = new Reserved();
                        break;
                    }
                    else {
                       res = true;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }

            if(res){
                dispose();
                seatNum = 20;
                ReservedSucc reservedSucc = new ReservedSucc();
                Ticket ticket = new Ticket(TicketBook.ToT,Login.User,seatNum);

                try {
                    FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write("\n" + ticket);
                    writer.close();

                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        if (e.getSource() == button21){
            dispose();
            try {
TicketBook ticketBook = new TicketBook();} catch (IOException ex) {
    throw new RuntimeException(ex);
}
        }
    }
}
