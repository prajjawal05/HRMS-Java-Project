//package control;
//Changed
import Connn;
import java.sql.*;
public class RetrieveProject {
	private String sql,id;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
        public String x1,x2,x3,x4,x5,x6;
	public String arg[] = new String[6];
	public RetrieveProject(String n1){
		id="'"+n1+"'";
	}
	public void Select(){
		Connn use = new Connn();
		sql="Select * from project_info where ID = "+id+"";
		try{
			con=use.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			while(rs.next()){
		       arg[0]=rs.getString("Start_Date");
		       arg[1]=rs.getString("Title");
		      // arg[2]=rs.getString("Gender");
		       /*arg[3]=rs.getString("DOB");
		       arg[4]=rs.getString("Address");
		       arg[5]=rs.getString("Password");
                      x1=rs.getString("FName");
		       x2=rs.getString("LName");
		       //arg[2]=rs.getString("Gender");
		       x3=rs.getString("DOB");
		       x4=rs.getString("Address");
		       x5=rs.getString("Password");
                       System.out.println(x1);*/
                       System.out.println("hello");
			}
		}catch(Exception e){
			System.err.println(e);
		}finally{
			use.close(con,stat);
		}
	}
}

//ID, Start_Date, Title