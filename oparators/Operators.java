package oparators;
import java.util.Scanner;

//Arithmetic Operators 
public class Operators{
   /***
    * addition  +
    * substraction  -
    *  mult  *
    *  div  /
    *  mod  %
    */

    // methods with formal and actual args
    public void add(int a, int b){
        // add method
        int c;
        c = a + b;
        System.out.println("The add of two number is : "+c);
    }
    // sub method
    public void sub(int a, int b){
        int c;
        c = a-b;
        System.out.println("the sub of two numbers is : "+c);
    }
    public void mult(int a, int b){
        int c;
        c = a*b;
        System.out.println("the mult of two numbers is : "+ c);
    }

    public int dive(int a, int b){
        int c;
        c = a/b;
        System.out.println("the div of two numbers is : "+c);
       return 0;
        
    }
    public void mod(int a, int b){
        int c;
        c = a*b;
        System.out.println("the mod of two numbers is : "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        Operators obj = new Operators();
        obj.add(a, b);
        obj.sub(a, b);
        obj.mult(a, b);
        obj.dive(a, b);
        obj.mod(a, b);
        sc.close();
    }
}