package Mahmud;

class GrandFather{
    static String house="village";
    static double balance=10000;
}

class Father extends GrandFather{
    static String car="Toyota";
    static double balance=10000;
}

public class SingleInheritance extends Father {

    public static void main(String[] args) {

      System.out.println(car);
        System.out.println(house);


    }
}
