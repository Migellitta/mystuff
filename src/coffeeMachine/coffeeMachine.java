package coffeeMachine;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;


public class coffeeMachine {
    public void  runCM() {

        out.println("Кофе-машина");


        //TODO: read this number from console
        Scanner in = new Scanner(System.in);
        out.print("Внесите сумму \n");
        int moneyAmount = in.nextInt();
        in.close();
        int[] drinkPrices = {150, 80, 20, 55};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};


        //TODO: not enough money situation
        boolean f = false;
        for (int i = 0; i < drinkPrices.length; i = i + 1) {
            if (moneyAmount >= drinkPrices[i]) {
                f = true;
                out.println("Вы можете купить " + drinkNames[i]);
            }
        }
        if (!f) out.println("У вас недостаточно средств.");


        //TODO: print current date and time: 20200706_210715
        //  via SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println("Дата: " + dateFormat.format(new Date()));


        //TODO: get screenshot and print its size
        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = robot.createScreenCapture(screenRect);
            out.println(image.getWidth() + "х" + image.getHeight());
        } catch (AWTException ignored) {
        }
        //TODO: code and console screenshots => telegram chat with #yes
    }

}
