package jdbc_demo;

import java.sql.*;
import java.io.*;
public class Jdbc_demo {

    
    public static void main(String[] args) {
         Connection con = null;
         System.out.println("connection is null!");
         DataInputStream dis = new DataInputStream(System.in);
        try
        {
            int id;
            String pname;
            String user="";
            String pass="";
            String localhost="jdbc:mysql://localhost:3310/test";

            Class.forName("com.mysql.jdbc.Driver"); 

           con=DriverManager.getConnection(localhost,user,pass);  
            
            if(con!=null)
            {
                System.out.println("Connected successfully!");
                
                
      /*          //=============INSERT========================//
                System.out.println("enter id");
                id=Integer.parseInt(dis.readLine());
                System.out.println("enter product");
                pname=dis.readLine();
                
                String sql = "INSERT INTO prod (prodid,prodname) VALUES (?, ?)";

                PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1,id);
                statement.setString(2,pname);
              

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
	System.out.println("A new user was inserted successfully!");
                        }
                
                
                   
            //=======================UPDATE==========================//
            
             System.out.println("enter id of product");
             id=Integer.parseInt(dis.readLine());
             System.out.println("enter name");
             pname=dis.readLine();
            String sql = "UPDATE prod SET prodname=? WHERE prodid=?";
 
            PreparedStatement statement = con.prepareStatement(sql);
         
            statement.setString(1,pname);
               statement.setInt(2,id);

 
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
        */  String sql = "DELETE FROM prod WHERE prodid=?";
            System.out.println("enter id");
               id=Integer.parseInt(dis.readLine());
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,id);
 
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
    System.out.println("A user was deleted successfully!");
            }*/
            
            
            //====================++DISPLAY===========================//
                
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from prod");  
                while(rs.next())  
                {
                   System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
                }
                con.close();  
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }

    }
    
}
