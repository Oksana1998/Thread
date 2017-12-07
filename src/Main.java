import java.util.Scanner;

/**
 * Created by Ксюша on 05.12.2017.
 */
public class Main {


    public static void main(String[] args) {


        Ipodrom horse3 = new Ipodrom("Chernich", 3);
        Ipodrom horse2 = new Ipodrom("Belash", 2);

        Ipodrom horse1 = new Ipodrom("Pushistic", 1);
        System.out.println("Pushistic - 1");
        System.out.println("Belash - 2");
        System.out.println("Chernich - 3");

        System.out.println("Ваши ставки, Господа");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        System.out.println("Лощадь первая пошла" + " " + horse1.t.isAlive());
        System.out.println("Лощадь вторая пошла" + " " + horse2.t.isAlive());
        System.out.println("Лощадь третья пошла" + " " + horse3.t.isAlive());
        
        while (horse1.t.isAlive() && horse2.t.isAlive() && horse3.t.isAlive()) {

        }

        int nWinner;

        if (!horse1.t.isAlive()) {
            nWinner = horse1.getNumber();

            System.out.println("Winner" + " " + horse1.getNumber());
            if (nWinner == choose) {
                System.out.println("Ставка сыграла");
            } else {
                System.out.println("Вы проиграли ");
            }
        } else if (!horse2.t.isAlive()) {

            nWinner = horse2.getNumber();

            System.out.println("Winner" + " " + horse2.getNumber());
            if (nWinner == choose) {
                System.out.println("Ставка сыграла");
            } else {
                System.out.println("Вы проиграли ");
            }
        } else if (!horse3.t.isAlive()) {

            nWinner = horse3.getNumber();
            System.out.println("Winner" + horse3.getNumber());
            if (nWinner == choose) {
                System.out.println("Ставка сыграла");
            } else {
                System.out.println("Вы проиграли ");
            }
        }


    }
}
