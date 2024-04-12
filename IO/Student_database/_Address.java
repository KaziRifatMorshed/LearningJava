package IO.Student_database;

import java.io.Serializable;

public class _Address implements Serializable {
    protected String road, upazilla, zilla;

    public _Address(String r, String u, String z) {
        road = r;
        upazilla = u;
        zilla = z;
    }

    public String getRoad() {
        return road;
    }

    public String getUpazilla() {
        return upazilla;
    }

    public String getZilla() {
        return zilla;
    }

    @Override
    public String toString() {
//        return "Address:\nRoad:" + road + ", PostOffice:" + upazilla + ", District:" + zilla ;
        return STR."Address:\nRoad:\{road}, PostOffice:\{upazilla}, District:\{zilla}";
    }
}
