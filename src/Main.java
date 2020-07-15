import SecodHandPriceViewer.SecondHandPrice;
import screenshootDownloader.ScreenshotDownloader;
import кофемашина.coffeeMachine;


public class Main {
    public static void main(String[] args) {
        ScreenshotDownloader SsDl = new ScreenshotDownloader();
        coffeeMachine cm = new coffeeMachine();
        SecondHandPrice SHP = new SecondHandPrice();
        SHP.run();
    }
}
