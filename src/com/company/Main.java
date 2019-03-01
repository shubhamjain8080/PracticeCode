package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 1, 3, 9, 7, 30, 10, 8,9, 10, 11};

        findLargestMonotonousSequence(arr);


    }

    private static void findLargestMonotonousSequence(int[] arr) {

        int finalArray[] = new int[arr.length];
        int n =0;
        for (int i = 0; i < arr.length; i++){
            int x  = 0;
            int temp[] = new int[arr.length];
            temp[0] = arr[i];
            
            for (int j = i+1; j<arr.length; j++){
                if(arr[j] > temp[x])
                {
                    temp[++x] = arr[j];
                }
                else if( x!=0 && temp[x-1] < arr[j]){
                    temp[x] = arr[j];
                }
            }
            if(n<x){
                for(int t = 0; t< temp.length;t++){
                    finalArray[t] = temp[t];
                }
                n = x;
            }
            
        }

        for (int element :
                finalArray) {
            System.out.println(element);
        }
    }

    private static void maxNumberOfRepetition(int[] arr) {
        int count = 1;
        int maxCount = 1;
        int index = 0;

        for (int i =1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                count = 1;
            }

            if (count > maxCount){
                maxCount = count;
                index = i;
            }

        }

        System.out.println("Max count is: " + maxCount + " of element: " + arr[index]);

    }

}
