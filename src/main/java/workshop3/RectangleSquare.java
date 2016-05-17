package workshop3;


import java.util.ArrayList;
import java.util.Stack;

public class RectangleSquare{

    private class Rectangle{
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
    }
    public int measure(int[] x, int[] h, int[] w) {

        Stack<Rectangle> newStack = new Stack<Rectangle>();
        Stack<Rectangle> jobStack = new Stack<Rectangle>();

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();


        for (int i = 0; i < x.length; i++) {
            rectangles.add(new Rectangle(x[i], h[i], w[i]));
        }

        Rectangle rectangle;
        Rectangle nextRectangle;
        boolean addedElement;
        jobStack.push(rectangles.get(0));

        for (int i = 1; i < rectangles.size(); i++) {

            nextRectangle = new Rectangle(x[i], h[i], w[i]);
            addedElement = false;
            jobStack.addAll(newStack);
            newStack.clear();

            while (!jobStack.empty()) {

                rectangle = jobStack.pop();

                if (rectangle.equals(nextRectangle)){
                    newStack.push(rectangle);
                }

                if (nextRectangle.getX() >= rectangle.getEndX() ||
                        nextRectangle.getEndX() <= rectangle.getX()) {
                    addedElement = true;
                }

                if ((nextRectangle.getX() > rectangle.getX()) &&
                        (nextRectangle.getEndX() < rectangle.getEndX())) {

                    if (nextRectangle.getH() > rectangle.getH()){
                        newStack.push(new Rectangle(rectangle.getX(), rectangle.getH(),
                                nextRectangle.getX()));

                        newStack.push(nextRectangle);

                        newStack.push(new Rectangle(nextRectangle.getEndX(), rectangle.getH(),
                                rectangle.getEndX() - nextRectangle.getEndX()));
                    }else {
                        newStack.push(rectangle);
                    }
                }else if (nextRectangle.getX() > rectangle.getX() && nextRectangle.getEndX() > rectangle.getEndX()
                        && nextRectangle.getX() < rectangle.getEndX()){
                    if (nextRectangle.getH() > rectangle.getH()) {
                        newStack.push(new Rectangle(rectangle.getX(), rectangle.getH(),
                                nextRectangle.getX() - rectangle.getX()));
                        newStack.push(nextRectangle);
                    }else {
                        newStack.push(new Rectangle(rectangle.getEndX(), nextRectangle.getH(),
                                nextRectangle.getEndX() - rectangle.getEndX()));

                        newStack.push(rectangle);
                    }
                }
                else if (nextRectangle.getX() < rectangle.getX() && nextRectangle.getEndX() < rectangle.getEndX()
                        && nextRectangle.getEndX() > rectangle.getX()){
                    newStack.push(new Rectangle(nextRectangle.getX(), nextRectangle.getH(),
                            rectangle.getX() - nextRectangle.getX()));
                    newStack.push(rectangle);
                }else if ((nextRectangle.getX() == rectangle.getX())){
                    if (rectangle.getH() > nextRectangle.getH()){
                        newStack.push(rectangle);
                        newStack.push(new Rectangle(rectangle.getEndX(), nextRectangle.getH(),
                                nextRectangle.getEndX() - rectangle.getEndX()));
                    }else {
                        newStack.push(nextRectangle);
                        newStack.push(new Rectangle(nextRectangle.getEndX(), rectangle.getH(),
                                rectangle.getEndX() - nextRectangle.getEndX()));
                    }
                }
                if (addedElement) {
                    newStack.push(nextRectangle);
                    newStack.push(rectangle);
                    addedElement = false;
                }

            }

        }

        rectangles.clear();
        rectangles.addAll(newStack);
        ArrayList<Rectangle> newRectangles = new ArrayList<Rectangle>();

        int square = 0;
        if (rectangles.size() == 1){

        }
        for (int i = 0; i < rectangles.size(); i++) {
            rectangle = rectangles.get(i);
            addedElement = true;
            for (int j = 0; j < newRectangles.size(); j++) {
                nextRectangle = newRectangles.get(j);
                if (hasTo(rectangle, nextRectangle)){
                    addedElement = false;
                }
            }

            if (addedElement || rectangles.size() == 1) {
                newRectangles.add(rectangle);
                square += rectangle.square;
                System.out.println(rectangle);
            }
        }

        return square;
    }

    private boolean hasTo(Rectangle r, Rectangle r1){
        if ((r.getX() >= r1.getX() && (r.getEndX() <= r1.getEndX()) && r.getH() >= r1.getH())){
            return true;
        }else   return false;
    }
}
