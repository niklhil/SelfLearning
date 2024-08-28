import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
    Scanner scr=new Scanner(System.in);
System.out.println("Enter a Sentence to split:");
    String a=scr.nextLine();
    String r[]=a.split(" ");

for(String x : r)
    {
System.out.println(x);
    }


System.out.println("Enter a String :");
    String s=scr.nextLine();
s.length();
System.out.println("Enter start and end index");
    int si=scr.nextInt();
    int ei=scr.nextInt();
if(ei>s.length())
    {
System.out.println("Enter correct end index");
     }

        String r2=s.substring(si,ei);
System.out.println(r2);


  }
}
