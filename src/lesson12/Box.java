package lesson12;

import java.sql.SQLOutput;

public class Box {
    double width;
    double height;
    double depth;

//    double volume() {
//        return width * height * depth;
//    }
//    void setDim(double w,  double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }

    double volume() {
        return width * height * depth;
    }

    boolean isLargerThan(Box otherBox) {
        return this.volume() > otherBox.volume();
    }
}


