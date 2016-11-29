
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.xml.bind.ValidationEvent;

class Form_HRM extends JFrame implements KeyListener, ActionListener {
    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, i11, kk;
    JTextField tf1, tf2, tf5, tf6, tf7, tf8, tf9, tf10;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    private static String id;
    public Form_HRM(String n1) {
    	id=n1;
        setTitle("HRM PANE");
        setSize(2000, 2000);
        setBackground(Color.black);
        setVisible(true);
        JPanel topPanel = new JPanel();
        kk = new JLabel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);

        // Create the tab pages
        Professional per = new Professional();
        panel1 = per.createPage1();
       // Update up = new Update();
        //panel2 = up.createPage2();
        //Leave jl = new Leave();
        //panel3 = jl.createPage3();
        View vw = new View();
        panel4 = vw.createPage4();
        Registration rg = new Registration();
        panel5 = rg.createPage5();
        Password gt = new Password();
        panel6 = gt.createPage6(id);
        Project pj = new Project();
        panel7 = pj.createPage7();
        // Create a tabbed pane
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Update/Add Professional Info", panel1);
        //tabbedPane.addTab("Update info", panel2);
        //tabbedPane.addTab("Leave info", panel3);
        tabbedPane.addTab("View Employee", panel4);
        tabbedPane.addTab("Add/Update Employee/Personal Info", panel5);
        tabbedPane.addTab("Change Password", panel6);
        tabbedPane.addTab("Projects", panel7);
        topPanel.add(tabbedPane, BorderLayout.CENTER);
    }
    
    // Main method to get things started
    public static void main(String args[]) {
        // Create an instance of the test application
        Form_HRM mainFrame = new Form_HRM(id);
        mainFrame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String txt = tf2.getText();
        if (txt == "kk") {
            int tt = JOptionPane.showConfirmDialog(tf2, "please enter some values", "hello", JOptionPane.NO_OPTION);
            if (tt == JOptionPane.NO_OPTION) {
                tf2.setText("ok");
                // panel2.add(tf2);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String txt = tf2.getText();
        if (txt == "kk") {
            int tt = JOptionPane.showConfirmDialog(tf2, "please enter some values", "hello", JOptionPane.NO_OPTION);
            if (tt == JOptionPane.NO_OPTION) {
                tf2.setText("ok");
                // panel2.add(tf2);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Submit") {
            int oo = JOptionPane.showConfirmDialog(p1, "empty fill it", "text", JOptionPane.YES_NO_OPTION);
            if (oo == JOptionPane.NO_OPTION) {
                if (tf2.getText() == "hjk") {
                    kk.setText("please fille me");
                    kk.setBackground(Color.red);

                } else {
                    tf7.setText("thank you");
                }

            }
        }

    }
}