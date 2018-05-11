package com.javaPractice.chapter5;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by khan on 4/27/18.
 */
public class CollectorExpansions {
  public static final Collector<AlbumSale, ?, AlbumSalesReport> reportAlbumSales() {
    return Collectors.reducing(new AlbumSalesReport(), albumSale -> new AlbumSalesReport
        (albumSale),(left, right)-> left.merge(right));
  }
}
