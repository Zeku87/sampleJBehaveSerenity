package basic.calc;

public class Calculator {

    public static float add(float a, float b) {
        return a+b;
    }

    public static float subtract(float a, float b) {
        return a-b;
    }

    public static float multiply(float a, float b) {
        return a*b;
    }

    public static float divide(float a, float b) {
        return a/b;
    }

    public static double squared(float a){
        return a*a;
    }

    public static double power(float a, float b) {
        return Math.pow(a,b);
    }

}