package Week2.ArrayLists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        basicArrayList();
    }

    public static void basicArrayList(){
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum  = (int)(Math.random() * 100) + 1;
            intArrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + intArrayList);
    }
}
