package com.utopia;

public class A01_BasicSearchDemo1 {
    //基本查找
    //核心：
    //从0索引开始挨个往后查找
    //需求：定义一个方法利用基本查找，查询某个元素在数组中是否存在

    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79};
        int number = 55;
        boolean b = basicSearch(arr, number);
        System.out.println(b);

    }
    public static boolean basicSearch(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
