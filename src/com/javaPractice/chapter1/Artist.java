package com.javaPractice.chapter1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by khan on 4/12/18.
 */

public class Artist {
  private String name;
  private List<Artist> members;
  private String nationality;

  public Artist() {
    // to avoid sonar major vulnerability.
  }

  public Artist(String name, List<Artist> members, String nationality) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(members);
    Objects.requireNonNull(nationality);
    this.name = name;
    this.members = members;
    this.nationality = nationality;
  }

  public Artist(String name, String nationality) {
    this(name, Collections.emptyList(), nationality);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Stream<Artist> getMembers() {
    return members.stream();
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Artist copy() {
    List<Artist> members = getMembers().map(Artist::copy).collect(toList());
    return new Artist(name, members, nationality);
  }
}
