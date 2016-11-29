
import Connn;
import java.sql.*;
import java.util.ArrayList;
public class RetrieveAtt {
	private String sql,id;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
	public ArrayList dept = new ArrayList();
	public ArrayList arr = new ArrayList();
	public ArrayList date = new ArrayList();
	public RetrieveAtt(String n1){
		id=n1;
	}
	public void Select(){
		Connn use = new Connn();
		sql="Select * from attendence where ID = "+id+"";
		try{
			con=use.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			while(rs.next()){
		       dept.add(rs.getString("Departure"));
		       arr.add(rs.getString("Arrival"));
		       date.add(rs.getString("DOB").toString());
			}
		}catch(Exception e){
			System.err.println(e);
		}finally{
			use.close(con,stat);
		}
	}
}