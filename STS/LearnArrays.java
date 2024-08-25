import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        // An array is a container object that holds a fixed number of values of a single type.

        int[] arr = new int[5];
        for (int i = 1; i <= 5; i++) {
            arr[i - 1] = i * 100;
        }
        
        // Printing out Array
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index [" + i + "] is: " + arr[i]);
        }
        
        // Multidimensional Strings Array
        String[][] numbers = { { "One", "Two" }, { "Three", "Four" } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Copying Arrays
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        
        //utilising arraycopy() method of the System class
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println(" ");

        //Array Manipulation using java.util.Arrays
        String[] copyTo2 = Arrays.copyOfRange(copyFrom, 2, 10);
        for (String coffee : copyTo2) {
            System.out.print(coffee + " ");
        }
        System.out.println(" ");

        // Some other useful methods in Arrays class
        // - binarySearch()
        // - equals()
        // - fill()
        // - sort()
        // - parallelSort()
        // - stream()
    }
}
