import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws Exception {
	      delete();
		}
	   public static  void delete() throws Exception{
		   String url = "jdbc:mysql://localhost:3306/Student";
			String userName = "root";
			String Password = "pravinK@09";
			
			int Rollno = 5;
		String query = 	"delete from StudentManagement where Rollno = "+Rollno;
			
	       Connection con = DriverManager.getConnection(url, userName, Password);
	       Statement st = con.createStatement();

	int rows =  st.executeUpdate(query);
	System.out.println("no of rows affected= "+rows);
	 
	       con.close(); 
	}

}
