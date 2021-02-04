import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {

        readElements(readInteger());


        //int[] returnedArray = readElements(readInteger());
        //System.out.println("Min value: " + findMin(returnedArray));

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    //private static Scanner scanner = new Scanner(System.in);
    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int [] newArray = new int[count]; //initializes this to zero
        for(int i = 0; i < newArray.length; i++) {
            System.out.println("Enter values: ");
            newArray[i] = scanner.nextInt();
            //scanner.nextLine();

        }
        return newArray;
    }

    private static int findMin(int[] array) {
        for(int i = 0; i < 1; i ++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = 0;
                    array[i] = array[j];
                    tmp = array[j];
                }
            }
        }
        return array[0];
    }
}
