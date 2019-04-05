package indi.fleming.pocky.domain;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private String book_id;
    private String book_info;

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_info() {
        return book_info;
    }

    public void setBook_info(String book_info) {
        this.book_info = book_info;
    }
}
