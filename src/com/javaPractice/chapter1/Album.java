package com.javaPractice.chapter1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by khan on 4/13/18.
 */
public final class Album implements Performance {

  private String name;
  private List<Artist> musicians;
  private List<Track> tracks;


  public Album(String name, List<Artist> musicians, List<Track> tracks) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(musicians);
    Objects.requireNonNull(tracks);
    this.name = name;
    this.musicians = musicians;
    this.tracks = tracks;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Stream<Artist> getMusicians() {
    return musicians.stream();
  }

  public Stream<Track> getTrack() {
    return tracks.stream();
  }

  public Stream<Artist> getArtist() {
    return musicians.stream();
  }

  public List<Track> getTrackList() {
    return Collections.unmodifiableList(tracks);
  }

  public List<Artist> getMusiciansList(){
    return Collections.unmodifiableList(musicians);
  }

  public Artist getMainMusicians() {
    return musicians.get(0);
  }

  public Album copy() {
    List<Track> tracks = getTrack().map(Track::copy).collect(Collectors.toList());
    List<Artist> artists = getMusicians().map(Artist::copy).collect(Collectors.toList());
    return new Album(name, musicians, tracks);
  }

}
