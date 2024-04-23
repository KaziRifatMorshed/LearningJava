package Final_Test_2024;

public class Event {
    protected String Name;
    protected Date event_date;
    protected Place eventPlace;

    public Event(String Name, Date event_date, Place eventPlace) {
        this.Name = Name;
        this.event_date = event_date;
        this.eventPlace = eventPlace;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getD() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public Place getP() {
        return eventPlace;
    }

    public void setEventPlace(Place eventPlace) {
        this.eventPlace = eventPlace;
    }
}
