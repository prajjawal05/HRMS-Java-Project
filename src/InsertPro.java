//package control;
import Connn;
import java.sql.*;
public class InsertPro {
	private int exp,PL,CL,SPL;
	private double sal,all;
	private String id,dept,category,qualify,stime,ftime;
	private boolean c=true;
	private ResultSet rs;
	private Statement stat;
	private Connection con;
	public InsertPro(String n1,String n2,String n3,String n4,String n5,String n6,int n7,
			double n8,int n9,int n10,int n11,double n12){
		this.id="'"+n1+"'";
		this.dept="'"+n2+"'";
		this.category="'"+n5+"'";
		this.qualify="'"+n6+"'";
		this.stime="'"+n3+"'";
		this.ftime="'"+n4+"'";
		this.exp=n7;
		this.sal=n8;
		this.PL=n9;
		this.CL=n10;
		this.SPL=n11;
		this.all=n12;
	}
	public boolean add(){
		Connn use = new Connn();
		if(use.verify("professional_info", id)){
                                String sql = "Update professional_info set ID="+id+",Dept="+dept+","
                                        + "Shift_Start_Time="+stime+",Shift_Finish_Time="+ftime+","
                                        + "Category="+category+",Qualifications="+qualify+",Experience="+exp+","
                                        + "Salary="+sal+",Pl="+PL+",CL="+CL+",SPL="+SPL+",Allowances="+all+" where ID= "+id+"";

                                try{
				con=use.getConnection();
				System.out.println("Working");
				stat=con.createStatement();
				System.out.println(sql);
				stat.executeUpdate(sql);
				}catch(Exception e){
					System.out.println(e.getMessage());
					c=false;
				}finally{
					use.close(con, stat);
					return c;
				}

		}
		else{
			String sql = "Insert into professional_info values("+id+","+dept+","+stime+","+ftime
					+","+category+","+qualify+","+exp+","+sal+","+PL+","+CL+","+SPL+","+all+")";
			try{
				con=use.getConnection();
				System.out.println("Working");
				stat=con.createStatement();
				System.out.println(sql);
				stat.executeUpdate(sql);
				}catch(Exception e){
					System.out.println(e.getMessage());
					c=false;
				}finally{
					use.close(con, stat);
					return c;
				}
		}
	}
}
