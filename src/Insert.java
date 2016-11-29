//package control;
import Connn;
import java.sql.*;
public class Insert {
	private String id,fn,ln,sex,DOB,add,pwd,email,contact;
	private boolean c=true;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
	Connn use = new Connn();
	public Insert(String n1,String n2,String n3,String n4,String n5,String n6,String n7){
		this.id="'"+n1+"'";
		this.fn="'"+n2+"'";
		this.ln="'"+n3+"'";
		this.sex="'"+n4+"'";
		this.DOB="'"+n5+"'";
		this.add="'"+n6+"'";
		this.pwd="'"+n7+"'";
	}
        public Insert(String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8 , String n9){
		this.id="'"+n1+"'";
		this.fn="'"+n2+"'";
		this.ln="'"+n3+"'";
		this.sex="'"+n4+"'";
		this.DOB="'"+n5+"'";
		this.add="'"+n6+"'";
		this.pwd="'"+n7+"'";
                this.email = "'"+n8+"'";
                this.contact = "'"+n9+"'";
	}
        public Insert(String n1,String n2,String n3,String n4,String n5,String n6){
		this.id="'"+n1+"'";
		this.fn="'"+n2+"'";
		this.ln="'"+n3+"'";
		this.sex="'"+n4+"'";
		this.DOB="'"+n5+"'";
		this.add="'"+n6+"'";
		//this.pwd="'"+n7+"'";
	}
        public Insert(String n1,String n2,String n3){
		this.id="'"+n1+"'";
		this.fn="'"+n2+"'";
		this.ln="'"+n3+"'";
	}
	public boolean add(){
		if((use.verify("personal_info",id))){
			String sql = "Update personal_info set ID="+id+" , FName = "+fn+" , LName="+ln+" , Gender = "+sex+" , DOB="+DOB+",Address= "+add+",Email="+email+", Contact="+contact+" where ID="+id+"";
			try{
				con=use.getConnection();
				System.out.println("Working");
				stat=con.createStatement();
				System.out.println(sql);
				stat.execute(sql);
				}catch(Exception e){
					System.out.println(e.getMessage());
                                        c=false;
				}finally{
					use.close(con, stat);
                                        return c;
				}
                    
				//return true;
		}
                else{
                    String sql = "Insert into personal_info (ID, FName, LName, Gender, DOB, Address, "
			+ "Password,Email , Contact) values("+id+","+fn+","+ln+","+sex+","+DOB+","+add+","+pwd+","+email+","+contact+")";
			try{
				con=use.getConnection();
				System.out.println("Working");
				stat=con.createStatement();
				System.out.println(sql);
				stat.execute(sql);
				}catch(Exception e){
					System.out.println(e.getMessage());
                                        c=false;
				}finally{
					use.close(con, stat);
                                        return c;
				}
                }
        }
	
        public boolean add1(){
		if((use.verify("leave_info",id))){
			return false;
		}
		else{
			String sql = "Insert into leave_info (ID, StartDate, EndDate, LeaveType, Reason, No_of_leaves) values("+id+","+fn+","+ln+","+sex+","+DOB+","+add+")";
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
        public boolean add2(){
		String sql = "Insert into project_info (ID, Start_Date, Title) values("+id+","+fn+","+ln+")";
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