package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        whereIsIt();
    }

    public static void whereIsIt(){
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum  = (int)(Math.random() * 50) + 1;
            intArrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + intArrayList);

        Scanner userInput = new Scanner(System.in);
        System.out.print("Value to find: ");
        int userNum = userInput.nextInt();

        if(!intArrayList.contains(userNum)){
            System.out.println(userNum + " is not in the ArrayList.");
        }else{
            for(int i = 0; i < intArrayList.size(); i++){
                if(intArrayList.get(i) == userNum){
                    System.out.println(userNum + " is in slot " + i  + ".");
                }
            }
        }
    }
}
