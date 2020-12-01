import SecodHandPriceViewer.SecondHandPrice;
import coffeeMachine.coffeeMachine;
import randomNumberGenerator.RandomNumberGenerator;
import screenshootDownloader.ScreenshotDownloader;


public class Main {
    public static void main(String[] args) {
        coffeeMachine cm = new coffeeMachine();
        SecondHandPrice SHP = new SecondHandPrice();
        ScreenshotDownloader SsDl = new ScreenshotDownloader();
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.getNumbers(args);
    }

}
