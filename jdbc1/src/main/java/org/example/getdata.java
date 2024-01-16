package org.example;
import java.sql.*;
public class getdata {


    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="shubham";
        try {
            Connection connection=DriverManager.getConnection(url,user,password);
            Statement statement=connection.createStatement();

           // String query="select * from student where name like'sh%'";
            //String query="Select * from student order by id desc";
            //String query="select * from student where city in (pune)  ";
            //String query="select names from student where age>22";
           // String query="Select * from student where age=(Select max(age)from student) ";
            String query="select name,age from student group by name,age;";

            ResultSet resultSet=statement.executeQuery(query);

            System.out.println(resultSet);

            while(resultSet.next()){
              //int id = resultSet.getInt("id");
              String name = resultSet.getString("name");
                String age = resultSet.getString("age");
               //System.out.println(id);
                System.out.println(" Student Name is - "+name);
               System.out.println(" Student age is - "+age);
                System.out.println(" ");
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
