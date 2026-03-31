package practice.ch04;

import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        //(1) IDCard를 직접 만들어보자
        //IDCard c = new IDCard("유수현");
        //c.use();

        //(2)공장을 통해서 id카드를 만들어 보자
        IDCardFactory f = new IDCardFactory();
        Product c = f.create("유수현");
        c.use();
    }}

