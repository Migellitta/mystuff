package SecodHandPriceViewer;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.out;

public class SecondHandPrice {
    public static void main(String[] args) {

//            Секонд хэнд в Минске на ул. Богдановича, 78
//            вс 37.90, пн 31.90, вт 20.90, ср 15.90, чт 10.90, пт 6.90, сб 41.90
        out.println("Здарова, Бро! Я - Ассистент для бич-закупок из секонда! Помогу тебе узнать че по чем сегодня!");
        DecimalFormat df = new DecimalFormat("###.##");
        int[] daysOfWeek = {1, 2, 3, 4, 5, 6, 7};
        double[] currentPrice = {37.90, 31.90, 20.90, 15.90, 10.90, 6.90, 41.90,};
        double weightAmount = 50;
        boolean f = false;
        do {
            try {
                Scanner in = new Scanner(System.in);
                out.print("Скажи насколько ты сильный и сколько собираешься потащить оттуда! \n");
                weightAmount = in.nextDouble();
                f = true;
                while (weightAmount > 50) {
                    out.println("Ну и зачем тебе так много, а? Бро оставь другим тоже. Давай до 50кг!");
                    weightAmount = in.nextDouble();
                }
                while (weightAmount < 0) {
                    out.println("Я то, конечно, мог бы посчитать это, Бро! Но давай ты введешь положительный вес!");
                    weightAmount = in.nextDouble();
                }
                in.close();
            } catch (Exception e) {
                if (!f) out.println("Чило введи сук, а не дичь всякую! Давай попробуем еще раз!");
            }
        } while (!f);


        double summary;
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 1 -> {
                summary = weightAmount * currentPrice[0];
                out.println(df.format(summary) + " рубаса! Если не к спеху, то спроси меня завтра! Будет дешевле!");
            }
            case 2 -> {
                summary = weightAmount * currentPrice[1];
                out.println(df.format(summary) + " рубаса! Если не к спеху, то спроси меня завтра! Будет дешевле!");
            }
            case 3 -> {
                summary = weightAmount * currentPrice[2];
                out.println(df.format(summary) + " рубаса! Если не к спеху, то спроси меня завтра! Будет дешевле!");
            }
            case 4 -> {
                summary = weightAmount * currentPrice[3];
                out.println(df.format(summary) + " рубаса! Если не к спеху, то спроси меня завтра! Будет дешевле!");
            }
            case 5 -> {
                summary = weightAmount * currentPrice[4];
                out.println(df.format(summary) + " рубаса! Если не к спеху, то спроси меня завтра! Будет дешевле!");
            }
            case 6 -> {
                summary = weightAmount * currentPrice[5];
                out.println(df.format(summary) + " рубаса! Поспеши, Бро! Сегодня самые лучшие цены! Завтра будет капец как дорого!");
            }
            case 7 -> {
                summary = weightAmount * currentPrice[6];
                out.println(df.format(summary) + " рубаса! Сегодня самый дорогой день! Завтра будет дешевле!");
            }
        }
        out.println("До встречи, Бро! Я устал, пойду адихать!");
    }

}
