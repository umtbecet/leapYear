import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı Giriniz : ");
        year = input.nextInt();

        if ((year %400 ==0) && (year %4 ==0) && (0 < year) ){
            System.out.println(year + " bir artık yıldır !");
        }else{
            System.out.println(year + " bir artık değildir !");
        }


    }
}





















