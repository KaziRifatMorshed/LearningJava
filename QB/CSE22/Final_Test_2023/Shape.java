package Final_Test_2023;

import java.util.Objects;

public abstract class Shape implements Cal_Area{

    @Override
    public boolean equals(Object obj) {
        Shape other = (Shape) obj;
        if (this.Area() != other.Area())
            return false;
        else
            return true;
    }
}
