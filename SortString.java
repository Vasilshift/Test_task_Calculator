import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        System.out.println("Please, enter the string ");
        Scanner text = new Scanner(System.in);
        String str = text.nextLine();
        try {
            if (str.equals("") || (!str.matches("(.*)1(.*)|(.*)2(.*)|(.*)3(.*)|(.*)4(.*)|(.*)5(.*)|(.*)6(.*)|(.*)7(.*)|(.*)8(.*)|(.*)9(.*)|(.*)I(.*)|(.*)V(.*)|(.*)X(.*)")) ) {
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println("Please, try again");
            e.printStackTrace();
        }
//  check string: CASE when string has ARAB digits
        boolean teststr = str.matches("(.*)1(.*)|(.*)2(.*)|(.*)3(.*)|(.*)4(.*)|(.*)5(.*)|(.*)6(.*)|(.*)7(.*)|(.*)8(.*)|(.*)9(.*)");
        if(teststr) {
            String items[] = str.split("\\s*(\\s|\\+|-|/|\\*)\\s*");
            int ent[] = new int[items.length];
            for (int i = 0; i < items.length; i++) {
                try {
                    ent[i] = Integer.parseInt(items[i]);
                } catch (NumberFormatException e) {
                    //Error
                }
            }
            int arr1 = ent[0];
            int arr2 = ent[1];


            System.out.println(Operation.operateArab(str, arr1, arr2));

        }
// Check string CASE when string is ROME digits
        else {
            String words[] = str.split("\\s*(\\s|\\+|-|/|\\*)\\s*");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
            }
            String a = words[0];
            String b = words[1];
            Operation.operateRome(str, a, b);
        }
    }
}
