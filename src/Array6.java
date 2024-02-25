import java.util.Random;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int sizeOfArray = sc.nextInt();
        System.out.println("Please enter lower boundary of random numbers");
        int lowBound = sc.nextInt();
        System.out.println("Please enter upper boundary of random numbers");
        int upperBoundary = sc.nextInt();

        Random rnd = new Random();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = rnd.nextInt(upperBoundary+1-lowBound) + lowBound;
            System.out.print(array[i] + " ");
        }
        int[] invertedArray = new int[sizeOfArray];
        for(int i=0;i<array.length;i++){
            invertedArray[invertedArray.length-1-i] = array[i];
        }
        System.out.println();
        for(int j:invertedArray){
            System.out.print(j + " ");
        }
    }
}
