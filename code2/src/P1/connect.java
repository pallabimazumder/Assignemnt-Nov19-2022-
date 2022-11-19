package P1;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {

    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@LAPTOP-HR3RC00U:1521:xe", "system", "oracle");

            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //System.out.println("Connected");
    }

}

