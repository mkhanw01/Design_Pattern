package com.javaPractice.chapter4;

import com.javaPractice.chapter1.Album;

import java.util.List;

/**
 * Created by khan on 4/20/18.
 */
public abstract class Order {

  protected final List<Album> albums;

  public Order(List<Album> albums) {
    this.albums = albums;
  }

  public abstract long countRenamingTime();

  public abstract long countMusicians();

  public abstract long countTracks();

}
