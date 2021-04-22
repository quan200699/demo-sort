package com.codegym;

public class Main {

    public static void main(String[] args) {
        int array[] = {1, 9, 6, -8, 4, 65, 6, 2, 0};
        System.out.println("Mảng trước khi sắp xếp:");
        showArray(array);
        System.out.println("Mảng sau khi sắp xếp nổi bọt:");
        bubbleSort(array);
        showArray(array);
        System.out.println("Mảng sau khi sắp xếp chọn:");
        selectionSort(array);
        showArray(array);
        System.out.println("Mảng sau khi sắp xếp chèn:");
        insertionSort(array);
        showArray(array);
    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int position = i;
            int temp = array[position];
            while (position > 0 && array[position - 1] > temp) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = temp;
        }
    }
}
