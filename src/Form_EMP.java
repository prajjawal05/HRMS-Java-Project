
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
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.bind.ValidationEvent;
class Form_EMP extends JFrame implements  ActionListener {
    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, i11, kk;
    JTextField tf1, tf2, tf5, tf6, tf7, tf8, tf9, tf10,tf11,tf12;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    private static String id;
    public Form_EMP(String n1) {
    	id=n1;
        setTitle("EMPLOYEE PANE");
        setSize(2000, 2000);
        setBackground(Color.gray);
        setVisible(true);
        JPanel topPanel = new JPanel();
        kk = new JLabel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        
        // Create the tab pages
        //Professional per = new Professional();
        //panel1 = per.createPage1();
       // Update up = new Update();
        //panel2 = up.createPage2();
        Leave jl = new Leave();
        panel3 = jl.createPage3();
        View vw = new View();
        panel4 = vw.createPage4();
        //Registration rg = new Registration();
        //ssspanel5 = rg.createPage5();
        Password gt = new Password();
        panel6 = gt.createPage6(id);
        // Create a tabbed pane
        tabbedPane = new JTabbedPane();
        //tabbedPane.addTab("Add Professional Info", panel1);
        //tabbedPane.addTab("Update info", panel2);
        tabbedPane.addTab("Leave info", panel3);
        tabbedPane.addTab("View Employee", panel4);
     //   tabbedPane.addTab("Update Personal Info", panel5);
        tabbedPane.addTab("Change Password", panel6);
        topPanel.add(tabbedPane, BorderLayout.CENTER);
    }
    
    // Main method to get things started
    public static void main(String args[]) {
        // Create an instance of the test application
        Form_EMP mainFrame = new Form_EMP(id);
        mainFrame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

    
    
   
   

    }