package Week2.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        copingArrays();
    }

    public static void copingArrays(){
        int[] array01 = new int[10];
        int[] array02 = new int[10];

        for(int i = 0; i < array01.length; i++){
            int randomNum = (int)(Math.random() * 100) + 1;
            array01[i] = randomNum;
        }

        for(int j = 0; j < array02.length; j++){
            array02[j] = array01[j];
        }

        array01[array01.length - 1] = -7;

        for(int k = 0; k < array01.length; k++){
            if(k == 0){
                System.out.print("Array 1: ");
            }
            System.out.print(array01[k] +  " ");
        }

        System.out.println();

        for(int l = 0; l < array02.length; l++){
            if(l == 0){
                System.out.print("Array 2: ");
            }
            System.out.print(array02[l] +  " ");
        }
    }
}
