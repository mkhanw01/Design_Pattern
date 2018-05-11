package com.javaPractice.chapter5;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by khan on 4/23/18.
 */
public class AlbumSalesCollector
    implements Collector<AlbumSale, AlbumSalesReport, AlbumSalesReport> {
  private static final Set<Characteristics> CHARACTERISTICS = new HashSet<>();

  static {
    CHARACTERISTICS.add(Characteristics.UNORDERED);
    CHARACTERISTICS.add(Characteristics.IDENTITY_FINISH);
  }

  @Override
  public Supplier<AlbumSalesReport> supplier() {
    return AlbumSalesReport::new;
  }

  @Override
  public BiConsumer<AlbumSalesReport, AlbumSale> accumulator() {
    return ((albumSalesReport, albumSale) -> albumSalesReport.acknowledgeSale(albumSale));
  }

  @Override
  public BinaryOperator<AlbumSalesReport> combiner() {
    return (left, right) -> left.merge(right);
  }

  @Override
  public Function<AlbumSalesReport, AlbumSalesReport> finisher() {
    return Function.identity();
  }

  @Override
  public Set<Characteristics> characteristics() {
    return CHARACTERISTICS;
  }
}
