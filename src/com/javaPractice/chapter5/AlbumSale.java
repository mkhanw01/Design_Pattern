package com.javaPractice.chapter5;

import com.javaPractice.chapter1.Album;

/**
 * Created by khan on 4/23/18.
 */
public final class AlbumSale {

  private final Album album;
  private final Customer customer;
  private final long price;

  public AlbumSale(Album album, Customer customer, long price) {
    this.album = album;
    this.customer = customer;
    this.price = price;
  }

  public Album getAlbum() {
    return album;
  }

  public Customer getCustomer() {
    return customer;
  }

  public long getPrice() {
    return price;
  }
}
