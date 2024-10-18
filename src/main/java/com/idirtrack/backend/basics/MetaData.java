package com.idirtrack.backend.basics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MetaData {
  private int currentPage;
  private int totalPages;
  private int size;
  private long totalElements;
}