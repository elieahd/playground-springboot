package com.sg.playground.services;

import com.sg.playground.repositories.BookInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookInventory inventory;

  @Autowired
  public BookService(BookInventory inventory) {
    this.inventory = inventory;
  }
}
