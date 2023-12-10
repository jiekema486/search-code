package com.utopia.mysort;

public class A04RecursionDemo1 {
    public static void main(String[] args) {
        //需求：有递归求5的阶乘

        //核心：
        //1.找出口
        //2.找规律
        System.out.println(getFactorialRecursion(5));
    }
    public static int getFactorialRecursion(int number){
        if(number == 1){
            return 1;
        }
        return number*getFactorialRecursion(number-1);
    }
}
