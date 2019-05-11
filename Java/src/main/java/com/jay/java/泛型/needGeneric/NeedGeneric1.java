package com.jay.java.泛型.needGeneric;

/**
 * Author：Jay On 2019/5/9 16:06
 * <p>
 * Description: 为什么使用泛型
 */
public class NeedGeneric1 {

    private static int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static float add(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static double add(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    public static void main(String[] args) {
        NeedGeneric1.add(1, 2);
        NeedGeneric1.add(1f, 2f);
        NeedGeneric1.add(1d, 2d);
    }
}
