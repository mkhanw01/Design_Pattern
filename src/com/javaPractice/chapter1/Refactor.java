package com.javaPractice.chapter1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by khan on 4/13/18.
 */
public class Refactor {

  public static interface LongTrackFinder {
    public Set<String> findLogTracks(List<Album> albums);
  }


  public static class Step0 implements LongTrackFinder {

    /**
     * find track whose trackLength is more than some constant number.
     *
     * @param albums
     * @return
     */
    @Override
    public Set<String> findLogTracks(List<Album> albums) {

      Set<String> trackNames = new HashSet<>();
      for (Album album : albums) {
        for (Track track : album.getTrackList()) {
          if (track.getLength() > 60) {
            String name = track.getName();
            trackNames.add(name);
          }
        }
      }
      return trackNames;
    }
  }


  public static class Step02 implements LongTrackFinder {

    public Set<String> findLogTracks(List<Album> albums) {
      Set<String> trackNames = new HashSet<>();
      albums.stream().forEach(album -> {
        album.getTrack().forEach(track -> {
          if (track.getLength() > 60) {
            trackNames.add(track.getName());
          }
        });
      });
      return trackNames;
    }
  }


  public static class Step03 implements LongTrackFinder {

    @Override
    public Set<String> findLogTracks(List<Album> albums) {
      Set<String> trackNames = new HashSet<>();
      albums.stream().forEach(album -> {
        album.getTrack().filter(track -> track.getLength() > 60).map(track -> track.getName())
            .forEach(name -> trackNames.add(name));
      });
      return trackNames;
    }
  }


  public static class Step04 implements LongTrackFinder {

    @Override
    public Set<String> findLogTracks(List<Album> albums) {
      Set<String> trackNames = new HashSet<>();
      albums.stream().flatMap(album -> album.getTrack().filter(track -> track.getLength() > 60))
          .map(track -> track.getName()).forEach(name -> trackNames.add(name));

      return trackNames;
    }
  }

  public static class Step05 implements LongTrackFinder {

    @Override
    public Set<String> findLogTracks(List<Album> albums) {

      return albums.stream().
          flatMap(album -> album.getTrack())
          .filter(track -> track.getLength() > 60)
          .map(track -> track.getName())
          .collect(Collectors.toSet());
    }
  }
}
