package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        findingValue();
    }

    public static void findingValue(){
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum  = (int)(Math.random() * 50) + 1;
            intArrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + intArrayList);

        Scanner userInput = new Scanner(System.in);
        System.out.print("Value to find: ");
        int userNum = userInput.nextInt();

        for(int num: intArrayList){
            if(num == userNum){
                System.out.println(userNum  + " is in the ArrayList.");
            }
        }
    }
}
