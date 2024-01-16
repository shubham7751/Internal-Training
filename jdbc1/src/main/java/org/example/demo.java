package org.example;
import java.sql.*;

public class demo {
public static void main(String[] args){
    String url="jdbc:mysql://localhost:3306/test";
    String user="root";
    String password="shubham";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,user,password);
        System.out.println("connection successfull");
           //String query="update student set city='pune' where id=104";
        // String query="insert into student (id,name,age,city)values(107,'mahesh',28,'fursungi')";
          String query="DELETE FROM student WHERE name='ganesh'";
       Statement statement=connection.createStatement();
       int i=statement.executeUpdate(query);
        System.out.println(i+"  rows Modifyed");
        connection.close();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

}
}
