/**
 * this java file defines a song class that has two String variables
 * and three methods.
 */
public class Song {
  private String title;//song's title
  private String artist;//song's artist

  /**
   * Constructor to initialize the basic information
   * @param title is the title of a song
   * @param artist is the artist of a song
   */
  public Song(String title,String artist){
    this.title = title;
    this.artist = artist;
  }

  /**
   * compare two objects if they have the same basic information
   * @param obj is the object that will be compared
   * @return true if the two objects has the same title and artist, else, return false
   */
  @Override
  public boolean equals(Object obj) {
    return obj.toString().equals(this.toString());
  }

  /**
   *
   * @return the object's basic information as a String type
   */
  @Override
  public String toString() {
    return title+" by "+artist;
  }
}
