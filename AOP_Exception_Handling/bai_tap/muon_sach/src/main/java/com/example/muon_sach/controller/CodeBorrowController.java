package com.example.muon_sach.controller;


import com.example.muon_sach.exception.NotAvailableException;
import com.example.muon_sach.exception.WrongCodeException;
import com.example.muon_sach.model.Book;
import com.example.muon_sach.model.Code;
import com.example.muon_sach.service.IBookService;
import com.example.muon_sach.service.ICodeService;
import com.example.muon_sach.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CodeBorrowController {
    @Autowired
    IBookService bookService;

    @Autowired
    ICodeService codeService;

    @Autowired
    IStatusService statusService;

    @GetMapping("/viewborrow")
    public String view(Model model) {
        List<Code> codeBorrowList = codeService.findAll();
        model.addAttribute("codeBorrowList", codeBorrowList);
        return "code/view_code_borrow";
    }

    @GetMapping("/returnCode")
    public String returnPage(Model model, @RequestParam Integer id) {

        Code code=codeService.findById(id);
        Book book=code.getBook();

        model.addAttribute("book", book);
        model.addAttribute("code",code);
        return "code/returnbook";
    }
    @PostMapping("/returnCode")
    public String returnBook(Model model,@ModelAttribute Book book,@ModelAttribute Code code) throws WrongCodeException, NotAvailableException {

        bookService.returnBook(book,code.getCode());
        return "redirect:books";
    }


}