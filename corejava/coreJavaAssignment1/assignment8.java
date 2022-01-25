package com.coreJavaAssignment1;




public class assignment8 {
    public static void bubblrSort ( int number[]){
        int n = number.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }


        }
    }
    public static void main(String[] args) {
        int[] number = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        System.out.println("Array before sorting");
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");

        }
        System.out.println();
        bubblrSort(number);
        System.out.println("Array after bubble sort");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i]+" ");


    }
}