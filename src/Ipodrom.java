/**
 * Created by Ксюша on 05.12.2017.
 */
public class Ipodrom implements Runnable {
    Thread t;

    String horse_name;

    public  int getNumber() {
        return number;
    }


    int number;

    Ipodrom(String horse_name, int number) {
        this.horse_name = horse_name;
        this.number = number;

        t = new Thread(this, horse_name);

        t.start();
    }

    private int METRE_INCREMENT;
    private int MILISEC_INCREMENT;

    @Override
    public void run() {
        try {
            for (int i = 1000; i > 0; i -= METRE_INCREMENT) {

                METRE_INCREMENT = 30 + (int) (Math.random() * 50);
                MILISEC_INCREMENT = 300 + (int) (Math.random() * 400);
                //      System.out.println(horse_name + " " + i);
                Thread.sleep(MILISEC_INCREMENT);

            }
        } catch (InterruptedException e) {
            System.out.println("прерван" + horse_name);
        }
        System.out.println("завершен " + horse_name);
    }


}
