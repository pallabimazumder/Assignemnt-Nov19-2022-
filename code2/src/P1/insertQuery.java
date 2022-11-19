package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertQuery {

    public static void main(String args[])
    {
        String id = "1";
        String name = "Pallabi Mazumder";
        String salary = "50000";

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            Statement stmt = con.createStatement();

            // Inserting data in database
            String query = "insert into Employee values('" +id+ "', '" +name+
                    "', '" +salary+ "')";
            int x = stmt.executeUpdate(query);
            if (x > 0)
                System.out.println("Successfully Inserted");
            else
                System.out.println("Insert Failed");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Successfully Inserted");
    }
}
