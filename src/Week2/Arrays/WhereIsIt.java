package Week2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        whereIsIt();
    }

    public static void whereIsIt(){
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++){
            if(i == 0){
                System.out.print("Array: ");
            }
            int randomNum = (int)(Math.random() * 50) + 1;
            intArray[i] = randomNum;
            System.out.print(intArray[i] + " ");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.print("Value to find: ");
        int userNum = userInput.nextInt();

        if(Arrays.stream(intArray).anyMatch(i -> i == userNum)) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[j] == userNum) {
                    System.out.println(userNum + " is in slot " + j);
                }
            }
        }else{
            System.out.println(userNum + " is not in the array.");
        }
    }
}
