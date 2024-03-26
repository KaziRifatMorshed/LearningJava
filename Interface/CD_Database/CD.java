package Interface.CD_Database;

public class CD extends Item {
    protected String artist;
    protected int num_track;

    public CD(String _name, String art_ist, int n_track, int time) {
        super(_name, time);
        num_track = n_track;
        artist = art_ist;
    }

    public String getArtist() {
        return artist;
    }

    public int getNum_track() {
        return num_track;
    }

    @Override
    public String toString() {
        return STR. "CD: \{ super.toString() }\tArtist: \{ artist }\n\tNumber of Tracks: \{ num_track }\n" ;
    }
}
