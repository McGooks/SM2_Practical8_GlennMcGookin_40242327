package Music;

/**
 * This class is designed to be used as part of a digital music system
 * @version 0.1
 * @author unknown developer
 * @version 0.2
 * @author glennmcgookin B00565299
 */

public class MP3 {

    private final static int LOWER_RATING = 1;
    private final static int UPPER_RATING = 5;
    private final static int MIN_SONG_RANGE = 1;
    private final static int MAX_SONG_RANGE = 2500;
    private int ref;
    private String artist;
    private String songName;
    private int rating;
    private int songLength;

    /**
     * Reference Setter
     * @return Reference
     */
    public int getRef() {
        return ref;
    }

    /**
     * Reference Setter
     * @param ref Reference for the track
     * @throws IllegalArgumentException If less than zero then throw exception
     */
    public void setRef(int ref) throws IllegalArgumentException {
        if (ref >= 0) {
            this.ref = ref;
        } else {
            throw new IllegalArgumentException("Ref less than 0");
        }
    }

    /**
     * Artist Getter
     * @return Artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Artist Setter
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Song Name Getter
     * @return Song Name
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Song Name Setter
     * @param songName
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * Rating Getter
     * @return Rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Rating Setter
     * @param rating Song Rating Song Rating
     * @throws IllegalArgumentException If rating is outside of the Lower & Upper rating range as defined above
     */
    public void setRating(int rating) throws IllegalArgumentException {
        if ((rating >= LOWER_RATING) && (rating <= UPPER_RATING)) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between " + LOWER_RATING + " & " + UPPER_RATING);
        }
    }

    /**
     * Song Length Setter
     * @return Song Length
     */
    public int getSongLength() {
        return songLength;
    }

    /**
     * Song Length Setter
     * @param songLength Length of song
     * @throws IllegalArgumentException If length is outside of the Min & Max length range as defined above
     */
    public void setSongLength(int songLength) throws IllegalArgumentException {
        if(songLength >= MIN_SONG_RANGE && songLength <= MAX_SONG_RANGE) {
            this.songLength = songLength;
        } else {
            throw new IllegalArgumentException("Song Length must be between " + MIN_SONG_RANGE + " & " + MAX_SONG_RANGE);
        }
    }

    /**
     * MP3 constructor
     * @param ref Reference for the track (Cannot be less than '0')
     * @param artist Name of Artist
     * @param songName Name of Song
     * @param rating Song Rating Song Rating (Lower & Upper Rating Range defined above)
     * @deprecated on 05/03/2019 due to new requirement to include songLength
     */
    @Deprecated
    public MP3(int ref, String artist, String songName, int rating) {
        this.setRef(ref);
        this.artist = artist;
        this.songName = songName;
        this.setRating(rating);
    }

    /**
     * MP3 constructor
     * @param ref Reference for the track (Cannot be less than '0')
     * @param artist Name of Artist
     * @param songName Name of Song
     * @param rating Song Rating (Lower & Upper Rating Range defined above)
     * @param songLength Song Length of each song (Min & Max Range defined above)
     */

    public MP3(int ref, String artist, String songName, int rating, int songLength) {
        this.setRef(ref);
        this.artist = artist;
        this.songName = songName;
        this.setRating(rating);
        this.setSongLength(songLength);
    }

    /**
     * The default constructor
     */

    public MP3(){

    }


}
