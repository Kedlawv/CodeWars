//You have an array of numbers.
//Your task is to sort ascending odd numbers but even numbers must be on their places.
//
//Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
//
//Example
//sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int n = array.length;
        int min;

        //first loop starts at first ends at one to last
        for (int i = 0; i < n - 1; i++) {
            if (array[i] == 0 || array[i] % 2 == 0) { // we can divide 0 by a number we just cant divide by zero
                continue;                               // 0%2 is zero
            }
            min = array[i];
            int minIndex = i;
            //inner loop starts at second ends at last
            for (int j = i + 1; j < n; j++) {
                if (array[j] < min && array[j] % 2 == 1) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }


        return array;
    }

    public static int[] sortArrayCW(int[] array) { //more compact version
        for(int i=0 ; i<array.length-1 ; i++){
            for(int j=i+1; j<array.length ; j++){
                if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }

    public static int[] sortArrayStreamsCW(final int[] array) {

        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        int min;

        //first loop starts at first ends at one to last
        for (int i = 0; i < n - 1; i++) {
            min = array[i];
            int minIndex = i;
            //inner loop starts at second ends at last
            for (int j = i + 1; j < n; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (min != array[i]) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }


        return array;
    }
}
