package com.kodilla.library.controller;

import lombok.RequiredArgsConstructor;
import com.kodilla.library.domain.BookDto;
import com.kodilla.library.mapper.BookMapper;
import com.kodilla.library.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/library")
class BookController {

    private final BookService service;

    @GetMapping
    public List<BookDto> m1() {
        return BookMapper.toBookDtoList(service.m1());
    }

    @PostMapping
    public void m2(@RequestBody BookDto bookDto) {
        service.m2(BookMapper.toBook(bookDto));
    }

    @DeleteMapping(path = "/{index}")
    public void m3(@PathVariable("index") int index) {
        service.m3(index);
    }

}