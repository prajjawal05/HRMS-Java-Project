
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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Leave {

	JPanel panel3;
	
	public JPanel createPage3()
	{
		panel3 = new JPanel();
		panel3.setLayout( null );
        JLabel jl=new JLabel("Employee ID");
        JTextField jt1=new JTextField();
        JLabel jl1=new JLabel("FROM DATE");
        JTextField jt2=new JTextField();
        JLabel jl2=new JLabel("TO DATE");
        JTextField jt3=new JTextField();
        JLabel jl4=new JLabel("TOTAL LEAVES");
        JTextField jt5=new JTextField();
        JLabel jl3=new JLabel("REASON");
        JTextField jt4=new JTextField();
        JLabel jl5=new JLabel("TYPE OF LEAVES");
        JRadioButton jb=new JRadioButton("PL");
       // panel3.add(jb);
        JRadioButton jb1=new JRadioButton("CL");
       // panel3.add(jb1);
        //panel3.add(jb2);
        JRadioButton jb2=new JRadioButton("Special");
        //panel3.add(jb3);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jb);
        bg.add(jb1);
        bg.add(jb2);
        JButton jk=new JButton("SUBMIT");
        JButton jk1=new JButton("CLEAR");
        
        jk1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				jt5.setText("");
				bg.clearSelection();
			}
		});
        
        jk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1, n2, n3, n4 = "", n5, n6;
				n1 = jt1.getText();
				n2 = jt2.getText();
				n3 = jt3.getText();
				if (jb.isSelected())
					n4 = "PL";
				else if (jb1.isSelected())
					n4 = "CL";
                                else if(jb2.isSelected())
                                    n4 = "Special";
				n5 = jt4.getText();
				n6 = jt5.getText();
				//n7 = .getText();
				if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Employee ID");
				} else if (n2.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the Start-date of your leave");
				} else if (n3.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the End-date of your leave");
				} else if (n5.equals("")) {
					JOptionPane.showMessageDialog(null, "Explain the reason of your leave");
				} else if (n6.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the total no. of leaves");
				} else if (n4.equals("")) {
					JOptionPane.showMessageDialog(null, "Select the type of leaves");
				} else {
					Insert ut1 = new Insert(n1, n2, n3, n4, n5, n6);
					boolean tr1 = ut1.add1();
					if (tr1) {
						JOptionPane.showMessageDialog(null, "Entry successfully done");
					} else {
						JOptionPane.showMessageDialog(null, "ID already used");
					}
				}
			}
		});
        
        jl.setBounds(200, 50, 100, 30);
        jt1.setBounds(300, 50, 100, 30);
        jl1.setBounds(200, 100, 100, 30);
        jt2.setBounds(300, 100, 100, 30);
        jl2.setBounds(450, 100, 100, 30);
        jt3.setBounds(550, 100, 100, 30);
        jl4.setBounds(200, 150, 100, 30);
        jt5.setBounds(300, 150, 100, 30);
        jl3.setBounds(200, 200, 100, 30);
        jt4.setBounds(300, 200, 400, 50);
        jl5.setBounds(200, 270, 100, 30);
        jb.setBounds(200, 300,150, 40);
        jb1.setBounds(350, 300,150, 40);
        jb2.setBounds(500, 300,150, 40);
        jk.setBounds(200, 350, 80, 40);
        jk1.setBounds(350, 350, 80, 40);
        panel3.add(jl);
        panel3.add(jt1);
        panel3.add(jl1);
        panel3.add(jt2);
        panel3.add(jl2);
        panel3.add(jt3);
        panel3.add(jl4);
        panel3.add(jt5);
       panel3.add(jl3);
        panel3.add(jt4);
       panel3.add(jl5);
      panel3.add(jb);
      panel3.add(jb1);
      panel3.add(jb2);
      panel3.add(jk);
      panel3.add(jk1);
	return panel3;
	}
	
}
