package screenshootDownloader;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.awt.Toolkit.getDefaultToolkit;

public class MyThread extends Thread {
    public BufferedImage image;
    public DbxClientV2 client;

    @Override
    public void run() {

        String ACCESS_TOKEN = ""; //Enter your access token
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        for (; ; ) {
            try {
                Robot robot = new Robot();
                Rectangle screenRect = new Rectangle(getDefaultToolkit().getScreenSize());
                BufferedImage image = robot.createScreenCapture(screenRect);
                ByteArrayOutputStream os = new ByteArrayOutputStream();

                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
                String date = format.format(new Date());

                ImageIO.write(image, "png", os);
                byte[] bytes = os.toByteArray();
                InputStream is = new ByteArrayInputStream(bytes);

                client.files().uploadBuilder("/" + date + ".png")
                        .uploadAndFinish(is);
                sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
