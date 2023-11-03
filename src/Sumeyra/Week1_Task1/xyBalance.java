package Sumeyra.Week1_Task1;

public class xyBalance {

    public static void main(String[] args) {

        System.out.println(xyBalance("xxxyyy"));
    }

    public static boolean xyBalance(String str) {
        return (str.lastIndexOf('x') < str.lastIndexOf('y'))
                || (str.indexOf('x')==str.indexOf('y')) ;
    }

}

