package Week2.Arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        locatingLargestValue();
    }

    public static void locatingLargestValue(){
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++){
            if(i == 0){
                System.out.print("Array: ");
            }

            int randomNum = (int)(Math.random() * 100) + 1;
            intArray[i] = randomNum;
            System.out.print(intArray[i] +  " ");
        }

        int maxNum = 0;
        int maxNumIndex = 0;
        for(int j = 0; j < intArray.length; j++){
            if(intArray[j] > maxNum){
                maxNum = intArray[j];
                maxNumIndex = j;
            }
        }
        System.out.println();
        System.out.println("The largest value is " + maxNum);
        System.out.println("It is in slot " + maxNumIndex);
    }
}
