package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by khan on 10/27/17.
 */
public class Codiaty {
  public Codiaty() {
  }

  public String solution(int N, String S, String T) {

    List<Johns> johns = parseShips(S, N * N);
    List<Place> hits = parseHits(T, N * N);

    int touched = 0, sunken = 0;
    Iterator<Johns> shipIt = johns.iterator();
    while (shipIt.hasNext()) {
      Johns current = shipIt.next();
      int touching = current.getHits(hits);
      if (touching > 0) {
        if (touching == current.getSize()) {
          sunken++;
        } else {
          touched++;
        }
      }
    }

    return "" + sunken + "," + touched;
  }

  public List<Place> parseHits(String hits, int maxHits) {
    List<Place> hitsList = new ArrayList<Place>(maxHits);
    String[] coords = hits.split(" ");
    for (String coord : coords) {
      hitsList.add(new Place(coord));
    }
    return hitsList;
  }

  public List<Johns> parseShips(String ships, int maxShips) {
    List<Johns> shipsList = new ArrayList<Johns>(maxShips);
    String[] shipsCoords = ships.split(", ");
    for (String shipCoord : shipsCoords) {
      String[] coords = shipCoord.split(" ");
      shipsList.add(new Johns(new Place(coords[0]), new Place(coords[1])));
    }
    return shipsList;
  }

  static public class Place {
    int x;
    int y;

    public Place(String coord) {
      x = (coord.toUpperCase().charAt(1)) - ('A');
      y = (coord.charAt(0)) - ('1');
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public boolean greaterOrEqual(Place other) {
      return x >= other.x && y >= other.y;
    }

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }

  static public class Johns {
    private Place topLeft;
    private Place bottomRight;

    public Johns(Place topLeft, Place bottomRight) {
      this.topLeft = topLeft;
      this.bottomRight = bottomRight;
    }

    public Place getTopLeft() {
      return topLeft;
    }

    public Place getBottomRight() {
      return bottomRight;
    }

    public int getSize() {
      return (Math.abs(topLeft.getX() - bottomRight.getX()) + 1)
          * (Math.abs(topLeft.getY() - bottomRight.getY()) + 1);
    }

    @Override
    public String toString() {
      return "(" + topLeft + ", " + bottomRight + ")";
    }

    public int getHits(List<Place> shots) {
      Iterator<Place> shotIt = shots.iterator();
      int hits = 0;
      while (shotIt.hasNext()) {
        Place shot = shotIt.next();
        if (shot.greaterOrEqual(topLeft)
            && bottomRight.greaterOrEqual(shot)) {
          hits++;
        }
      }
      return hits;
    }
  }
}
