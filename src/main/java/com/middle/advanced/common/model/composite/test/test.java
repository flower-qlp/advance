package com.middle.advanced.common.model.composite.test;

public class test {
    public static void main(String[] args) {
        Goods nativeGoods = new Goods("婺源特产", 7.9f, 2);
        Goods map = new Goods("婺源地图", 9.9f, 1);
        Bags redBag = new Bags("红色小袋子");
        redBag.add(nativeGoods);
        redBag.add(map);

        Goods banana = new Goods("韶关香藉", 68f, 2);
        Goods blackTea = new Goods("韶关红茶", 180f, 3);
        Bags whiteBag = new Bags("白色小袋子");
        whiteBag.add(banana);
        whiteBag.add(blackTea);

        Bags middleBag = new Bags("白色小袋子");
        Goods chinaware = new Goods("景德镇瓷器", 380f, 1);
        middleBag.add(redBag);
        middleBag.add(chinaware);

        Bags bigBag = new Bags("大袋子");
        Goods shoe = new Goods("李宁牌运动鞋", 198f, 1);
        bigBag.add(middleBag);
        bigBag.add(whiteBag);
        bigBag.add(shoe);

        bigBag.show();


    }
}
