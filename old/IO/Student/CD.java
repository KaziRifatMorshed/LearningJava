package IO.Student;

//import Cd_Video.*;

public class CD{
    private String title;
    private String artist;
    private int numberOfTracks;
    private int playingTime;


   public CD(String theTitle, String theArtist, int tracks, int time)  {
        title = theTitle;
        playingTime = time;
        artist = theArtist;
        numberOfTracks = tracks;
    }

   public String toString()  {
     String result = title+" "+artist+" "+ playingTime 
             + " "+ numberOfTracks ;
        return result;
    }
}