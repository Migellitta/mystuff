import SecodHandPriceViewer.SecondHandPrice;
import randomNumberGenerator.RandomNumberGenerator;
import screenshootDownloader.ScreenshotDownloader;
import coffeeMachine.coffeeMachine;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        coffeeMachine cm = new coffeeMachine();
        SecondHandPrice SHP = new SecondHandPrice();
        ScreenshotDownloader SsDl = new ScreenshotDownloader();
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.getNumbers(args);
    }

}
