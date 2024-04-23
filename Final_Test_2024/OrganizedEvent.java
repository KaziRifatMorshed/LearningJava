package Final_Test_2024;

public class OrganizedEvent extends Event {
    protected String organizer;

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public OrganizedEvent(String organizer, String Name, Date event_date, Place eventPlace) {
        super(Name, event_date, eventPlace);
        this.organizer = organizer;
    }
}
