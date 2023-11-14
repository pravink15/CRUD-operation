import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws Exception {
	      Update();
		}
	   public static  void Update() throws Exception{
		   String url = "jdbc:mysql://localhost:3306/Student";
			String userName = "root";
			String Password = "pravinK@09";
			
	
		String query = 	"Update StudentManagement set Phoneno = 765673487 where Rollno=6";
			
	       Connection con = DriverManager.getConnection(url, userName, Password);
	       Statement st = con.createStatement();

	int rows =  st.executeUpdate(query);
	System.out.println("no of rows affected= "+rows);
	 
	       con.close();

	}

}
