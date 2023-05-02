import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void home(){
        JFrame frame = new JFrame("GAS Business");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel(new ImageIcon("img/background1.png"));
        background.setBounds(0, 0, frame.getWidth(), frame.getHeight());

        JLabel label_date = new JLabel();
        label_date.setBounds(530,25,150,20);
        label_date.setFont(new Font("Century Gothic", Font.BOLD, 25));
        label_date.setForeground(Color.WHITE);

        JLabel label_time = new JLabel();
        label_time.setBounds(540,60,100,20);
        label_time.setFont(new Font("Century Gothic", Font.BOLD, 25));
        label_time.setForeground(Color.WHITE);

        JLabel label_user = new JLabel("User");
        label_user.setBounds(75,290,100,30);
        label_user.setFont(new Font("Century Gothic", Font.BOLD, 20));
        label_user.setForeground(Color.decode("#4E79D6"));

        JLabel label_pembelian = new JLabel("Pembelian");
        label_pembelian.setBounds(205,290,150,30);
        label_pembelian.setFont(new Font("Century Gothic", Font.BOLD, 20));
        label_pembelian.setForeground(Color.decode("#4E79D6"));

        JLabel label_laporan= new JLabel("Laporan");
        label_laporan.setBounds(375,290,150,30);
        label_laporan.setFont(new Font("Century Gothic", Font.BOLD, 20));
        label_laporan.setForeground(Color.decode("#4E79D6"));

        JLabel label_setting = new JLabel("Setting");
        label_setting.setBounds(545,290,100,30);
        label_setting.setFont(new Font("Century Gothic", Font.BOLD, 20));
        label_setting.setForeground(Color.decode("#4E79D6"));

        JButton button_user = new JButton(new ImageIcon("img/button1.png"));
        button_user.setContentAreaFilled(false);
        button_user.setBorderPainted(false);
        button_user.setOpaque(false);
        button_user.setBounds(30,150,134,134);
        button_user.addActionListener(e -> System.out.println("Tombol diklik"));

        JButton button_pembelian = new JButton(new ImageIcon("img/button1.png"));
        button_pembelian.setContentAreaFilled(false);
        button_pembelian.setBorderPainted(false);
        button_pembelian.setOpaque(false);
        button_pembelian.setBounds(190,150,134,134);
        button_pembelian.addActionListener(e -> System.out.println("Tombol diklik"));

        JButton button_laporan = new JButton(new ImageIcon("img/button1.png"));
        button_laporan.setContentAreaFilled(false);
        button_laporan.setBorderPainted(false);
        button_laporan.setOpaque(false);
        button_laporan.setBounds(350,150,134,134);
        button_laporan.addActionListener(e -> System.out.println("Tombol diklik"));

        JButton button_setting = new JButton(new ImageIcon("img/button1.png"));
        button_setting.setContentAreaFilled(false);
        button_setting.setBorderPainted(false);
        button_setting.setOpaque(false);
        button_setting.setBounds(510,150,134,134);
        button_setting.addActionListener(e -> System.out.println("Tombol diklik"));

        cursorButtonEffect(button_user);
        cursorButtonEffect(button_pembelian);
        cursorButtonEffect(button_laporan);
        cursorButtonEffect(button_setting);

        frame.add(button_user);
        frame.add(button_pembelian);
        frame.add(button_laporan);
        frame.add(button_setting);

        background.add(label_user);
        background.add(label_pembelian);
        background.add(label_laporan);
        background.add(label_setting);
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

    public static void cursorButtonEffect(JButton b){
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Set the button border to painted and the content area to filled when the mouse enters the button
                b.setIcon(new ImageIcon("img/button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Set the button border to not painted and the content area to not filled when the mouse exits the button
                b.setIcon(new ImageIcon("img/button1.png"));
            }
        });
    }

    public static void main(String[] args) {
        home();
    }
}
