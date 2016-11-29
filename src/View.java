//Changed
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
    }// </editor-fold>                        
    // Variables declaration - do not modify                     
    // End of variables declaration                   
//package front;
//Changed
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
import Retrieve;
import Retrieveprof;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
public class View  extends JPanel implements ActionListener{
	JPanel panel4,pan;



	public JPanel createPage4()
	{
		/* Personal up=new Personal();
		 pan=new JPanel();
		 pan=up.createPage1();*/

		panel4 = new JPanel();
		panel4.setLayout( null );
		JLabel jn=new JLabel("ENTER EMPLOYEE ID");
		jn.setBounds(400, 100, 200, 30);
		panel4.add(jn);
		JTextField jm=new JTextField();
		jm.setBounds(540, 100, 100, 30);
		panel4.add(jm);
		final JButton jk=new JButton("View Personal");
		jk.setBounds(400, 180, 150, 30);
		panel4.add(jk);
		JButton jk1=new JButton("View Professional");
		jk1.setBounds(550, 180, 150, 30);
		panel4.add(jk1);
                JButton jk2=new JButton("View Leave Info");
		jk2.setBounds(700, 180, 150, 30);
		panel4.add(jk2);
                JButton jk3=new JButton("View Project Info");
		jk3.setBounds(850, 180, 150, 30);
		panel4.add(jk3);
		panel4.setVisible(true);
		jk.addActionListener(new ActionListener()
		{
					 public void actionPerformed(ActionEvent e)
					 {
						// Reg reg=new Reg();
                                             Connn use = new Connn();
                                            String n1;
                                            n1 = jm.getText();
                                            String id="'"+n1+"'";
                                            if (n1.equals("")) {
                                            JOptionPane.showMessageDialog(null, "Enter Employee ID");
                                             }
                                            else if(use.verify("personal_info", id)){
						 Retrieve r = new Retrieve(jm.getText());
                                                 r.Select();
                                                 String x = r.x1;
                                                 System.out.println(x);
                                                 JOptionPane.showMessageDialog(null, "First Name:\t"+r.x1+"\n"+"Second Name:\t"+r.x2+"\n"+"DOB:\t"+r.x3+"\n"+"Address:\t"+r.x4+"\n"+"Gender:\t"+r.arg[2]+"\n"+"Email:\t"+r.arg[6]+"\n"+"Contact:\t"+r.arg[7]+"\n");
						 panel4.setVisible(false);
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "User ID invalid");
                                            }
					 }

		});

		jk1.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				// Pro reg1=new Pro();
                                Connn use = new Connn();
                                String n1;
                                n1 = jm.getText();
                                String id="'"+n1+"'";
                                if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Employee ID");
				}

                                 else if(use.verify("professional_info", id)){
				 Retrieveprof r1 = new Retrieveprof(jm.getText());
                                 r1.Select();
                                 JOptionPane.showMessageDialog(null,"Dept:\t"+r1.arg[0]+"\n"+"Shift Start Time:\t"+r1.arg[1]+"\n"+"Shift Finish Time:\t"+r1.arg[2]+"\n"+"Category:\t"+r1.arg[3]+"\n"+"Qualifications:\t"+r1.arg[4]+"\n"+"Experience:\t"+r1.arg[5]+"\n"+"Salary:\t"+r1.arg[6]+"\n"+"PLt:\t"+r1.arg[7]+"\n"+"CL:\t"+r1.arg[8]+"\n"+"SPL:\t"+r1.arg[9]+"\n"+"Allowances:\t"+r1.arg[10]+"\n");
				 panel4.setVisible(false);
                                }
                                 else{
                                     JOptionPane.showMessageDialog(null, "User ID invalid");
                                 }
			 }

                });

                jk2.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				// Pro reg1=new Pro();
                                 Connn use = new Connn();
                                String n1;
                                n1 = jm.getText();
                                String id="'"+n1+"'";
                                if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Employee ID");
				}
                                else if(use.verify("leave_info", id)){
				 RetrieveLeave r1 = new RetrieveLeave(jm.getText());
                                 r1.Select();
                                 JOptionPane.showMessageDialog(null,"Start Date:\t"+r1.arg[0]+"\n"+"End Date:\t"+r1.arg[1]+"\n"+"Leave Type:\t"+r1.arg[2]+"\n"+"Reason:\t"+r1.arg[3]+"\n"+"No_of_leaves:\t"+r1.arg[4]);
                                }
                                else{
                                     JOptionPane.showMessageDialog(null, "Leave Info not present");
                                 }
			 }

                });
                jk3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
                                String n1;
                                Connn use = new Connn();
                                n1 = jm.getText();
                                String id="'"+n1+"'";
                                if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Employee ID");
				}
                                else if(use.verify("leave_info", id)){
                                    RetrieveProject rp = new RetrieveProject(n1);
                                    rp.Select();
                                    JOptionPane.showMessageDialog(null, "Start Date:\t"+rp.arg[0]+"\n"+"Project Title:\t"+rp.arg[1]);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Project not available for ID");
                                }
			}

                });

		return panel4;

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

