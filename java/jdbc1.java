import java.sql.*;
import java.util.Scanner;

class Main
{
 public static void main(String []args)
 {
  Scanner a=new Scanner(System.in);
System.out.println("Enter employee number");
  int id=a.nextInt();
System.out.println("Enter employee name");
  String name=a.next();
System.out.println("Enter department");
  String department=a.next();
System.out.println("Enter employee salary");
  double salary=a.nextDouble();

 try
 {
Class.forName("com.mysql.cj.jdbc.Driver");
   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
PreparedStatement d=c.prepareStatement("INSERT INTO employees(id,name,department,salary) VALUES(?,?,?,?)");
d.setInt(1,id);
d.setString(2,name);
d.setString(3,department);
d.setDouble(4,salary);
d.executeUpdate();
System.out.println("Inserted successfully");
d.close();
c.close();
   }
catch(ClassNotFoundException e)
   {
e.printStackTrace();
    }
catch(SQLException f)
   {
f.printStackTrace();
    }
  }
}
