package JAVA8.FunctionalInterface.ConsumerExe;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExe {
    @Test
    public void  test1(){
        happyTime(70, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("Added some gas, cost me $" + aDouble);
            }
        });

        happyTime(12, money-> System.out.println("Bought a meal, cost me $" + money));
    }

    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    @Test
    public void test2(){
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello!");
    }
    @Test
    public void test3(){
        Consumer<Movie> consumer = movie -> System.out.println(movie.getMovieName()+ " is awesome!");
        Consumer<Movie> consumer1 = movie -> System.out.println(movie.getMovieName()+ " is wasting my time!");
        Consumer<Movie> consumer2 = movie -> System.out.println(movie.getMovieName()+ " is a new show!");

        Movie movie1 = new Movie("SpiderMan");
        Movie movie2 = new Movie("BadMan");
        Movie movie3 = new Movie("SuperMan");

        consumer.accept(movie1);
        consumer1.accept(movie2);
        consumer2.accept(movie3);
    }

    @Test
    public void test4(){
        Consumer<Integer> consumer = n -> System.out.println("The square of "+ n + " is "+ (n*n)+"." );
        consumer.accept(9);
    }

    @Test
    public void test5(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        numbers.forEach(n-> System.out.println(n));
        System.out.println("***************");
        numbers.forEach(System.out::println);
        System.out.println("***************");
        Consumer<Integer> consumer = n -> System.out.println(n);
        numbers.forEach(consumer);
    }
}
