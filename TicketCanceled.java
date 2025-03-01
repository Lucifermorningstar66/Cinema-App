import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 08 00:04:46 IRST 2023
 */



/**
 * @author global village
 */
public class TicketCanceled extends JFrame implements ActionListener {
    public TicketCanceled() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("CinemaTicket");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\proX\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFD00E0E,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Ticket Canceled Successfully");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 6f));
        label1.setForeground(new Color(0xeeeeee));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(65, 20), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("OK");
        button1.setBackground(new Color(0xE14D51));
        button1.setForeground(new Color(0xeeeeee));
        contentPane.add(button1);
        button1.setBounds(150, 70, 110, 40);
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
        setSize(400, 170);
        setLocationRelativeTo(getOwner());
        setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;@Override



    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            MainPage mainPage = new MainPage();

        }
    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
