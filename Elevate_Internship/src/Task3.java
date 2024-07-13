import java.util.Date;
import java.text.SimpleDateFormat;

public class Task3 {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            Date date = new Date();
            String currentTime = formatter.format(date);
            System.out.print("\rCurrent Time: " + currentTime);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}

