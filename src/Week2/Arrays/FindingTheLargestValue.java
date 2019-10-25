package Week2.Arrays;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        findingLargestValue();
    }

    public static void findingLargestValue(){
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
        for(int j = 0; j < intArray.length; j++){
            if(intArray[j] > maxNum){
                maxNum = intArray[j];
            }
        }

        System.out.println();
        System.out.println("The largest value is " + maxNum);
    }
}
