package com.kodilla.library.service;

import com.kodilla.library.domain.Book;
import java.util.List;

public interface BookService {
    List<Book> m1();
    void m2(Book book);
    void m3(int index);
}