import java.sql.*;
public class Connn {
	String driverName = "org.apache.derby.jdbc.ClientDriver";
	String url = "jdbc:derby://localhost:1527/root";
	String dbName = "ROOT";
	String userName = "root";
	String password = "tushar";
	Connection con = null;
	public Connection getConnection(){
		try{
			Class.forName(driverName);
			//con=DriverManager.getConnection(url+dbName, userName, password);
			con = DriverManager.getConnection(url,userName,password);
                        System.out.println("Database connection established");
			return con;
		}catch(Exception e){
                        System.out.println("Error in creating connection");
			System.out.println(e.getMessage());
			return null;
		}
	}
	public boolean verify(String tab,String id){
		Statement stat=null;
		ResultSet rs;
		boolean res=false;
		String sql="Select * from "+tab+" where ID="+id+"";
		try{
			con=this.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			if(rs.next()){
				res= true;
                                System.out.println("In TRue");}
                        else{
				res=false;
                                System.out.println("In False");
                        }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			this.close(con,stat);
			return res;
		}
	}
       public boolean verify1(String tab,String pass){
		Statement stat=null;
		ResultSet rs;
		boolean res=false;
		String sql="Select * from "+tab+" where Password='"+pass+"'";
		try{
			con=this.getConnection();
			System.out.println("Working");
			stat=con.createStatement();
			System.out.println(sql);
			rs=stat.executeQuery(sql);
			if(rs.next()){
				res= true;
                                System.out.println("In TRue1");}
                        else{
				res=false;
                                System.out.println("In False");
                        }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			this.close(con,stat);
			return res;
		}
	}
	public void close(Connection n,Statement st){
		if(n!=null){
			try{
				n.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		if(st!=null){
			try{
				st.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}