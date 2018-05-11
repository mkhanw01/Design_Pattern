package com.javaPractice.chapter1;

import java.util.stream.Stream;

/**
 * Created by khan on 4/13/18.
 */
public interface Performance {
  String getName();

  Stream<Artist> getMusicians();

  default Stream<Artist> getAllMusicians() {
    return getMusicians().flatMap(artist -> {
      return Stream.concat(Stream.of(artist), artist.getMembers());
    });
  }
}
