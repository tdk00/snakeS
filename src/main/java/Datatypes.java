public class Datatypes {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i>=10) break;
        }

        System.out.print("*");
        System.out.println();





    }

    public static void main3(String[] args) {
        // ...
        boolean v1 = true;

        if (v1 == true) {
            System.out.println("V is true");
        } else {
            System.out.println("V is false");
        }
        // ...

        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x = 1");
                break;
            case 2:
                System.out.println("x = 2");
                break;
            case 5:
                System.out.println("x = 5");
                break;
            default:
                throw new IllegalArgumentException("Smth went wrong");
        }



    }


    public static void main2(String[] args) {
        int x = 1;
        long y = 1;
    }

    public static void main1(String[] args) {

        // integers (4)
        int size = 1;
        size = 100;
        long a1 = 1111_2222_3333L;
        long a2 = 111122223333L;
        byte b1;
        short s1;

        // floats (2)
        float f2 = 1.5F;
        double d2 = 1.5;

        // chars
        char c1 = 'A';
        char c2 = '2';
        // char c3 = "2";

        boolean b11 = true;
        boolean b12 = false;


    }
}
