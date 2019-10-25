package Week2.Arrays;

public class BasicArrays2 {

    public static void main(String[] args) {
        basicArray2();
    }

    public static void basicArray2() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            int randomNum = (int)(Math.random() * 100) + 1;
            intArray[i] = randomNum;
            System.out.println("Slot " + i +" contains a " + intArray[i]);
        }
    }
}
