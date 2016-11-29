//package control;
import java.sql.*;
public class ChPass {
	private String id,pwd;
	private boolean c=true;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
	Connn use = new Connn();
	public ChPass(String n1,String n2){
		id="'"+n1+"'";
		pwd="'"+n2+"'";
	}
	public boolean verify(){
		if(!(use.verify("personal_info",id))){
			return false;
		}
		else{
			String sql = "Update personal_info Set Password = "+pwd+" where ID = "+id+"";
			try{
				con=use.getConnection();
				System.out.println("Working");
				stat=con.createStatement();
				System.out.println(sql);
				stat.execute(sql);
				}catch(Exception e){
					System.out.println(e.getMessage());
				}finally{
					use.close(con, stat);
				}
				return true;
		}
	}
}
