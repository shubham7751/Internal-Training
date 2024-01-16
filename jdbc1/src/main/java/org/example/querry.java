package org.example;
import java.sql.*;
import java.util.*;
public class querry {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int choice;
        String url="jdbc:mysql://localhost:3306/emp";
        String user="root";
        String password="shubham";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            System.out.println("connection successfull");
            Statement statement=connection.createStatement();
            do {
                System.out.println("Enter your choice");
                System.out.println("Press 1 to INSERT into the DB");
                System.out.println("Press 2 to DELETE from DB");
                System.out.println("Press 3 to Display into DB");
                //System.out.println("Press 4 to VIEW ALL from DB");
                //System.out.println("Press 5 to EXIT");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        statement.executeUpdate("insert into emp1 values(01,'aaa',100),(02,'bbb',200),(03,'ccc',300),(04,'ddd',400),(05,'eee',500)");
                        System.out.println("insert succesfully");
                        break;
                    case 2:
                        statement.executeUpdate("delete from emp1 where id=01");
                        System.out.println("delete succesfully");
                        break;
                    case 3:
                        statement.executeUpdate("Update emp1 Set name='zzz' where id=4");
                        System.out.println("update succesfully");
                       break;


                    case 4:
                        ResultSet resultSet = statement.executeQuery("select * from emp1");
                        while (resultSet.next()) {
                            System.out.println(resultSet.getInt(1) + "\t\t" + resultSet.getString(2) + "\t\t" + resultSet.getInt(3));
                        }
                        break;


                }
            }while(choice!=5);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
