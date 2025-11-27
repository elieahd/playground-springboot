package com.sg.playground.repositories;

import com.sg.playground.models.Book;
import jakarta.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class BookInventory {

  private final Map<UUID, Book> books = new ConcurrentHashMap<>();

  public Collection<Book> findAll() {
    return Collections.unmodifiableCollection(books.values());
  }

  public Optional<Book> findById(UUID id) {
    return Optional.ofNullable(books.get(id));
  }

  public Book save(Book book) {
    if (book.id() == null) {
      book = new Book(
        UUID.randomUUID(),
        book.title(),
        book.authorName(),
        book.publicationDate(),
        book.categoryId(),
        book.price()
      );
    }
    books.put(book.id(), book);
    return book;
  }

  public boolean delete(UUID id) {
    return books.remove(id) != null;
  }

  public void clear() {
    books.clear();
  }

  @PostConstruct
  private void seed() {
    save(
      new Book(
        UUID.randomUUID(),
        "Effective Java",
        "Joshua Bloch",
        LocalDate.of(2018, 1, 6),
        1,
        new BigDecimal("45.00")
      )
    );
    save(
      new Book(
        UUID.randomUUID(),
        "Clean Code",
        "Robert C. Martin",
        LocalDate.of(2008, 8, 1),
        1,
        new BigDecimal("40.00")
      )
    );
    save(
      new Book(
        UUID.randomUUID(),
        "The Pragmatic Programmer",
        "Andrew Hunt",
        LocalDate.of(1999, 10, 20),
        1,
        new BigDecimal("42.50")
      )
    );
  }
}
