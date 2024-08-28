import java.sql.*;
class Main
{
 public static void main(String []args)
 {
   try
   {
Class.forName("com.mysql.cj.jdbc.Driver");
   Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useSSL=false","root","root");
   Statement b=a.createStatement();
ResultSet c=b.executeQuery("SELECT*FROM employees");
   while(c.next())
   {
    int id=c.getInt(1);
    String name=c.getString(2);
    String department=c.getString(3);
    double salary=c.getDouble(4);

System.out.println("EMPID :"+id);
System.out.println("NAME :"+name);
System.out.println("DEPARTMENT:"+department);
System.out.println("SALARY:"+salary);
System.out.println();
    }
   }
catch(ClassNotFoundException d)
   {
d.printStackTrace();
    }
catch(SQLException e)
    {
e.printStackTrace();
     }
    }
   }   
