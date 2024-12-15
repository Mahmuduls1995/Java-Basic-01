package Mahmud;

public class Methods {

//    static int x = 5;
//    int y = 3;
//
//    public void case1() {
//        System.out.println(x+y);
//
//    }
//    public static void case2() {
//        Methods m = new Methods();
//        System.out.println(x+m.y);
//    }


    public static void sum(int a, int b) {
        System.out.println( "Sum : " + (a+b));

    }
    public static void sum(int a, int b, int c) {
        System.out.println( "Sum : " + (a+b+c));

    }

    public void multiplication(int a, int b, int c) {
        System.out.println("Multiplication : " + (a*b*c));
    }

    public static void main(String[] args) {
        sum( 10, 20);
        sum(30,50);
        sum(2,3,4);


        Methods m = new Methods();
        m.multiplication(1,2,3);
    }
}
