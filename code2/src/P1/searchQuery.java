package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class searchQuery {

    public static void main(String args[])
    {
        String id = "5";

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@LAPTOP-HR3RC00U:1521:xe", "system", "oracle");
            Statement stmt = con.createStatement();

            // SELECT query
            String q1 = "select * from Employee WHERE id = '" + id;
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next())
            {
                System.out.println("empID : " + rs.getString(1));
                System.out.println("empName :" + rs.getString(2));
                System.out.println("empSalary :" + rs.getString(3));
            }
            else
            {
                System.out.println("No such employee id is already registered");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
