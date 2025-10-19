package com.sg.playground.controllers;

import com.sg.playground.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  @Autowired
  private BookService bookService;
}
