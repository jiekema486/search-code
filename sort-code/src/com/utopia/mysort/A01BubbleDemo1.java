package com.utopia.mysort;

public class A01BubbleDemo1 {
    public static void main(String[] args) {
        //冒泡排序
        //核心思想：
        //1.相邻的元素两两比较，大的放右边，小的放左边
        //2.第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推
        //3.如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。

        int[] arr = {3,4,8,23,7,9,45,87,22,5};


        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        pritArr(arr);
    }
    private static void pritArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
