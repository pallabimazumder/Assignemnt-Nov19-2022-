package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateQuery {

    public static void main(String args[])
    {
        String id = "1";
        String newSalary = "100000";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@LAPTOP-HR3RC00U:1521:xe", "system", "oracle");
            Statement stmt = con.createStatement();

            // Updating database
            String query = "UPDATE Employee set salary = '" + newSalary +
                    "' WHERE id = '" +id;
            int x = stmt.executeUpdate(query);

            if (x > 0)
                System.out.println("Salary Successfully Updated");
            else
                System.out.println("ERROR OCCURRED :(");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Salary Successfully Updated");
    }
}
