package callbacks;

import java.util.function.Consumer;

public class CallBacks {

    public static void main(String[] args) {

        hello("Xiao", null, value -> {
            System.out.println("no lastName provided for " + value);
        });

        hello("Xiao", null, () -> {
            System.out.println("no lastName provided.");
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callBack) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        }else {
            callBack.accept(firstName);
        }
    }

    static void hello(String firstName, String lastName, Runnable callBack) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        }else {
            callBack.run();
        }
    }
}
