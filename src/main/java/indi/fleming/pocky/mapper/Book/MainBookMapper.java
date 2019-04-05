package indi.fleming.pocky.mapper.Book;

import indi.fleming.pocky.domain.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainBookMapper {

    @Select("select * from book")
    List<Book> selectBookList();

}
