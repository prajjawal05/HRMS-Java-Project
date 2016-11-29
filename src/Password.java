
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
//ackage front;
import javax.swing.*;
import Connn
//mport control.ChPass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Password extends JFrame implements ItemListener,ActionListener  {
	public static String id;
	public JPanel createPage6(String n1)
	{
		id=n1;
		final JPanel jv=new JPanel();
		jv.setLayout(null);
		//setLayout(null);
		//setVisible(true);
		//JPanel jp=new JPanel();
		//add(jp);
		//jp.setLayout(null);
		JLabel j1=new JLabel("Password");
		j1.setBounds(100, 50, 100, 30);
		jv.add(j1);
		JLabel jl=new JLabel("OLD PASSWORD");
		jl.setBounds(50,100,120,30);
		jv.add(jl);
		final JTextField ju=new JTextField();
		ju.setBounds(600, 100, 120, 30);
		ju.setVisible(false);
		final JPasswordField jt=new JPasswordField();
		JCheckBox jc=new JCheckBox();
		jc.setBounds(400, 100, 30, 30);
		JLabel jm=new JLabel("Show Password");
		jm.setBounds(450, 100, 1100, 30);
		jv.add(jm);
		jc.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)
				{
				ju.setText(jt.getText());
				ju.setVisible(true);
				jv.add(ju);
				}
				else
				{
					ju.setVisible(false);
				}
				
			}
			
		});
		jc.add(jt);
		jv.add(jc);
		jt.setBounds(190, 100, 120, 30);
		jv.add(jt);
		JLabel jk=new JLabel("NEW PASSWORD");
		jk.setBounds(50,200,120,30);
	     jv.add(jk);
		final JPasswordField jt1=new JPasswordField();
		jt1.setBounds(190, 200, 120, 30);
		jv.add(jt1);
		final JTextField ju1=new JTextField();
		ju1.setBounds(600, 200, 120, 30);
		ju1.setVisible(false);
		jv.add(ju1);
		//final JPasswordField jt=new JPasswordField();
		JCheckBox jc1=new JCheckBox();
		jc1.setBounds(400, 200, 30, 30);
		JLabel jm1=new JLabel("Show Password");
		jm1.setBounds(450, 200, 110, 30);
		jv.add(jm1);
		jc1.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)
				{
				ju1.setText(jt1.getText());
				ju1.setVisible(true);
				jv.add(ju1);
				}
				else
				{
					ju1.setVisible(false);
				}
				
			}
			
		});
		jv.add(jc1);
		
		JLabel jk1=new JLabel("RE TYPE-PASSWORD");
		jk1.setBounds(50,300,120,30);
		jv.add(jk1);
		final JPasswordField jt2=new JPasswordField();
		jt2.setBounds(190, 300, 120, 30);
		jv.add(jt2);
	
		final JTextField ju2=new JTextField();
		ju2.setBounds(600, 300, 120, 30);
		ju2.setVisible(false);
		jv.add(ju2);
		//final JPasswordField jt=new JPasswordField();
		JCheckBox jc2=new JCheckBox();
		jc2.setBounds(400, 300, 30, 30);
		JLabel jm2=new JLabel("show password");
		jm2.setBounds(450, 300, 110, 30);
		jv.add(jm2);
		JLabel jo=new JLabel("(Password should be beween 5 and 12)");
		jo.setBounds(600,300,300,30);
		jv.add(jo);
		jc2.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)
				{
				ju2.setText(jt2.getText());
				ju2.setVisible(true);
				jv.add(ju2);
				}
				else
				{
					ju2.setVisible(false);
				}
				
			}
					});
		jv.add(jc2);

        JButton jbl=new JButton("SUBMIT");
        jbl.setBounds(100, 400, 100, 30);
		jbl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					String n1,n2,n3;
					n1=jt.getText();
					n2=jt1.getText();
					n3=jt2.getText();
					if(n1.equals("")){
						JOptionPane.showMessageDialog(null, "Enter your old Password");
					}
                                        else
                                        {
                                         Connn n22 = new Connn();
                                         boolean rt2 = n22.verify1("personal_info",n1);
                                         if (!rt2){
                                         
                                            JOptionPane.showMessageDialog(null, "Check your old Password");
                                         }
                                      else{
                                                if(n2.equals("") || n3.equals(""))
                                                {
						JOptionPane.showMessageDialog(null, "Enter your new Password");
                                                }
                                                else{
                                    
                                                if(n2.equals(n3)){
						ChPass n = new ChPass(id,n2);
						boolean rt = n.verify();
						if(rt){
							JOptionPane.showMessageDialog(null, "You have successfully changed the Password");
                                                    }
						else{
							JOptionPane.showMessageDialog(null, "There is some error");
                                                    }
                                                }   
                                            else{

						JOptionPane.showMessageDialog(null, "The passwords do not match");
                                            }        
                                             }
                                         }
                                         }
					
                                        
               
                                        
					/*if(n3.equals("")){

						JOptionPane.showMessageDialog(null, "Please retype your new Password");
					}*/
					
				}
			});
        jv.add(jbl);
		return jv;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}