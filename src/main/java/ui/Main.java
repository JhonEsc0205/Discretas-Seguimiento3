package ui;

public class Main {


    public static void main(String[] args) {
    System.out.println(se3_1());
    }

    public static String se3_1(){
        int[] L = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
        boolean first = true;
        String msg = "R = [";
        for (int i = 1; i < L.length; i++) {
            if (L[i] == L[i - 1]) {
                if (i == 1 || L[i] != L[i - 2]) {
                    if (!first) {
                        msg += ", ";
                    }
                    msg += L[i];
                    first = false;
                }
            }
        }

        msg += "]";
        return msg;
    }

    public static void se3_2(){

    }

    public static void se3_3(){

    }

}