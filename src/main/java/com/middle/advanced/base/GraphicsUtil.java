package com.middle.advanced.base;

import org.springframework.util.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 基于Graphics的Java绘图
 **/
public class GraphicsUtil {

    public static void main(String[] args) {
        String path1 = "D://yuan3.png";
        String path2 = "D://touxiang1.jpg";
        String newPath = "D://result.png";
        GraphicsUtil graphicsUtil = new GraphicsUtil();
        graphicsUtil.saveMergeImage(path1,path2,newPath);
    }

    public static void writeRound() {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File("D://touxiang.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int width = 200;
        int height = 200;
        //创建图片对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        //基于图片打开绘画
        Graphics2D graphics2D = image.createGraphics();

        //绘图逻辑
        //绘制圆形
        graphics2D.setColor(Color.BLUE);
        graphics2D.setBackground(Color.RED);
//        Ellipse2D.Double ellipse = new Ellipse2D.Double(20, 20, 100, 100);
//        graphics2D.draw(ellipse);
        graphics2D.drawImage(bufferedImage, 0, 0, null);
        //绘图结束

        //处理绘图
        graphics2D.dispose();
        //将绘制好的图片写入图片
        try {
            ImageIO.write(image, "png", new File("D://yuan.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void setShapeRound() {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File("D://touxiang.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int with = 200;
        int height = 200;
        int diameter = 100;
        BufferedImage image = new BufferedImage(with, height, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D graphics2D = image.createGraphics();

        Ellipse2D.Double shape = new Ellipse2D.Double(0, 0, diameter, diameter);

        graphics2D.setClip(shape);

        graphics2D.drawImage(bufferedImage, 0, 0, null);

        graphics2D.dispose();

        try {
            ImageIO.write(image, "png", new File("D://yuan2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 绘制文字
     **/
    public static void FontImage() {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_4BYTE_ABGR);

        Graphics2D graphics2D = image.createGraphics();

        final Font logoFont = new Font("微软雅黑", Font.BOLD, 50);
        FontMetrics metrics = graphics2D.getFontMetrics(logoFont);

        //指定需要绘制的字符串
        String name = "老哥神经";

        //得到字符串宽度
        int logoW = metrics.stringWidth(name);

        //计算绘制原点
        int logoX = 0;

        int logoH = metrics.getHeight() / 2 - metrics.getDescent();

        //绘制文本框
        graphics2D.setPaint(Color.red);
        graphics2D.drawString(name, logoX, logoH);

        try {
            ImageIO.write(image, "png", new File("D://yuan3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public BufferedImage getImageFromLocal(String path) throws IOException {
        return ImageIO.read(new File(path));
    }

    private BufferedImage mergeImage(BufferedImage image1, BufferedImage image2) {
        if (!StringUtils.isEmpty(image1) && !StringUtils.isEmpty(image2)) {
            int with = image1.getWidth();
            int height = image1.getHeight();

            Graphics2D graphics2D = image2.createGraphics();
            graphics2D.drawImage(image1, 380, 412, with, height, null);
            graphics2D.dispose();
        }
        return image2;
    }

    private void writeImageToLocal(String newPath, BufferedImage image) throws IOException {
        ImageIO.write(image, "png", new File(newPath));
    }

    public void saveMergeImage(String path1, String path2, String newPath) {
        System.out.println("-------------合成图片开始--------------");
        try {
            writeImageToLocal(newPath, mergeImage(getImageFromLocal(path1), getImageFromLocal(path2)));
            System.out.println("-------------合成图片结束--------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
