package screenshootDownloader;


public class ScreenshotDownloader {


    public void runSD() {

        MyThread thread = new MyThread();
        thread.start();
    }


}