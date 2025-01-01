
import java.util.Collection;


// abstract class Computer {
//     abstract public void hibernate();
//     abstract public void program();
// }
//  class Phone extends Computer {
//     @Override
//     public void hibernate(){
//        System.out.println("Switch my sytem off for small minutes"); 
//     }

//     @Override
//     public void program() {
//       System.out.println("Run Some Tests and Programme");
//     }
// }

// public class Demo {
//     public static void main(String[] args){
//         Computer obj = new Phone();
//         obj.hibernate();
//         System.out.println("Computer Properties");
//     }
// }

//Anonymoue Obj

// Inner Classes 

// class Outer{

//     int age = 9;
//     public void showOuter(){
//         System.out.println("Thii is an Inner Class Obj");
//     }

//     class Inner {
//         public void showInner(){
//             System.out.println("This Codes run inner Code");
//         }
//     }
// }

// class Demo{
//     public static void main(String[] args){
//             Outer out = new Outer();
//             out.showOuter();

//             Outer.Inner in = out.new Inner();
//             in.showInner();
//     }
// }

// Anonymous Inner Class 

// class Outer{
//     public void showOuter(){
//         System.out.println("This is the Outer Class");
//     }
// }

// class Demo{
//     public static void main(String[] args){
//         Outer out = new Outer ()
//         {
//             public void showOuter()
//             {
//                 System.out.println("SHow Inner Class");
//             }
//         };
//         out.showOuter();

//     }
// }

// Abstract Anonymous Inner Class 

// abstract class Computer{
//     public abstract void hibernate();
//     public abstract void shut();
// }

// class Demo{
//     public static void main(String[] args){
//         System.out.println("Welcometo my Computer");
//         Computer comp = new Computer(){

//             @Override
//             public void hibernate(){
//                 System.out.println("Makle the computer Sleep For a while");
//             }

//             @Override
//             public void shut(){
//                 System.out.println("Make the Laptop Shuts Down For ever");
//             }

//         };

//         comp.hibernate();
//         comp.shut();

//     } 
// } 
// InterFace in java

// interface Computer {

//     String name = "Abdullahi"; // By default a declared variable of interface is final static //
//     int age = 34;

//     void show(); // By Default a method interface is public abstarct//
//     void config(); // By Default a method interface is public abstarct//
// }

// class Laptop implements Computer{
//     public void show(){
//         System.out.println("In show");
//     }

//     public void config(){
//         System.out.println("In Config Show");
//     }
// }

// class Demo{
//     public static void main(String[] args){
//         Computer computer = new Laptop();
//         computer.config();
//         computer.show();
//         System.out.println(Computer.age);
//         System.out.println(Computer.name);
//     }
// }

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends 

// Need for Inheritance 

// interface Computer{
//      void show();
// }

// class Desktop implements  Computer{
//     public void show(){
//         System.out.println("Work with desktop");
//     }
// }

// class Laptop implements Computer{
//     public void show(){
//       System.out.println("Real Laptop for work");
//     }
// }

// class Employee{
//     public void show(Computer laptop){
//         System.out.println("Working with a Laptop");
//         laptop.show();

//     }
// }

// class Demo{
//     public static void main(String[] args){

//         Computer desk = new Desktop();
//         Computer laptop = new Laptop();
//         Employee employee = new Employee();
//         employee.show(desk);

//     }
// }

// enum Status{
//     Running,Failed,Pending,Success
// }

// class Demo {

//     public static void main(String[] args) {
//         // Status s = Status.Running;
//         Status[] s = Status.values();
//         System.out.println(s);

//         for(Status ss : s){
//             System.out.println(ss + " " + ss.ordinal());
//         }
//         System.out.println(s[0]);
//     }

// }

// Without Enums 

// class Laptop {
//     private final  String name; 
//     private final  String description;

//     public Laptop (String name , String description){
//         this.name = name;
//         this.description = description;
//     }
//     public String getName(){
//         return name;
//     }

// }

// class Demo{
//     public static void main(String[] args){
//         Laptop lap = new Laptop("Mac Book","Best Laptop in the world");
//        System.out.println(lap.getName());
//     }
// }

// With enums class 

// enum Laptop{
//     McBook("MacBook", "This is the best MacBook in the worl"),
//     Dell("Dell", "This is the best notebook in the worl"),
//     Hp("Hp", "This is the best notebook in the worl");

//     private final String name;
//     private final String description;

//     Laptop(String name, String description) {
//         this.name = name;
//         this.description = description;
//     }

//     public String getName(){
//         return name;
//     }

//     public String getDescription() {
//         return description;
//     }
// }
// class Demo{
//     public static void main(String[] args){
//         Laptop lap = Laptop.McBook;

//         System.out.println(lap.getName());
//         System.out.println(lap.getDescription());
//     }
// }

// Functional Interface 
// @FunctionalInterface
// interface A{
//         void show(int x);

// }

//  // Lambda Express 
// class Demo{
//     public static void main(String[] args){
//         A obj = x-> System.out.println("Getting Out What Matters" + x);

//         obj.show(2);

//     }
// }

// interface A{
//     int add (int x , int y);
//     // int minus(int k, int l);  Cant Use two method 
// }
// class Demo{
//     public static void main(String[] args){
//         A obj = (int x, int y)-> x + y;
//         int result = obj.add(3,4);
//         System.out.println(result);
//     }
// }

// interface Val{
//     int value (int x, int y);

// }

// class Demo{
//     public static void main(String[] args){

//         try{
//             Val v = (int x, int y) -> x/y ;
//             int result = v.value(3, 0);
//             System.out.println(result);
//         }catch(Exception e){
//             System.out.println("error " + e);
//         }

//     }
// }

// import java.util.Scanner;

// class Calculator {
//     final private int num1;
//      private int num2;

//     public Calculator(int num1, int num2) {
//         this.num1 = num1;
//         this.num2 = num2;
//     }

//     public int getNumbers() {
//         try {
//             if(num2 % 2!=0){
//                 num2 = 1;
//             }
//             return num1 / num2;
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot Divide by zero" + e);
//             return 0;
//         }
//     }

// }

// public class Demo {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Please enter a number to be divide");
//         int num2 = scanner.nextInt();
//         Calculator c = new Calculator(3,num2);
//         System.out.println(c.getNumbers());
//     }
// }

//Docking Exception in Java//

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
 public class Demo{
    public static void main(String[] args){
        // Collection 
        Collection<Integer> nums = new ArrayList<>();

        // List 
        List<Integer>numbers = new ArrayList<>();

        // Set Interface implements HashSet// 
        Set <Integer> studentAges = new HashSet<>();

        //Set Interface implements TreeSet// 
        Set <Integer> studentPosition = new TreeSet<>();

        studentPosition.add(3);
        studentPosition.add(7);
        studentPosition.add(8);

        System.out.println(studentPosition);

        Iterator<Integer>iterators = studentPosition.iterator();

        while(iterators.hasNext())
            System.out.println("Student Position " + iterators.next());

        studentAges.add(25);
        studentAges.add(26);
        studentAges.add(34);
        studentAges.add(54);

        System.out.println(studentAges);


        nums.add(4);
        nums.add(5);
        nums.add(6);

        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

      System.out.println(numbers.get(2));
      System.out.println(numbers.size());

      for(int i =0; i < numbers.size(); i++){
        System.out.println(numbers.get(i));
      }

        System.out.println(nums);

        // Mapping in java 

        Map<String,Integer> students = new HashMap<>();

        students.put("Abdullahi", 67);
        students.put("Abdulbasit", 78 );
        students.put("AbdulSamad", 80);
        students.put("Ahmad", 45 );

        System.out.println(students.keySet());

        for(String key: students.keySet())
        {
            System.out.println(key + " : " + students.get(key)); 
        }

    }
}
