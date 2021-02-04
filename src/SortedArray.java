import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    //private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myInteger = getIntegers(5);
        printArray(myInteger);
        //System.out.println(Arrays.toString(myInteger));
        int [] newArray = sortIntegers(myInteger);
        printArray(newArray);
    }

    public static int[] getIntegers(int array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array + " integer values.\r");
        int[] values = new int[array];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i] + "\r");
        }
    }

    public static int[] sortIntegers(int[] array) {
        int [] newArray = Arrays.copyOf(array, array.length);
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if(array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
