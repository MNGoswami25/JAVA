
//javac -cp ".;D:\app_folders\mysql-connector-j-8.0.33\mysql-connector-j-8.0.33.jar" databse.java
//java -cp ".;D:\app_folders\mysql-connector-j-8.0.33\mysql-connector-j-8.0.33.jar" DatabaseExample
import java.sql.*;
import java.util.Scanner;
class DatabaseExample {
    // Database credentials  // for connection
    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "root";
    static final String PASS = "1234";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Step 3: Execute a query to insert a new record
            stmt = conn.createStatement();
            Scanner sc=new Scanner(System.in);
            while(true){
                 System.out.println("Press 1 to insert data else press any other key to exit");
                 int choice=sc.nextInt();
                 if(choice==1){
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name=sc.nextLine().trim();
                    System.out.print("Enter Gender: ");
                    char gender=sc.next().charAt(0);
                    System.out.print("Enter Addreess: ");
                    sc.nextLine();
                    String address=sc.nextLine().trim();
                    String sql = "INSERT INTO student (Name, Gender, Address) VALUES ('" + name + "', '" + gender + "', '" + address + "')";
                    stmt.executeUpdate(sql);
                 }
                 else{
                    break;
                 }
            }
            System.out.println("New records inserted successfully!");

            // Step 4: Execute a query to retrieve all records from the table
            String selectSql = "SELECT * FROM student";
            ResultSet resultSet = stmt.executeQuery(selectSql);

            // Step 5: Display the contents of the table
            while (resultSet.next()) {
                int i=resultSet.getInt("Id");
                String column1 = resultSet.getString("Name");
                String column2 = resultSet.getString("Gender");
                String column3 = resultSet.getString("Address");

                System.out.println("Record: " + i + ","+ column1 + ", " + column2 + ", " + column3);
            }

            // Step 6: Clean-up environment
            resultSet.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
