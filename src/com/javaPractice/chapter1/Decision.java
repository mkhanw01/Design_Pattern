package com.javaPractice.chapter1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by khan on 4/12/18.
 */
public class Decision {
  public static class Imperative {
    public Set<String> originsOfBands(Album album) {
      Set<String> nationalities = new HashSet<>();
      for(Artist artist: album.getMusiciansList()) {
        if(artist.getName().startsWith("The")) {
          String nationality = artist.getNationality();
          nationalities.add(nationality);
        }
      }
      return nationalities;
    }
  }

  public Set<String> originsOfBrands1(Album album) {
    Set<String>  nationalities =
        album.getMusicians().filter(artist -> artist.getName().startsWith("The"))
            .map(artist -> artist.getNationality()).collect(Collectors.toSet());
    return nationalities;
  }

public Set<String> originsOfbrands2(Album album) {
  List<Artist> musicians = album.getMusicians().collect(Collectors.toList());

  List<Artist> brands = musicians.stream()
      .filter(artist -> artist.getName().startsWith("The")).collect(Collectors.toList());

  Set<String> origins = brands.stream().map(artist -> artist.getNationality())
      .collect(Collectors.toSet());
  return origins;
}
}
