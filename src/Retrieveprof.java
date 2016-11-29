//package control;
import Connn;
import java.sql.*;
public class Retrieveprof {
	private String sql,id;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
	public String arg[] = new String[11];
	public Retrieveprof(String n1){
		id="'"+n1+"'";
	}
	public void Select(){
		Connn use = new Connn();
		sql="Select * from professional_info where ID = "+id+"";
		try{
			con=use.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			while(rs.next()){
		       arg[0]=rs.getString("Dept");
		       arg[1]=rs.getString("Shift_Start_Time");
		       arg[2]=rs.getString("Shift_Finish_Time");
		       arg[3]=rs.getString("Category");
		       arg[4]=rs.getString("Qualifications");
		       arg[5]=Integer.toString(rs.getInt("Experience"));
		       arg[6]=Double.toString(rs.getDouble("Salary"));
		       arg[7]=Integer.toString(rs.getInt("PL"));
		       arg[8]=Integer.toString(rs.getInt("CL"));
		       arg[9]=Integer.toString(rs.getInt("SPL"));
		       arg[10]=Double.toString(rs.getDouble("Allowances"));
                       
			}
		}catch(Exception e){
			System.err.println(e);
		}finally{
			use.close(con,stat);
		}
	}
}