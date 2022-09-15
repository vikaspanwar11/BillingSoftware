/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Deepesh Panwar
 */
public class DbConnection 
{
    static Connection con;
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dshop_software", "root", "root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
