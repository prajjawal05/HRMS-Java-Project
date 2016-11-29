
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prajjawal05
 */
public class Project {
    JPanel panel7;
    public JPanel createPage7()
	{
		panel7 = new JPanel();
		panel7.setLayout( null );
                JLabel j0=new JLabel("---------Update Project Info---------");
                JLabel jl=new JLabel("Employee ID");
                JTextField jt1=new JTextField();
                JLabel jl1=new JLabel("FROM DATE");
                JTextField jt2=new JTextField();
                JLabel jl2=new JLabel("Project Title");
                JTextField jt3=new JTextField();
        
                JButton jk=new JButton("SUBMIT");
                JButton jk1=new JButton("CLEAR");
                JButton jk2 = new JButton("View Current Project");
        jk1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
			}
		});
        
        jk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1, n2, n3;
				n1 = jt1.getText();
				n2 = jt2.getText();
				n3 = jt3.getText();
				if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Employee ID");
				} else if (n2.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the Start-date of the Project");
				} else if (n3.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the Project_Title");
				}  else {
					Insert ut1 = new Insert(n1, n2, n3);
					boolean tr1 = ut1.add2();
					JOptionPane.showMessageDialog(null, "Entry successfully done");
					
				}
			}
		});
        jk2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
                                String n1;
                                n1 = jt1.getText();
                                if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Employee ID");
				}
                                else{
                                    RetrieveProject rp = new RetrieveProject(n1);
                                    rp.Select();
                                    JOptionPane.showMessageDialog(null, "Start Date:\t"+rp.arg[0]+"\n"+"Project Title:\t"+rp.arg[1]);
                                }
			}
		});
        j0.setBounds(200, 50, 650, 30);
        jl.setBounds(200, 150, 100, 30);
        jt1.setBounds(300, 150, 100, 30);
        jl1.setBounds(200, 200, 100, 30);
        jt2.setBounds(300, 200, 100, 30);
        jl2.setBounds(200, 250, 100, 30);
        jt3.setBounds(300, 250, 100, 30);
       
         jk.setBounds(200, 350, 80, 40);
        jk1.setBounds(350, 350, 80, 40);
        jk2.setBounds(600, 200, 150, 40);
        panel7.add(j0);
        panel7.add(jl);
        panel7.add(jt1);
        panel7.add(jl1);
        panel7.add(jt2);
        panel7.add(jl2);
        panel7.add(jt3);
        panel7.add(jk);
        panel7.add(jk1);
        panel7.add(jk2);
	return panel7;
	}
    
}
