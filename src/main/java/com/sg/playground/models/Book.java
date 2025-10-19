package com.sg.playground.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record Book(
  UUID id,
  String title,
  String authorName,
  LocalDate publicationDate,
  int categoryId,
  BigDecimal price
) {}
