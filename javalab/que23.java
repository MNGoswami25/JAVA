import java.util.Scanner;
class DatabaseExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "root";
    static final String PASS = "1234";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO student (Name, Gender, Address) VALUES (Manoj,M,Majkhali)";
            stmt.executeUpdate(sql);
            System.out.println("New records inserted successfully!");
            String selectSql = "SELECT * FROM student";
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                int i=resultSet.getInt("Id");
                String column1 = resultSet.getString("Name");
                String column2 = resultSet.getString("Gender");
                String column3 = resultSet.getString("Address");

                System.out.println("Record: " + i + ","+ column1 + ", " + column2 + ", " + column3);
            }
            resultSet.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
       
    }
}
}