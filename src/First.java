
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 21, 21));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
//package front;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import control.Login;

public class First extends JFrame {
    JLabel label1, label2, label3;
    JTextField textf1;
    JButton btn1,btn2;
    JPasswordField ps1;

    public First() {
        setTitle("Login Form");
        setSize(2000, 2000);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JLabel background=new JLabel(new ImageIcon("image.jpg"));
	//add(background);
	//background.setLayout(new FlowLayout());

        try {
          setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("image.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        label1 = new JLabel("Login Form :");
        label1.setForeground(Color.blue);
        label1.setFont(new Font("Serif", Font.BOLD, 20));

        label2 = new JLabel("Enter ID:");
        label3 = new JLabel("Enter Password:");
        textf1 = new JTextField();
        ps1 = new JPasswordField();
        btn1 = new JButton("Submit");
        btn2 = new JButton("Cancel");

        label1.setBounds(300, 70, 400, 30);
        label2.setBounds(280, 130, 200, 30);
        label3.setBounds(280, 180, 200, 30);
        textf1.setBounds(500, 130, 200, 30);
        ps1.setBounds(500, 180, 200, 30);
        btn1.setBounds(450, 250, 100, 30);
        btn2.setBounds(570, 250, 100, 30);

        add(label1);
        add(label2);
        add(textf1);
        add(label3);
        add(ps1);
        add(btn1);
        add(btn2);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n1 = textf1.getText();
                String n2 = ps1.getText();
                System.out.println(n1);
                System.out.println(n2);
                if (n1.equals("")) {
                    System.out.println("id");
                    JOptionPane.showMessageDialog(null, "Enter your ID ");
                } else if (n2.equals("")) {
                    System.out.println("pass");
                    JOptionPane.showMessageDialog(null, "Enter your Password ");
                } else {
                    Login emp = new Login(n1, n2);
                    boolean log = emp.verify();
                    if (log) {
                        JOptionPane.showMessageDialog(null, "You are successfully Logged in");
                        System.out.println("Hello Baby\n");
                        int tr = emp.getcat();
                        setVisible(false);
                        System.out.println(tr);
                        if(tr==1)
                        	new Form_HOD(n1);
                        else if(tr==0)
                        	new Form_EMP(n1);
                        else if(tr==2)
                        	new Form_HRM(n1);
                        // setVisible(false);
                    } else
                        JOptionPane.showMessageDialog(null, "Check the credentials again");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textf1.setText("");
                ps1.setText("");
            }
        });
    }
}