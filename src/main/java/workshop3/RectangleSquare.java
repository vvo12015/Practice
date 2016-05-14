package workshop3;

import java.util.ArrayList;
import java.util.Stack;

public class RectangleSquare {

    private class Rectangle{
        int x, h, w;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        public Rectangle(int x, int h, int w) {
            this.x = x;
            this.h = h;
            this.w = w;
        }
    }

    private static ArrayList<Rectangle> list = new ArrayList<Rectangle>();

    public int measure(int[] x, int[] h, int[] w) {

        list.add(new Rectangle(x[0], h[0], w[0]));

        Rectangle r, nextR;
        boolean trueAdd = false;

        for (int i = 1; i < x.length; i++) {

            nextR = new Rectangle(x[i], h[i], w[i]);
            for (Rectangle r :
                    list) {
                trueAdd
            }
        }

        return 0;
    }

    private ArrayList<Rectangle> analysis(Rectangle r, Rectangle r1){


        int start1 = r.getX();
        int start2 = r1.getX();

        int minStart = Math.min(start1, start2);

        int end1 = r.getX() + r1.getW();
        int end2 = r1.getX() + r1.getW();

        int maxEnd = Math.max(end1, end2);

        if (((start1 > start2) && (start1 < end2)) && ((end1 > start2) && (end1 < end2))){
            if (r.getH() >= r1.getH()){

            }
        }
    }


}
