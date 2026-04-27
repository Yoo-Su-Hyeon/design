package practice.ch05;

public class Main {
    public static void main(String[] args){
        Singleton s1 = new Singleton();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);

        if(s2==s3){
            System.out.println("s2와 s3은 같은 singleton 객체입니다.");
        }else{
            System.out.println("s2와 s3은 다른 객체입니다.");
        }
        Singleton2 s4 = Singleton2.INSTANCE;
        s4.hello();


    }
}
