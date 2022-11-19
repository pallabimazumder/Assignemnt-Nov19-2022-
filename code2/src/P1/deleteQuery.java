package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteQuery {

    public static void main(String args[])
    {
        String id = "2";

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@LAPTOP-HR3RC00U:1521:xe", "system", "oracle");
            Statement stmt = con.createStatement();

            // Deleting from database
            String query = "DELETE from userid WHERE id = '" + id;

            int x = stmt.executeUpdate(query);

            if (x > 0)
                System.out.println("One User Successfully Deleted");
            else
                System.out.println("ERROR OCCURRED :(");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
