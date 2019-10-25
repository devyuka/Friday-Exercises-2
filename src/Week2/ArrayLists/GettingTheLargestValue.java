package Week2.ArrayLists;

import java.util.ArrayList;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        gettingLargestValue();
    }

    public static void gettingLargestValue(){
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum  = (int)(Math.random() * 100) + 1;
            intArrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + intArrayList);

        int maxNum = 0;
        for(int i = 0; i < intArrayList.size(); i++){
            if(intArrayList.get(i) > maxNum){
                maxNum = intArrayList.get(i);
            }
        }

        System.out.println("The largest value is " + maxNum);
    }
}
