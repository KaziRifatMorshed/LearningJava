package Final_Test_2024;

public class Place {
    protected String placeName, district;

    public Place(String placeName, String district) {
        this.placeName = placeName;
        this.district = district;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    @Override
    public String toString(){
        return this.placeName + ", " + this.district;
    }
}
