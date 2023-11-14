import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) throws Exception{
		   String url = "jdbc:mysql://localhost:3306/Student";
			String userName = "root";
			String Password = "pravinK@09";
			
			String name = "Santhosh";
			int Rollno = 6;
			String  Grade = "A";
			int Phoneno = 987689456;
			
			
			String query = "insert into StudentManagement values (?,?,?,?);";
	       Connection con = DriverManager.getConnection(url, userName, Password);
	 PreparedStatement pst = con.prepareStatement(query);
	 pst.setString(1,name);
	 pst.setInt(2, Rollno);
	 pst.setString(3, Grade);
	 pst.setInt(4, Phoneno);
	int rows =  pst.executeUpdate();
	 
	       con.close(); 

	}

}
