public class Strings1 {
    public static void main(String[] args) {
        String string = "This is string for example";
        char ch = 's';
        int counter = 0;
        char[] chA = string.toCharArray();
        for (char i:chA){
            if(i==ch){
                counter++;
            }
        }
        System.out.println(" the String : " + string + " contains : " + counter + " of " + ch);
    }
}
