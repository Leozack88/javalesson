package dz;

public class dz2 {
    public static void main(String[] args) {

        //задача 1.1  4 переменные должны равняться 12 и быть записаны в 10/2/8/16-ых системах
        byte b1 = 12;                            //10
        byte b2 = 0b1100;                        //2
        byte b3 = 014;                           //8
        byte b4 = 0xC;                           //16

        //задача 1.2 4 переменные должны равняться 1300 и быть записаны в 10/2/8/16-ых системах
        short s1 = 1300;                         //10
        short s2 = 0b10100010100;                //2
        short s3 = 02424;                        //8
        short s4 = 0x514;                        //16

        //задача 1.3 4 переменные типа int должны равнять 0 и быть записаны в 10/2/8/16-ых системах
        int i1 = 0;                              //10
        int i2 = 0b0;                            //2
        int i3 = 00;                             //8
        int i4 = 0x0;                            //16

        //задача 1.4 4 переменные типа long должны равняться 123456789 и быть записаны в 10/2/8/16-ых системах
        long l1 = 123456789L;                     //10
        long l2 = 0b111010110111100110100010101L; //2
        long l3 = 0726746425L;                    //8
        long l4 = 0x75BCD15L;                     //16

        System.out.println("\n");
        System.out.println("-----------------------------------задача 1------------------------------------------");
        System.out.println("\n");
        // Заголовок таблицы
        System.out.printf("%-10s %-15s %-45s %-15s %-15s%n",
                "Type", "Dec", "Bin", "Oct", "Hex");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.printf("%-10s %-15d %-45s %-15s %-15s%n",
                "byte", b1, "0b1100", "014", "0xC");

        System.out.printf("%-10s %-15d %-45s %-15s %-15s%n",
                "short", s1, "0b10100010100", "02424", "0x514");

        System.out.printf("%-10s %-15d %-45s %-15s %-15s%n",
                "int", i1, "0b0", "00", "0x0");

        System.out.printf("%-10s %-15d %-45s %-15s %-15s%n",
                "long", l1, "0b111010110111100110100010101L", "0726746425L", "0x75BCD15L");

        // Задача 2
        float f1 = 3.14F;
        float f2 = 2.24552F;

        double d1 = 3.14;
        double d2 = 2.24552;

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println("\n");
        System.out.println("-----------------------------------задача 2------------------------------------------");
        System.out.println("\n");
        System.out.printf("%-10s %-10s %-15s%n", "Type", "Name", "Value");
        System.out.println("----------------------------------------");

        System.out.printf("%-10s %-10s %-15.6f%n", "float", "f1", f1);
        System.out.printf("%-10s %-10s %-15.6f%n", "float", "f2", f2);
        System.out.printf("%-10s %-10s %-15.6f%n", "double", "d1", d1);
        System.out.printf("%-10s %-10s %-15.6f%n", "double", "d2", d2);

        System.out.printf("%-10s %-10s %-10s%n", "boolean", "b01", bo1);
        System.out.printf("%-10s %-10s %-10s%n", "boolean", "b02", bo2);

        // Задача 3
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        char c4 = '\101';
        char c5 = '\n';

        System.out.println("\n");
        System.out.println("-----------------------------------задача 3------------------------------------------");
        System.out.println("\n");
        System.out.println("char: " + c1 + ", " + c2 + ", " + c3 + ", " + c4 + ", " + c5);
        System.out.println("c5 (newline): [" + c5 + "]");
        System.out.println("c5 code: " + (int)c5);
        System.out.println("'A' code: " + (int)c1);
    }
    }

