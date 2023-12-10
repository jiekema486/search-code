package com.utopia.mysort;

public class A05QuickSortDemo {
    public static void main(String[] args) {
        //快速排序
        //第一轮：以0碎银的数字为基准，确定基准数在数组中的正确的位置
        //比基准数小的全部在左边，比基准数大的全部在右边
        // 后面以此类推

        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length-1);
        pritArr(arr);
    }
    
        //参数一：要排序的数组
        //参数二：要排序数组的起始索引
        //参数三：要排序数组的结束索引
    public static void quickSort(int[] arr,int i,int j){
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        //记录基准数
        int baseNumber = arr[i];

        if(end<=start){
            return;
        }

        //利用循环找到要交换的数字
        while(start != end) {
            //利用end，从后往前开始找，找比基准数小的数字
            while (true){
                if(end<=start || arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //利用start，从前往后开始找，找比基准数大的数字
            while (true){
                if(end<=start || arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start]=temp;

        //确定基准数左边的范围，重复刚刚所做的事情
        quickSort(arr,i,start-1);
        //确定基准数右边的范围，重复刚刚所做的事情
        quickSort(arr,start+1,j);
    }
    private static void pritArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
