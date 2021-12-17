package com.example.muon_sach.service;





import com.example.muon_sach.exception.NotAvailableException;
import com.example.muon_sach.exception.WrongCodeException;
import com.example.muon_sach.model.Book;
import com.example.muon_sach.model.Code;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void save(Book book);

    Book findById(Integer id);

    void borrow(Book book, Integer usedCode);

    void delete(Integer id);

    Code getNextAvailableCode(Book book) throws NotAvailableException;

    void returnBook(Book book, Integer returnCode) throws NotAvailableException, WrongCodeException;

    public boolean checkNoUsedCode(Book book);
}
