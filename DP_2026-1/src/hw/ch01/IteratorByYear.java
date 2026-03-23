package hw.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteratorByYear implements Iterator<Book> {

    private List<Book> sortedList;
    private int index;

    public IteratorByYear(BookShelf bookShelf) {
        sortedList = new ArrayList<>();

        // BookShelf에 있는 책들 복사
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedList.add(bookShelf.getBookAt(i));
        }

        // 출판 연도 기준으로 내림차순 정렬
        sortedList.sort((a, b) -> b.getYear() - a.getYear());

        index = 0;
    }
    
    //hasNext와 next는 정렬된 리스트에서 요소를 반환
    @Override
    public boolean hasNext() {
        return index < sortedList.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return sortedList.get(index++);
    }
}