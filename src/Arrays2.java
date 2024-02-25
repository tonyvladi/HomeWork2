import java.util.Random;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int sizeOfArray = sc.nextInt();
        while(sizeOfArray<1){
            System.out.println("please try again, it has to be positive int");
            sizeOfArray = sc.nextInt();
        }

        System.out.println("Please enter lower boundary of random numbers");
        int lowBound = sc.nextInt();
        System.out.println("Please enter upper boundary of random numbers");
        int upperBoundary = sc.nextInt();
        while(upperBoundary<lowBound||upperBoundary==lowBound){
            System.out.println("try again, lowerBound has to be les than upperBound");
            System.out.println("Please enter lower boundary of random numbers");
            lowBound = sc.nextInt();
            System.out.println("Please enter upper boundary of random numbers");
            upperBoundary = sc.nextInt();
        }


        Random rnd =new Random();
        int[] array  =new int[sizeOfArray];
        for(int i=0; i<sizeOfArray;i++){
            array[i] = rnd.nextInt(upperBoundary)+lowBound;
            System.out.print(array[i] + " ");
        }
    }
}
