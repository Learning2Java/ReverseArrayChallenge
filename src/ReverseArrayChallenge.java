import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    public static void main(String[] args) {

        int [] array1 = readElements(5);
        System.out.println(Arrays.toString(array1));
        int [] array2 = reverse(array1);


        System.out.println(Arrays.toString(array2));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int [] newArray = new int[count]; //initializes this to zero
        for(int i = 0; i < newArray.length; i++) {
            System.out.println("Enter values: ");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    private static int [] reverse(int[] array) {
        int [] reverseArray = new int[array.length];
        for(int i = 0; i <array.length ; i ++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }
}
