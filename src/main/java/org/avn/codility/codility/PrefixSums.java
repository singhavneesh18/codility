package org.avn.codility.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixSums {
    public static void main(String[] args) {
        class Input {
            int[] a;
            int position;
            int moves;

            public Input(int[] a, int position, int moves) {
                this.a = a;
                this.position = position;
                this.moves = moves;
            }
        }

        int[] a = {2, 3, 7, 5, 1, 3, 9};
        List<Input> inputList = new ArrayList<>();
//        inputList.add(new Input(a,4,6));
        inputList.add(new Input(new int[]{2, 3, 7, 5, 1, 3, 9, 12, 5, 2, 1, 5, 7, 9, 6, 5}, 4, 6));
        inputList.add(new Input(new int[]{2, 3, 7, 5, 1, 3, 9, 12, 5, 2, 1, 5, 7, 9, 6, 5}, 6, 6));
        inputList.add(new Input(new int[]{2, 3, 7, 5, 1, 3, 9, 12, 5, 2, 1, 5, 7, 9, 6, 5}, 0, 6));
        inputList.add(new Input(new int[]{2, 3, 7, 5, 1, 3, 9, 12, 5, 2, 1, 5, 7, 9, 6, 5}, 0, 16));
        inputList.add(new Input(new int[]{2, 3, 7, 5, 1, 3, 9, 12, 5, 2, 1, 5, 7, 9, 6, 5}, 0, 6));
        inputList.add(new Input(new int[]{}, 0, 6));
        inputList.add(new Input(new int[]{1}, 0, 6));
        inputList.add(new Input(new int[]{1}, 1, 6));
        /*inputList.forEach(in -> {
            System.out.println(new PrefixSums().collectMaxMushroom(in.a, in.position, in.moves));
        });*/
//        System.out.println(new PrefixSums().collectMaxMushroom(a,4,6));
    }

    public int collectMaxMushroom(int[] data, int position, int moves) {
        System.out.println("==========================START=======================");
        System.out.println(Arrays.toString(data));
        int length = data.length;
        if (0 == length || position == length) {
            return 0;
        }
        for (int i = 1; i < data.length; i++) {
            data[i] = data[i] + data[i - 1];
        }
        System.out.println(Arrays.toString(data));
        int i1 = position - moves;
        int startOfLoop = i1 > -1 ? i1 : 0;
        int maxCollection = 0;
        if (position == 0) {
            return data[length > moves ? moves : length - 1];

        }
        for (int i = startOfLoop; i < position + 1; i++) {
            int temp = 2 * (position - i);
            int end = temp >= moves ? position : position + (moves - temp);
            int sum = getSum(data, i, end);
            maxCollection = sum > maxCollection ? sum : maxCollection;
            System.out.printf("start : %d, end %d , sum: %d \n", i, end, sum);

        }

        return maxCollection;
    }

    private int getSum(int arr[], int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        return arr[end] - arr[start - 1 > -1 ? start - 1 : 0];
    }
}
