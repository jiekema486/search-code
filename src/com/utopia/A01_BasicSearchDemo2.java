package com.utopia;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引

        int[] arr = {131,127,147,81,103,23,7,79,81};
        int number = 81;
        int index = basicSearchIndex(arr, number);
        System.out.println(index);

        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引,需要考虑重复的可能性
        ArrayList arrayList = basicSearchArrayIndex(arr, number);
        System.out.println(arrayList);

    }
    public static ArrayList basicSearchArrayIndex(int[] arr, int number){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                arrayList.add(i);
            }
        }
        return arrayList;
    }


    public static int basicSearchIndex(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
}
