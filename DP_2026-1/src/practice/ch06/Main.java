package practice.ch06;

import practice.ch06.framework.Manager;

public class Main {
    public static void main(String[] args) {
        // //원본을 이용
        // MessageBox mbox1 = new MessageBox('*')
        // //복제 객체를 이용
        
    //Manger를 이용
    Manager manager = new Manager();

    //원본 객체 생성 및 등록
    MessageBox mbox1 = new MessageBox('*');
    manager.register("star box", mbox1);

    UnderlinePen upen1 = new UnderlinePen('-');
    manager.register("underline pen", upen1);

    MessageBox mbox2 = new MessageBox('/');
    manager.register("slash box", mbox2);
    
    // 복제 객체를 얻어와서 사용
    manager.create("star box").use("Hello, World.");
    manager.create("underline pen").use("Hello, World.");
    manager.create("slash box").use("Hello, World.");

    }
}
