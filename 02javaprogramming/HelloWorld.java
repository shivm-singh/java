 // Simple Java program
// FileName: "HelloWorld.java"

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    

    // Prints "Hello, World" to the terminal window.
    public static void main(String[] args)
    {
        System.out.println("World is temporary but my detemination is permanent ");
    String naam = "shivam";
     int age=40;
    System.out.println(naam);
    System.out.println(age);
    System.out.println("testing testing"); 
    
    System.out.println(naam.charAt(0));
System.out.println(naam.replace('a', 'b'));
System.out.println(naam);

int []mark={4,6,2};
System.out.println(mark[0]);

Arrays.sort(mark);

System.out.println(mark[0]);

final int a=2;

System.out.println(Math.max(a,5));
System.out.println((int)(Math.random()*10));

 Scanner sc =new Scanner(System.in);


System.out.println("enter a integer");
int agee =sc.nextInt();
String height=sc.next();

System.out.println(agee);
System.out.println(height);
sc.close(); // only required in vs code in other automatically done
// exception handling using try and catch

int [] numb={3,6,4};
try{
    System.out.println(numb[5]);}
    catch(Exception exception){
System.out.println("hello dear");
    }
 


 
    }
    
}