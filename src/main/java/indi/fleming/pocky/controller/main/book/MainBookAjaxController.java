package indi.fleming.pocky.controller.main.book;

import indi.fleming.pocky.domain.Book;
import indi.fleming.pocky.service.main.book.MainBookSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainBookAjaxController {

    @Autowired
    MainBookSvc mainBookSvc;

    @RequestMapping(value = "/pejoy/main/book/fetchBookList", method = RequestMethod.POST)
    public List<Book> fetchBookList() {
        List<Book> bookList = mainBookSvc.fetchBookList();
        return bookList;
    }

}
