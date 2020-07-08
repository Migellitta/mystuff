import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.System.out;

public class main
{
    public static void main(String[] args) {


        MyThread thread = new MyThread();
        thread.start();

    }
}