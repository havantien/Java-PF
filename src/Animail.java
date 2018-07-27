import java.util.Scanner;

public class Animail {
    public static void main(String[] args) {
        System.out.println(" nhap id hoac ten con vat");
        Scanner sc = new Scanner(System.in);
//        int id  = sc.nextInt();
//         final  int MONKYE = 3;
//         final  int RABIT = 8;
//         if( id == MONKYE){
//             System.out.println(" cho an chuoi");
//         } else if( id == RABIT) {
//             System.out.println(" cho an co");
//        } else {
//             System.out.println("cho an cam");
//         }
        String name = sc.next();
        final String IS_OF_MONKY = "khi";
        final String IS_OF_RABIT = "tho";
        switch (name){
            case IS_OF_MONKY:
                System.out.println("cho an chuoi");
                break;
            case IS_OF_RABIT:
                System.out.println(" cho an co");
             default:
                 System.out.println(" cho an cam");

        }


    }
}
