package IO.Student_database;

import java.io.Serializable;

public class _Address implements Serializable {
    protected String road, upazilla, zilla;

    public _Address(String road, String upazilla, String zilla) {
        this.road = road;
        this.upazilla = upazilla;
        this.zilla = zilla;
    }


    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getUpazilla() {
        return upazilla;
    }

    public void setUpazilla(String upazilla) {
        this.upazilla = upazilla;
    }

    public String getZilla() {
        return zilla;
    }

    public void setZilla(String zilla) {
        this.zilla = zilla;
    }

    @Override
    public String toString() {
//        return "Address:\nRoad:" + road + ", PostOffice:" + upazilla + ", District:" + zilla ;
        return STR."Address:\nRoad:\{road}, PostOffice:\{upazilla}, District:\{zilla}";
    }


//    @Override
//    public String toString() {
//        return "_Address{" +
//                "road='" + road + '\'' +
//                ", upazilla='" + upazilla + '\'' +
//                ", zilla='" + zilla + '\'' +
//                '}';
//    }
}
