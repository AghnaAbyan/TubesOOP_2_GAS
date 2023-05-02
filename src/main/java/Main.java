import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void home(){
        JFrame frame = new JFrame("GAS Business");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel(new ImageIcon("img/background1.png"));
        background.setBounds(0, 0, frame.getWidth(), frame.getHeight());

        JLabel label_date = new JLabel();
        label_date.setBounds(585,15,100,25);
        label_date.setFont(new Font("Century Gothic", Font.BOLD, 15));
        label_date.setForeground(Color.WHITE);
        JLabel label_time = new JLabel();
        label_time.setBounds(600,30,100,25);
        label_time.setFont(new Font("Century Gothic", Font.BOLD, 15));
        label_time.setForeground(Color.WHITE);

        background.add(label_time);
        background.add(label_date);
        frame.getContentPane().add(background);

        frame.setSize(700, 500);
        frame.setVisible(true);

        Thread thread = new Thread(() -> {
            while (true) {
                String date = getDate();
                String time = getTime();
                label_time.setText(time);
                label_date.setText(date);
                try {
                    Thread.sleep(1000); // set interval 1 detik
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception");
                }
            }
        });
        thread.start();
    }

    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }

    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(date);
    }

    public static void main(String[] args) {
        home();
    }
}
