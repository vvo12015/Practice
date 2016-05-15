package workshop3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class RectangleSquare {

    private class Rectangle implements Comparable{
        private int x;
        private int h;

        public int getEndX() {
            return endX;
        }

        public void setEndX(int endX) {
            this.endX = endX;
        }

        private int w;
        private int endX;

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
            this.endX = x + w;
        }

        public int compareTo(Object o) {
            Rectangle r = (Rectangle) o;

            return this.x - r.getX();
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "x=" + x +
                    ", h=" + h +
                    ", w=" + w +
                    ", endX=" + endX +
                    '}';
        }
    }



    public int measure(int[] x, int[] h, int[] w) {

        ArrayList<Rectangle> listRectangle = new ArrayList<Rectangle>();
        ArrayList<Rectangle> listSquares = new ArrayList<Rectangle>();

        for (int i = 0; i < x.length; i++) {
            listRectangle.add(new Rectangle(x[i], h[i], w[i]));
        }

        Collections.sort(listRectangle);

        listSquares.add(listRectangle.get(0));

        ArrayList<Rectangle> forAdd;

        Rectangle r, nextR;

        for (int i = 1; i < listRectangle.size(); i++) {

            nextR = listRectangle.get(i);
            for (int j = 0; j < listSquares.size(); j++) {

            }
        }

        return 0;
    }

    private boolean checkExistInByX(Rectangle r, Rectangle nextR){
        return (r.getEndX() > nextR.getX());
    }

    private boolean checkExistFull(Rectangle r, Rectangle nextR){
        return (r.getEndX() > nextR.getEndX());
    }

    private ArrayList<Rectangle> analysis(Rectangle r, Rectangle r1){

        ArrayList<Rectangle> result = new ArrayList<Rectangle>();


        return result;
    }


}
