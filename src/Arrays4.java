import java.util.Random;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        int sizeOfArray = 5;
        int lowBound = 10;
        int upperBoundary = 30;
        Random rnd = new Random();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = rnd.nextInt(upperBoundary + 1 - lowBound) + lowBound;
            System.out.print(array[i] + " ");
        }
        for (int out = sizeOfArray - 1; out >= 1; out--) {
            for (int in = 0; in<out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
                }
            }

            System.out.println();
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }
