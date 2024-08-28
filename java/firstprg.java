class Employee
{
 String name;
 int     id;
double  salary;
String  role;
Employee(String Name, int Id, double Salary, String Role)
{
 this.name=Name;
 this.id=Id;
this.salary=Salary;
this.role=Role;
 }
void display()
{
System.out.println(name);
System.out.println(id);
System.out.println(salary);
System.out.println(role);
}
}
class P
{
  static int sqr(int x)
  {
System.out.println("int");
     return(x*x);
  }
  static double sqr(double x)
  {
System.out.println("double");
     return(x*x);
  }
}

class C extends P
{
  static long sqr(long x)
  {
System.out.println("long");
     return(x*x);
  }
}
class Vehicle
{
    void move()  //Overridden method
    {
System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle
{
    void move()  //Overriding method
    {
System.out.println("Car is moving");
    }
}

interface Drinkable
{
  int QTY=1;
  void drink();
  void taste();  
}

class Coffee implements Drinkable
{
 public void drink()
 {
System.out.println("Drink your "+QTY+" cup coffee");
 }

 public void taste()
 {
System.out.println("Taste your coffee");
 }
}

abstract class BankAccount
{
 void show()   			//Concrete method
  {
System.out.println("Display customer details here");
  }

  abstract void interestCalculation();  	//Abstract method
}

class SBAccount extends BankAccount
{
   void interestCalculation()  //Overriding method
   {
System.out.println("4% interest calculation");
    }
}

class Main
{
   public static void main(String args[])
   {
     Employee a=new Employee("Suriya",1,50000,"Manager");
a.display();

SBAccount sb=new SBAccount();
sb.show();
sb.interestCalculation();

      Vehicle v=new Vehicle();
v.move(); 	//Vehicle is moving 

      Car c=new Car();
c.move();        //Car is moving

      Coffee bru=new Coffee();
bru.drink();
bru.taste();
System.out.println(C.sqr(2));
System.out.println(C.sqr(3.0));
System.out.println(C.sqr(4L));
   } 
}
