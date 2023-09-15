package learning;

public class Scope {

    public static void newMethod() {
//        String msg = "This is my message";
//        System.out.println(msg);
        for (int i = 0; i < 4; i++) {
            int number = 10;
            number += i;
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        newMethod();
    }
}
