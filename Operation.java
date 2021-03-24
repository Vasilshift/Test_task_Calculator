import java.util.Arrays;
import java.util.Scanner;
public class Operation {

    public static int operateArab(String str, int arr1, int arr2) {
        int plust = str.indexOf('+');
        int minus = str.indexOf('-');
        int divide = str.indexOf('/');
        int multip = str.indexOf('*');
        int total = 0;
        if (plust != -1) {
            total = arr1 + arr2;
        }
        if (minus != -1) {
            total = arr1 - arr2;
        }
        if (divide != -1) {
            total = arr1 / arr2;
        }
        if (multip != -1) {
            total = arr1 * arr2;
        }

        return total;
    }

    public static void operateRome(String str, String a, String b ) {

        int x = 0, y = 0;

        if ("I" == a.intern())             x = 1;
        if ("II" == a.intern())            x = 2;
        if ("III" == a.intern())           x = 3;
        if ("IV" == a.intern())            x = 4;
        if ("V" == a.intern())             x = 5;
        if ("VI" == a.intern())            x = 6;
        if ("VII" == a.intern())           x = 7;
        if ("VIII" == a.intern())          x = 8;
        if ("IX" == a.intern())            x = 9;
        if ("X" == a.intern())             x = 10;
        if ("I" == b.intern())             y = 1;
        if ("II" == b.intern())            y = 2;
        if ("III" == b.intern())           y = 3;
        if ("IV" == b.intern())            y = 4;
        if ("V" == b.intern())             y = 5;
        if ("VI" == b.intern())            y = 6;
        if ("VII" == b.intern())           y = 7;
        if ("VIII" == b.intern())          y = 8;
        if ("IX" == b.intern())            y = 9;
        if ("X" == b.intern())             y = 10;

        int total = operateArab(str, x, y);
        String c1 = Integer.toString(total);
        if (total == 1)   c1 = "I";
        if (total == 2)   c1 = "II";
        if (total == 3)   c1 = "III";
        if (total == 4)   c1 = "IV";
        if (total == 5)   c1 = "V";
        if (total == 6)   c1 = "VI";
        if (total == 7)   c1 = "VII";
        if (total == 8)   c1 = "VIII";
        if (total == 9)   c1 = "IX";
        if (total == 10)  c1 = "X";
        if (total == 11)  c1 = "XI";
        if (total == 12)  c1 = "XII";
        if (total == 13)  c1 = "XIII";
        if (total == 14)  c1 = "XIV";
        if (total == 15)  c1 = "XV";
        if (total == 16)  c1 = "XVI";
        if (total == 17)  c1 = "XVII";
        if (total == 18)  c1 = "XVIII";
        if (total == 19)  c1 = "XIX";
        if (total == 20)  c1 = "XX";
        if(total == 21) c1 = "XXI";
        if(total == 22) c1 = "XXII";
        if(total == 23) c1 = "XXIII";
        if(total == 24) c1 = "XXIV";
        if(total == 25) c1 = "XXV";
        if(total == 26) c1 = "XXVI";
        if(total == 27) c1 = "XXVII";
        if(total == 28) c1 = "XXVIII";
        if(total == 29) c1 = "XXIX";
        if(total == 30) c1 = "XXX";
        if(total == 31) c1 = "XXXI";
        if(total == 32) c1 = "XXXII";
        if(total == 33) c1 = "XXXIII";
        if(total == 34) c1 = "XXXIV";
        if(total == 35) c1 = "XXXV";
        if(total == 36) c1 = "XXXVI";
        if(total == 37) c1 = "XXXVII";
        if(total == 38) c1 = "XXXVIII";
        if(total == 39) c1 = "XXXIX";
        if(total == 40) c1 = "XL";
        if(total == 41) c1 = "XLI";
        if(total == 42) c1 = "XLII";
        if(total == 43) c1 = "XLIII";
        if(total == 44) c1 = "XLIV";
        if(total == 45) c1 = "XLV";
        if(total == 46) c1 = "XLVI";
        if(total == 47) c1 = "XLVII";
        if(total == 48) c1 = "XLVIII";
        if(total == 49) c1 = "XLIX";
        if(total == 50) c1 = "L";
        if(total == 51) c1 = "LI";
        if(total == 52) c1 = "LII";
        if(total == 53) c1 = "LIII";
        if(total == 54) c1 = "LIV";
        if(total == 55) c1 = "LV";
        if(total == 56) c1 = "LVI";
        if(total == 57) c1 = "LVII";
        if(total == 58) c1 = "LVIII";
        if(total == 59) c1 = "LIX";
        if(total == 60) c1 = "LX";
        if(total == 61) c1 = "LXI";
        if(total == 62) c1 = "LXII";
        if(total == 63) c1 = "LXIII";
        if(total == 64) c1 = "LXIV";
        if(total == 65) c1 = "LXV";
        if(total == 66) c1 = "LXVI";
        if(total == 67) c1 = "LVVII";
        if(total == 68) c1 = "LVVIII";
        if(total == 69) c1 = "LVIX";
        if(total == 70) c1 = "LXX";
        if(total == 71) c1 = "LXXI";
        if(total == 72) c1 = "LXXII";
        if(total == 73) c1 = "LXXII";
        if(total == 74) c1 = "LXXIV";
        if(total == 75) c1 = "LXXV";
        if(total == 76) c1 = "LXXVI";
        if(total == 77) c1 = "LXXVII";
        if(total == 78) c1 = "LXXVIII";
        if(total == 79) c1 = "LXXIV";
        if(total == 80) c1 = "LXXX";
        if(total == 81) c1 = "LXXXI";
        if(total == 82) c1 = "LXXXII";
        if(total == 83) c1 = "LXXXIII";
        if(total == 84) c1 = "LXXXIV";
        if(total == 85) c1 = "LXXXV";
        if(total == 86) c1 = "LXXXVI";
        if(total == 87) c1 = "LXXXVII";
        if(total == 88) c1 = "LXXXVIII";
        if(total == 89) c1 = "LXXXVIX";
        if(total == 90) c1 = "XC";
        if(total == 91) c1 = "XCI";
        if(total == 92) c1 = "XCII";
        if(total == 93) c1 = "XCIII";
        if(total == 94) c1 = "XCIV";
        if(total == 95) c1 = "XCV";
        if(total == 96) c1 = "XCVI";
        if(total == 97) c1 = "XCVII";
        if(total == 98) c1 = "XCVIII";
        if(total == 99) c1 = "XCIX";
        if(total == 100) c1 = "C";

        System.out.println(c1);

    }

}
