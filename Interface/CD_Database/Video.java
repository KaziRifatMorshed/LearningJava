package Interface.CD_Database;

public class Video extends Item {
    protected String theDirector;

    public Video(String name, String d, int time) {
        super(name, time);
        theDirector = d;
    }

    public String getTheDirector() {
        return theDirector;
    }

    @Override
    public String toString() {
        return STR. "Video: \{ super.toString() },\tDirector: \{ theDirector }\n" ;
    }
}
