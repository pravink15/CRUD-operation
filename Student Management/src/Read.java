import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) throws Exception {
	      readRecords();
		}
	   public static  void readRecords() throws Exception{
		   String url = "jdbc:mysql://localhost:3306/Student";
			String userName = "root";
			String Password = "pravinK@09";
			String query = "select * from StudentManagement";
	       Connection con = DriverManager.getConnection(url, userName, Password);
	       Statement st = con.createStatement();
	      ResultSet rs=  st.executeQuery(query);
	       while (rs.next()) {
	       System.out.println("Name  " + rs.getString(1));
	       System.out.println("Roll No  " + rs.getInt(2));
	       System.out.println("Grade " + rs.getString(3));
	       System.out.println("Phone No " + rs.getInt(4));

	       }
	       con.close();

	}

}
