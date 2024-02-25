import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        int[] array = new int[20];

        Random random = new Random();
        for(int i=0;i< array.length;i++){
            array[i] = random.nextInt(30+1-10)+10;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int numberForSearch = 27;
        int indexOfNumber = 0;
        for(int j:array){
            if(j==numberForSearch){
                System.out.println("we found it at index : " + indexOfNumber);
               indexOfNumber++;
            }else {
                indexOfNumber++;
            }
        }

    }
}
