package student.management.system1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cons {

    Connection con;
    Statement state;

    Cons(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","bishtAkhil@196907");
            state=con.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

