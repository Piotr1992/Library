package com.kodilla.library.service;

import lombok.RequiredArgsConstructor;
import com.kodilla.library.domain.Book;
import com.kodilla.library.repository.BookRepository;
import java.util.List;

@RequiredArgsConstructor
class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Override
    public List<Book> m1() {
        return repository.findAll();
    }

    @Override
    public void m2(Book book) {
        repository.save(book);
    }

    @Override
    public void m3(int index) {
        repository.deleteByIndex(index);
    }

}