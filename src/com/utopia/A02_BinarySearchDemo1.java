package com.utopia;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //{7，23，79，81，103，127，131，147}
        int[] arr = {7,23,79,81,103,127,131,147};
        int number = 103;

        int i = binarySearch(arr, number);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr ,int number){
        //1.定义两个变量记录要查找的范围
        int min=0;
        int max=arr.length-1;
        //2.利用循环不断地去查找数据
        while (true){
            if(min>max){
                return -1;
            }
            //3.找到min和max中间位置
            int mid = (min+max)/2;

            if(arr[mid]==number){
                return mid;
            }
            if(arr[mid]>number){
                max = mid-1;
            }
            if(arr[mid]<number){
                min = mid+1;
            }
        }
    }
}
