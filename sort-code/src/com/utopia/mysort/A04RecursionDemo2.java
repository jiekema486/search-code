package com.utopia.mysort;

public class A04RecursionDemo2 {
    public static void main(String[] args) {
        //需求：利用递归求1-100之间的和

        //核心：
        //1.找出口
        //2.找规律

        System.out.println(getSum(100));
    }
    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number+getSum(number-1);
    }
}
