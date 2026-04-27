package ch02.Sample1;
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string); //부모클래스(Banner)의 생성자 호출 
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
