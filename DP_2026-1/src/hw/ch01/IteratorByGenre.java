package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorByGenre implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index;
    private String genre;

    public IteratorByGenre(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
        moveToNextGenre();
    }
    //조건에 맞는 다음 책으로 이동
    private void moveToNextGenre() {
        while (index < bookShelf.getLength()){
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre()!=null && book.getGenre().equals(genre)){
                break;
            }
            index++;
        }
}
    //다음에 꺼낼 수 있는 책이 남아있는 지 확인
    @Override
    public boolean hasNext(){
        return index < bookShelf.getLength();
    }
    @Override
    public Book next(){
        //더이상 요소가 없으면 예외 발생
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        //현재 위치의 책 반환
        Book book = bookShelf.getBookAt(index);
        //다음 위치로 이동
        index++;
        //다음 조건에 맞는 책 위치로 이동
        moveToNextGenre();
        return book;
    }
}


