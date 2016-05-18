package workshop3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RectangleSquare{

    private class Rectangle implements Comparable{
        int x;
        int h;
        int w;
        int endX;

        public int getSquare() {
            return square;
        }

        private void setSquare(int square) {
            this.square = square;
        }

        int square;

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

        public int getEndX() {
            return endX;
        }

        private void setEndX(int endX) {
            this.endX = endX;
        }

        public void setW(int w) {
            this.w = w;
        }

        public Rectangle(int x, int h, int w) {
            this.x = x;
            this.h = h;
            this.w = w;
            this.endX = x + w;
            this.square = w * h;
        }

        @Override
        public boolean equals(Object obj) {
            Rectangle tmp = (Rectangle) obj;

            return ((this.x == tmp.x) && (this.h == tmp.h) && (this.w == tmp.w));
        }

        @Override
        public String toString() {
            return "x[" + x + "]" + "h[" + h + "]" + "w[" + w + "]";
        }

        public int compareTo(Object o) {
            Rectangle tmp = (Rectangle) o;
            return this.x - ((Rectangle) o).getX();
        }
    }
    public int measure(int[] x, int[] h, int[] w) {

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Integer> points = new ArrayList<Integer>();

        for (int i = 0; i < x.length; i++) {
            points.add(x[i]);
            points.add(x[i] + w[i]);
            rectangles.add(new Rectangle(x[i], h[i], w[i]));
        }

        Set<Integer> pointsWithoutDuplicates = new HashSet<Integer>();
        pointsWithoutDuplicates.addAll(points);
        points.clear();
        points.addAll(pointsWithoutDuplicates);

        Collections.sort(points);

        ArrayList<Rectangle> columns = new ArrayList<Rectangle>();
        int heightIntervalBetweenPointers;
        for (int i = 0; i < points.size()-1; i++) {
            heightIntervalBetweenPointers = 0;
            int beginPoint = points.get(i);
            int endPoint = points.get(i+1);

            for (Rectangle r :
                    rectangles) {
                if ((r.getX() <= beginPoint) &&
                        (r.getEndX() >= endPoint) &&
                        (r.getH() > heightIntervalBetweenPointers)){
                    heightIntervalBetweenPointers = r.getH();
                }
            }

            if (heightIntervalBetweenPointers > 0){
                columns.add(new Rectangle(beginPoint, heightIntervalBetweenPointers, endPoint - beginPoint));
            }
        }

        int square = 0;
        for (Rectangle r :
                columns) {
            square += r.square;
        }
        return square;
    }

}
