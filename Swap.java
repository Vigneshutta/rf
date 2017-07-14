import java.util.*;
import java.io.*;
import java.lang.*;
public class Swap
{
public static void main(String[] args) throws IOException
{
  
   BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
 int a=10,b=20;
 System.out.println("Before swapping:");
System.out.println("A=" + a);
System.out.println("B=" + b);
 a = a^b;
 b = a^b;
 a = a^b;
 System.out.println("After swapping: \n");
 System.out.println("A=" + a);
System.out.println("B=" + b);
 //getch();
} 
}
