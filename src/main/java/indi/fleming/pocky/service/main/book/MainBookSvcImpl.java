package indi.fleming.pocky.service.main.book;

import indi.fleming.pocky.domain.Book;
import indi.fleming.pocky.mapper.Book.MainBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainBookSvcImpl implements MainBookSvc{

    @Autowired
    MainBookMapper mainBookMapper;

    @Override
    public List<Book> fetchBookList() {
        List<Book> bookList = mainBookMapper.selectBookList();
        return bookList;
    }

}
