import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        //1
        int[] array = new int[4];
        Random rnd = new Random();
        array[0] = rnd.nextInt(100)+10;
        array[1] = rnd.nextInt(100)+10;
        array[2] = rnd.nextInt(100)+10;
        array[3] = rnd.nextInt(100)+10;
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
        int i=0;
        while(i< array.length-1){
            if(array[i]<array[i+1]){
                i++;
            }else{
                i= array.length+1;
                System.out.println("this array with no order");
            }
            if (i==array.length-1){
                System.out.println("this is incremental sequence of numbers");
            }
        }
        for (int j: array){
            System.out.print(j + " ");
        }
    }
}
