package com.javaPractice.chapter4;

import com.javaPractice.chapter1.Album;

import java.util.List;

/**
 * Created by khan on 4/20/18.
 */
public class OrderStream extends Order {

  public OrderStream(List<Album> albums) {
    super(albums);
  }

  @Override
  public long countRenamingTime() {
    return albums.stream().mapToLong(value -> value.getTrack()
        .mapToLong(track -> track.getLength())
        .sum()).sum();
  }

  @Override
  public long countMusicians() {
    return albums.stream()
        .mapToLong(value -> value.getMusicians().count()).sum();
  }

  @Override
  public long countTracks() {
    return albums.stream()
        .mapToLong(value -> value.getTrack().count()).sum();
  }
}
