package Generic;

public class GenTest {
    //  printArray
    public static <E> void printArray(E[] inputArray) {
        // for loop printout
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println("-----");
    }

    public static void main(String[] args) {
        //create different arrays: Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer Array elements are:");
        printArray(intArray); // pass in Integer Array

        System.out.println("Double Array elements are:");
        printArray(doubleArray); // pass in Double Array

        System.out.println("Char Array elements are:");
        printArray(charArray); // pass in Char Array
    }
}