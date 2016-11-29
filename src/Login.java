import Connn;
import java.sql.*;
public class Login {
	public String id;
	private String pwd;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
	boolean res=false;
	public Login(String n1,String n2){
		id="'"+n1+"'";
		pwd="'"+n2+"'";
	}
	public boolean verify(){
		String sql="Select * from personal_info where ID="+id+" and Password="+pwd+"";
		Connn use = new Connn();
		try{
			con=use.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			if(rs.next())
				res=true;
		}catch(Exception e){
                       // System.out.println("Error in showing");
			System.out.println(e.getMessage());
		}finally{
			use.close(con,stat);
			return res;
		}
	}
	public int getcat(){
		String sql="Select Category from professional_info where ID = "+id+"";
		String result="";
		int t=-1;
		Connn use = new Connn();
		try{
			con=use.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			if(rs.next()){
				result = rs.getString("Category");
			}
			if(result.equals("Employee")){
				t=0;
			}else if(result.equals("Department_Manager")){
				t=1;
			}else if(result.equals("HR Manager")){
				t=2;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			use.close(con,stat);
                        //System.out.println(t);
			return t;
		}
	}
}