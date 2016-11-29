
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
// To add new Employee by manager
//package front;

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
// To add new Employee by manager
//package front;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;

//import control.InsertPro;
public class Professional extends JFrame implements ActionListener,FocusListener {
	JPanel panel1;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    public JPanel createPage1()
    {
    	panel1 = new JPanel();
		panel1.setLayout( null );
	//	JImageIcon kk=new JImageIcon("employee.png");
	JLabel label1 = new JLabel( "ID:" );
	label1.setBounds( 50, 15, 150, 30 );
	panel1.add( label1 );

	JTextField field = new JTextField();
	field.setBounds( 205, 15, 150, 30 );
	panel1.add( field );

	JLabel label2 = new JLabel( "Start Time:" );
	label2.setBounds( 50, 55, 150, 30 );
	panel1.add( label2 );

	final JTextField fieldPass = new JTextField("HH");
	fieldPass.setBounds( 205, 55, 40, 30 );
	panel1.add( fieldPass );
	fieldPass.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPass)
		{
			fieldPass.setText("");
		}
	}
	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPass)
		{
			fieldPass.setText(fieldPass.getText());
		}
	}
	});

	final JTextField fieldPass1 = new JTextField("MM");
	fieldPass1.setBounds( 250, 55, 40, 30 );
	panel1.add( fieldPass1 );
	fieldPass1.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPass1)
		{
			fieldPass1.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPass1)
		{
			fieldPass1.setText(fieldPass1.getText());
		}
	}
	});

	final JTextField fieldPass2 = new JTextField("SS");
	fieldPass2.setBounds( 295, 55, 40, 30 );
	panel1.add( fieldPass2 );
	fieldPass2.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPass2)
		{
			fieldPass2.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPass2)
		{

			fieldPass2.setText(fieldPass2.getText());

		}

	}
	});
	JLabel jl=new JLabel("Finish Time");
	jl.setBounds(50,95,150,30);
	panel1.add(jl);


	final JTextField fieldPas = new JTextField("HH");
	fieldPas.setBounds( 205, 95, 40, 30 );
	panel1.add( fieldPas );
	fieldPas.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPas)
		{
			fieldPas.setText("");
		}

	}
	@Override
	public void focusLost(FocusEvent e) {
		/*if(e.getSource()==fieldPas)
		{

			fieldPas.setText(fieldPas.getText());

		}*/

	}
	});

	final JTextField fieldPas1 = new JTextField("MM");
	fieldPas1.setBounds( 250, 95, 40, 30 );
	panel1.add( fieldPas1 );
	fieldPas1.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPas1)
		{
			fieldPas1.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPas1)
		{
			fieldPas1.setText(fieldPas1.getText());
		}
	}
	});

	final JTextField fieldPas2 = new JTextField("SS");
	fieldPas2.setBounds( 295, 95, 40, 30 );
	panel1.add( fieldPas2 );
	fieldPas2.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPas2)
		{
			fieldPas2.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPas2)
		{

			fieldPas2.setText(fieldPas2.getText());

		}

	}
	});

	JLabel jl1=new JLabel("Past Experience");
	jl1.setBounds(50,135,150,30);
	panel1.add(jl1);

	JTextField fieldcount=new JTextField();
	fieldcount.setBounds(205, 135, 150, 30);
	panel1.add(fieldcount);

	JLabel j1=new JLabel("Department");
	j1.setBounds(50, 175,150, 30);
	panel1.add(j1);
	JComboBox<String> jc=new JComboBox<String>();
	jc.addItem("Finance");
	jc.addItem("Research");
	jc.addItem("Development");
	jc.addItem("Human Resource");
	jc.addItem("Management");
	jc.setBounds(205, 175, 150, 30);
	panel1.add(jc);
	JLabel jg=new JLabel("Basic Salary");
	jg.setBounds(50, 215, 150, 30);
	panel1.add(jg);
	JTextField jn=new JTextField();
	jn.setBounds(205, 215, 150, 30);
	panel1.add(jn);
	JLabel ss=new JLabel("QUALIFICATIONS");
	ss.setBounds(50,255,150,30);
	JTextField jn5=new JTextField();
	jn5.setBounds(205, 255, 150, 30);
	panel1.add(ss);
	panel1.add(jn5);
	final JLabel jg1=new JLabel("PL");
	jg1.setBounds(50, 285, 150, 30);

	panel1.add(jg1);
	final JTextField jn1=new JTextField("0");
	jn1.setBounds(205, 285, 150, 30);
	panel1.add(jn1);

	JLabel jg2=new JLabel("CL");
	jg2.setBounds(50, 315, 150, 30);
	panel1.add(jg2);
	final JTextField jn2=new JTextField("0");
	jn2.setBounds(205, 315, 150, 30);
	panel1.add(jn2);
	JLabel jg3=new JLabel("SPL");
	jg3.setBounds(50, 355, 150, 30);
	panel1.add(jg3);
	final JTextField jn3=new JTextField("0");
	jn3.setBounds(205, 355, 150, 30);
	panel1.add(jn3);
	JLabel jg4=new JLabel("ALLOWANCES");
	jg4.setBounds(50, 385, 150, 30);
	panel1.add(jg4);
	final JTextField jn4=new JTextField("0");
	jn4.setBounds(205, 385, 150, 30);
	panel1.add(jn4);
	JLabel jk=new JLabel("CATEGORY");
	jk.setBounds(50,425,80,30);
    panel1.add(jk);
	JRadioButton jb=new JRadioButton("Employee");
	JRadioButton jb1=new JRadioButton("Department_Manager");
	JRadioButton jb2=new JRadioButton("HR Manager");
	ButtonGroup bg=new ButtonGroup();
	bg.add(jb);
	bg.add(jb1);
	bg.add(jb2);
	jb.setBounds(150,425,80,30);
	jb1.setBounds(250,425,80,30);
	jb2.setBounds(340,425,120,30);
	panel1.add(jb);
	panel1.add(jb1);
	panel1.add(jb2);


	JButton btn=new JButton("LOGOUT");
	btn.setBounds(1050, 50, 100, 30);
	panel1.add(btn);
	JButton jbt=new JButton("SUBMIT");
	JButton jbt1=new JButton("CLEAR");
	jbt.setBounds(50, 465,90, 40);
	jbt1.setBounds(160, 465,90, 40);
	jbt.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			String n1,n2,n15="",n16="";
			int n3,n4,n5,n6,n7,n8,n9,n10,n11,n13;
			double n12,n14;
			n1=field.getText();
			n2=jc.getSelectedItem().toString();
			if(jb.isSelected()){
				n15="Employee";
			}else if(jb1.isSelected()){
				n15="Department_Manager";
			}else if(jb2.isSelected()){
				n15="HR Manager";
			}
			n16=jn5.getText();
			n3=Integer.parseInt(fieldPass.getText());
			n4=Integer.parseInt(fieldPass1.getText());
			n5=Integer.parseInt(fieldPass2.getText());
			n6=Integer.parseInt(fieldPas.getText());
			n7=Integer.parseInt(fieldPas1.getText());
			n8=Integer.parseInt(fieldPas2.getText());
			n9=Integer.parseInt(jn1.getText());
			n10=Integer.parseInt(jn2.getText());
			n13=Integer.parseInt(jn3.getText());
			n11=Integer.parseInt(fieldcount.getText());
			n12=Double.parseDouble(jn.getText());
			n14=Double.parseDouble(jn4.getText());
			if(n1.equals("")){
				JOptionPane.showMessageDialog(null,"Enter your ID");
			}else if(n2.equals("")){
				JOptionPane.showMessageDialog(null,"Specify your Department");
			}else if(n16.equals("")){
				JOptionPane.showMessageDialog(null,"Specify your Qualifications");
			}else if(n3<0 || n3>23){
				JOptionPane.showMessageDialog(null,"Enter the shift start time hour");
			}else if(n4<0 || n4>59){
				JOptionPane.showMessageDialog(null,"Enter the shift start time minute");
			}else if(n5<0 || n5>59){
				JOptionPane.showMessageDialog(null,"Enter the shift start time second");
			}else if(n6<0 || n6>23){
				JOptionPane.showMessageDialog(null,"Enter the shift end time hour");
			}else if(n7<0 || n7>59){
				JOptionPane.showMessageDialog(null,"Enter the shift end time minute");
			}else if(n8<0 || n8>59){
				JOptionPane.showMessageDialog(null,"Enter the shift end time second");
			}else if(n9<0){
				JOptionPane.showMessageDialog(null,"PL not valid");
			}else if(n10<0){
				JOptionPane.showMessageDialog(null,"CL not valid");
			}else if(n13<0){
				JOptionPane.showMessageDialog(null,"SPL not valid");
			}else if(n14<0){
				JOptionPane.showMessageDialog(null,"Allowances not valid");
			}else if(n11<0){
				JOptionPane.showMessageDialog(null,"Experience not valid");
			}else if(n12<0){
				JOptionPane.showMessageDialog(null,"Salary not valid");
			}else if(n15.equals("")){
				JOptionPane.showMessageDialog(null,"Category not valid");
			}else{
				String stime = n3+":"+n4+":"+n5;
				String ltime = n6+":"+n7+":"+n8;
				InsertPro info = new InsertPro(n1,n2,stime,ltime,n15,n16,n11,n12,n9,n10,n13,n14);
				boolean t = info.add();
				if(t){
					JOptionPane.showMessageDialog(null, "Information successfully added/Updated");
				}else{
					JOptionPane.showMessageDialog(null, "Information successfully added/Updated");
				}
			}
		}
	});
	jbt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			field.setText("");
			fieldcount.setText("");
			jc.setSelectedIndex(0);
			jn.setText("");
			jn1.setText("");
			jn2.setText("");
			jn3.setText("");
			jn4.setText("");
			bg.clearSelection();
			jn5.setText("");
			fieldPass.setText("HH");
			fieldPas.setText("HH");
			fieldPass1.setText("MM");
			fieldPas1.setText("MM");
			fieldPass2.setText("SS");
			fieldPas2.setText("SS");
			//fieldPas1.addFocusListener(this);
		}
	});
	btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			setVisible(false);
		}
	});

        btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null, "You're successfully logged out");
                            System.exit(0);



                        }
                });
	panel1.add(jbt);
	panel1.add(jbt1);
	/*ImageIcon kk=new ImageIcon("lnm.png");
	kk.setDescription("LNMIIT");

	JLabel jj=new JLabel(kk);
	//jj.setBorder(null);
	jj.setBounds(500, 50, 700, 600);
	panel1.add(jj);*/
	return panel1;



}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}
}
