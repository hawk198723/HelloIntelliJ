package JAVA8.FunctionalInterface.FunctionExe;

import org.junit.Test;

import java.util.function.Function;

public class FunctionExe {
    public static void main(String[] args) {
        Function<Integer,Integer> function = integer -> integer *2;
        System.out.println(function.apply(23));
    }


    @Test
    public void test1(){
        Function<Integer,Integer> function = integer -> integer *2;
        System.out.println(function.apply(56));
        System.out.println(function.apply(3));
        System.out.println(function.apply(4));
        System.out.println(function.apply(5));
    }
    @Test
    public void test2(){
        Function<String,String> function = string -> string.toLowerCase();
        Function<String,Integer> function1 = num -> num.length();
        Function<Integer,String> function2 = num -> num.toString();
        System.out.println(function.apply("WALAH!WHZUP?"));
        System.out.println(function.andThen(function1).apply("AAAABBBBCCCC"));
        System.out.println(function2.andThen(function1).apply(9876));
        System.out.println(function2.compose(function1).apply("abcdfdefg"));
    }

    @Test
    public void test3(){
        Function<Employee, String> function = s ->{
            int count = s.count;

            String grade = "";
            if (count >85) {
                grade = "A [Good employee]";
            }else if (count >= 70){
                grade = "B [OK employee]";
            }else if(count >=60){
                grade = "C [Need to talk with employee]";
            }else{
                grade= "F [Fired to-be]";
            }
            return grade;
        };

        Employee[] employees = {
                new Employee("Jason", 75),
                new Employee("Josh", 56),
                new Employee("Kris", 90),
                new Employee("Jeff", 102),
                new Employee("Kieth", 30),
                new Employee("Hans", 50),
                new Employee("May", 70),
                new Employee("LiLei", 90),
                new Employee("Yoda", 50),
                new Employee("Lam", 35),
                new Employee("Jasmin", 84), };

        for (Employee e: employees) {
            System.out.println("Employee name: " + e.name);
            System.out.println("Employee count: " + e.count);
            System.out.println("Employee grade: " + function.apply(e));
            System.out.println("*******************************");
        }
    }


}
