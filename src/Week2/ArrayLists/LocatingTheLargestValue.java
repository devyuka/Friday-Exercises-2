package Week2.ArrayLists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        locatingLargestValue();
    }

    public static void locatingLargestValue(){
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum  = (int)(Math.random() * 100) + 1;
            intArrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + intArrayList);

        int maxNum = 0;
        int maxNumIndex = 0;
        for(int i = 0; i < intArrayList.size(); i++){
            if(intArrayList.get(i) > maxNum){
                maxNum = intArrayList.get(i);
                maxNumIndex = i;
            }
        }

        System.out.println("The largest value is " + maxNum + ", which is in slot " + maxNumIndex);
    }
}
