import java.util.Random;
import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int sizeOfArray = sc.nextInt();
        System.out.println("Please enter lower boundary of random numbers");
        int lowBound = sc.nextInt();
        System.out.println("Please enter upper boundary of random numbers");
        int upperBoundary = sc.nextInt();

        //fill in array with random numbers
        Random rnd = new Random();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = rnd.nextInt(upperBoundary+1-lowBound) + lowBound;
            System.out.print(array[i] + " ");
        }


        //sorting array with bubble-sort
        for (int out = sizeOfArray - 1; out >= 1; out--) {
            for (int in = 0; in<out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }

        //print sorted array
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();

        //target number for search
        System.out.println("please enter the number for search");
        int k = sc.nextInt();

        int searchCounter = 0;

        //linear search
        int indexOfNumber = -1;
        for(int j:array){
            if(j==k){
                indexOfNumber++;
                searchCounter++;
                break;
            }else {
                indexOfNumber++;
                searchCounter++;
            }

        }
        //stats for linear-search
        System.out.println("linear-search found the k-number at index :"
                + (indexOfNumber)+" it had spent: " + searchCounter + " operations");

        //binary-search
        searchCounter = 0;
        int lowIndex = 0;
        int highIndex = array.length - 1;
        indexOfNumber = -1;



        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (k > array[midIndex]) {
                lowIndex = midIndex + 1;
            } else if (k < array[midIndex]) {
                highIndex = midIndex - 1;
            } else if (k == array[midIndex]) {
                indexOfNumber = midIndex;
                break;
            }
            searchCounter++;
        }
        //stats for binary-search
            System.out.println("element found under index of : " + indexOfNumber
                    + " it had spent: " + searchCounter + " operations" );
        }
    }
