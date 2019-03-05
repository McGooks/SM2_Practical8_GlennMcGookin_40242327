package Music;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MP3Test {

    @Before
    public void setUp() throws Exception {
        /* int LOWER_RATING = 0;
        int UPPER_RATING = 6;
        int ref;
        String artist;
        String songName;
        int rating;
        */
    }

    @Test
    public void testRefInRange() {
        int expected = 1;
        MP3 mp3 = new MP3();
        mp3.setRef(expected);
        int actual = mp3.getRef();
        assertEquals(expected, actual);
    }

    @Test
    public void testRefOutOfRange() {
        int expected = 0;
        MP3 mp3 = new MP3();
        mp3.setRef(expected);
        int actual = mp3.getRef();
        assertEquals(expected, actual);
    }


    @Test
    public void testArtist() {
        String expected = "Britney";
        MP3 mp3 = new MP3();
        mp3.setArtist(expected);
        String actual = mp3.getArtist();
        assertEquals(expected,actual);
    }


    @Test
    public void testSongName() {
        String expected = "Hit Me Baby One More Time";
        MP3 mp3 = new MP3();
        mp3.setSongName(expected);
        String actual = mp3.getSongName();
        assertEquals(expected,actual);
    }

    @Test
    public void getSongLengthInRange() {
        int expected = 100;
        MP3 mp3 = new MP3();
        mp3.setSongLength(expected);
        int actual = mp3.getSongLength();
        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void getSongLengthException() throws Exception {
        int num1;
        num1 = 2600;
        MP3 mp3 = new MP3();
        mp3.setSongLength(num1);
    }

    @Test
    public void getSongLengthException2()  {
        int num1;
        num1 = 2600;
        MP3 mp3 = new MP3();
        boolean thrown=false;
        try {
            mp3.setSongLength(num1);
        }catch(Exception e){
            thrown =true;
        }
        assertTrue(thrown);
        assertEquals(mp3.getSongLength(),0);
    }

    @Test
    public void getSongLength() {
    }

    @Test
    public void setSongLength() {

    }
}