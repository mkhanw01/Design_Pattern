package com.javaPractice.chapter5;

/**
 * Created by khan on 4/23/18.
 */
public class AlbumSalesReport {
  public AlbumSalesReport() {
    // to avoid sonar major vulnerabilities
  }

  public AlbumSalesReport(AlbumSale albumSale) {
    this();
    acknowledgeSale(albumSale);
  }

  public void acknowledgeSale(AlbumSale albumSale) {
  }

  public AlbumSalesReport merge(AlbumSalesReport right) {
    return null;
  }
}
