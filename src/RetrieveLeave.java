//package control;
//Changed
import Connn;
import java.sql.*;
public class RetrieveLeave {
	private String sql,id;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
        public String x1,x2,x3,x4,x5,x6;
	public String arg[] = new String[6];
	public RetrieveLeave(String n1){
		id="'"+n1+"'";
	}
	public void Select(){
		Connn use = new Connn();
		sql="Select * from leave_info where ID = "+id+"";
		try{
			con=use.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			while(rs.next()){
		       arg[0]=rs.getString("StartDate");
		       arg[1]=rs.getString("EndDate");
		       //arg[2]=rs.getString("Gender");
		       arg[2]=rs.getString("LeaveType");
		       arg[3]=rs.getString("Reason");
		       arg[4]=rs.getString("No_of_leaves");
                      /*x1=rs.getString("FName");
		       x2=rs.getString("LName");
		       //arg[2]=rs.getString("Gender");
		       x3=rs.getString("DOB");
		       x4=rs.getString("Address");
		       x5=rs.getString("Password");
                       System.out.println(x1);*/
			}
		}catch(Exception e){
			System.err.println(e);
		}finally{
			use.close(con,stat);
		}
	}
}

//StartDate, EndDate, LeaveType, Reason, No_of_leaves