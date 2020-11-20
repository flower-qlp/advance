package com.middle.advanced.utils;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.util.StringUtils;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * @author
 */
public class ImageUtil {
    private static String picPath = "http://attachmentgw.trinasolar.com/fs/cn/5c500f3fac2dd1000f7f5b0b/20190328/9CE9306784204A57ACFA8857784CA644.jpg";


    public InputStream findInputStreamByUrl(String path) {
        InputStream inputStream = null;
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            inputStream = connection.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    /**
     * @param path   图片地址
     * @param fileEx 图片后缀
     **/
    public Boolean compressPic(String path, String fileEx) {

        InputStream inputStream = findInputStreamByUrl(path);

        ImageWriter imageWriter;
        ImageWriteParam imageWriteParam;
        long start = System.currentTimeMillis();
        //修改图片的格式
        imageWriter = ImageIO.getImageWritersByFormatName(fileEx).next();
        imageWriteParam = imageWriter.getDefaultWriteParam();

        imageWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        //指定压缩成都
        imageWriteParam.setCompressionQuality((float) 0.5);

        try {
            //read 读完之后 流会被关闭
            ColorModel colorModel = ImageIO.read(inputStream).getColorModel();
            //指定压缩使用的色彩模式
            imageWriteParam.setDestinationType(new ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(16, 16)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("11111消耗时间：" + ((double) end1 - (double) start) / 1000 + "秒;");
        try {
            //读取完 会close 流
            BufferedImage bufferedImage = ImageIO.read(findInputStreamByUrl(path));
            FileOutputStream outputStream = new FileOutputStream(getFileName(null));

            imageWriter.reset();
            //先指定输出
            imageWriter.setOutput(ImageIO.createImageOutputStream(outputStream));

            //对指定 write
            imageWriter.write(null, new IIOImage(bufferedImage, null, null), imageWriteParam);

            bufferedImage.flush();
            outputStream.flush();
            outputStream.close();
            imageWriter.dispose();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 指定大小进行缩放
     */
    public void scaleBySize(String path) {

        try {
            Thumbnails.of(findInputStreamByUrl(path))
                    .size(100, 100)
                    .toFile(getFileName(null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 指定大小比例缩放
     */
    public void scaleByScale(String path) {

        try {
            Thumbnails.of(findInputStreamByUrl(path))
                    .scale(0.25)
                    .toFile(getFileName(null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFileName(String fileEx) {
        if (StringUtils.isEmpty(fileEx)) {
            fileEx = "jpg";
        }
        String resourcePic = "D:\\" + (int) (Math.random() * 1000000) + "." + fileEx;
        return resourcePic;
    }


    public static void main(String[] args) {
        //new ImageUtil().compressPic(picPath, "jpg");
        //new ImageUtil().scaleByScale(picPath);

        try {
            FileOutputStream outputStream=new FileOutputStream(picPath);
            OutputStream out=outputStream;

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
