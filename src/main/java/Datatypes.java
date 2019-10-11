import java.util.Random;

public class Datatypes {

    public static void main5(String[] args) {
        // type widening
        byte b1 = 5; // 1 byte
        int i1 = b1; // 4 bytes

        // type narrowing
        int i5 = 555;
        byte b2 = (byte)i5;
        byte b3 = 555 % 256;
        byte b4 = 555 & 0xFF;
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        float f1 = 4.5F;
        int f2 = (int) f1;
        // b2 = "Hello";

    }

    public static void main4(String[] args) {

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

    // arrays
    public static void main(String[] args) {
        int[] a = new int[10];
        // 0 .. a.length-1
        int l = a.length; //10
        int a0 = a[0];
        int a9 = a[9];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
            a[i] = r.nextInt(100);
        }

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }


    }
}
