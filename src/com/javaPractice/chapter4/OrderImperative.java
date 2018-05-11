package com.javaPractice.chapter4;

import com.javaPractice.chapter1.Album;
import com.javaPractice.chapter1.Track;

import java.util.List;

/**
 * Created by khan on 4/20/18.
 */
public class OrderImperative extends Order {

  public OrderImperative(List<Album> albums) {
    super(albums);
  }

  @Override
  public long countRenamingTime() {
    long count = 0;
    for (Album album : albums) {
      for (Track track : album.getTrackList()) {
        count += track.getLength();
      }
    }
    return count;
  }

  @Override
  public long countMusicians() {
    long count = 0;
    for (Album album : albums) {
      count += album.getMusiciansList().size();
    }
    return count;
  }

  @Override
  public long countTracks() {
    long count = 0;
    for (Album album : albums) {
      count += album.getTrackList().size();
    }
    return count;
  }
}
