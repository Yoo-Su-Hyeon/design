package practice.ch01;


import java.util.Iterator; //인터페이스, 제너릭
import java.util.NoSuchElementException;  //예외 클래스, 반복자에서 더 이상 요소가 없을 때 예외를 던지는 데 사용

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf; // 자기가 돌아다닐 책꽂이를 저장하는 필드
        this.index = 0;
    }

    @Override
    public boolean hasNext() { // 다음 책이 있는지 여부를 반환하는 메서드
        if (index < bookShelf.getLength()) {
            return true; //꺼내올 책이 남아 있음
        } else {
            return false; //꺼내올 책이 더 이상 없음
        }
    }

    @Override
    public Book next() { //다음 책을 반환하는 메서드
        if (!hasNext()) {
            throw new NoSuchElementException(); //더 이상 책이 없으면 예외를 던짐
        }
        Book book = bookShelf.getBookAt(index); //반복자가 책꽂이에 접근
        index++;
        return book;
    }
}
