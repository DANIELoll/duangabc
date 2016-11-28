//Interface
import java.sql.*;
import java.util.*;
public class Interface{
	public static void main(String[] args)
		throws IOException, SQLException{
			//Load the JDBC Driver for Oracle DBMS
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception x){
			System.err.println("Unable to load the driver class!");
		}
		//establish a connection 
		Connection conn = DriverManager.getConnection("jdbc:mysql://projgw.cse.cuhk.edu.hk:2712/username?autoReconnect=true&useSSL=false", "db94", "26b04004");
		//create a statement object
		//Statement stmt = conn.createStatement();
		//execute a statement using the object
		//stmt.executeUpdate("CREATE TABLE Student" +"(UserID CARCHAR(10)," + "Password CARCHAR(8))");
		//ResultSet rs = stmt.executeQuery("SELECT * FROM temp");
		System.out.println("Welcome to sales system!");
		System.out.println();
		choice();
	}
	public static void choice()
		throws IOException, SQLException{
			while(true){
				System.out.println("-----Main menu-----");
				System.out.println("What kinds of operation would you like to perform?");
				System.out.println("1. Operations for administrator\n" + "2. Operations for salesperson\n"
					+ "3. Operations for manager\n" + "4. Exit this program");
				System.out.println("Enter Your Choice: ");
				Scanner input = new Scanner(System.in);
				switch(input){
					case 1:
						administrator();
						break;
					case 2:
						salesperson();
						break;
					case 3:
						manager();
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Invalid Operation, please select again");
				}
			}
		}
}
