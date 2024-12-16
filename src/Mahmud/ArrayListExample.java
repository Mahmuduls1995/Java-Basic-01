package Mahmud;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        System.out.println(names.size());
        names.add("Mahmud");
        names.add("Rahim");
        names.add("Ali");
        names.add("Mohammad");
        names.add("Ali3");
        names.add("Ali4");
        System.out.println(names.size());
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.clear();
        System.out.println(names.size());


    }
}
