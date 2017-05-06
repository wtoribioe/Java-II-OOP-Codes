/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1609geometryinterset;

public class LabsChapter1609GeometryInterset {
    public static void main(String arg[]) {
        Point lt1 = new Point(3, 8);
        Point lb1 = new Point(3, 5);
        Point rt1 = new Point(6, 8);
        Point rb1 = new Point(6, 5);

        Point lt2 = new Point(5, 6);
        Point lb2 = new Point(5, 3);
        Point rt2 = new Point(9, 6);
        Point rb2 = new Point(9, 3);

        Point lt3 = new Point(3, 7);
        Point lb3 = new Point(3, 6);
        Point rt3 = new Point(5, 7);
        Point rb3 = new Point(5, 6);

        Point lt4 = new Point(1, 2);
        Point lb4 = new Point(1, 1);
        Point rt4 = new Point(2, 2);
        Point rb4 = new Point(2, 1);

        Rectangle r1 = new Rectangle(lt1, lb1, rt1, rb1);
        Rectangle r2 = new Rectangle(lt2, lb2, rt2, rb2);
        Rectangle r3 = new Rectangle(lt3, lb3, rt3, rb3);
        Rectangle r4 = new Rectangle(lt4, lb4, rt4, rb4);

        LabsChapter1609GeometryInterset obj = new LabsChapter1609GeometryInterset();
        obj.isOverLapping(r1, r2);
        obj.isOverLapping(r1, r3);
        obj.isOverLapping(r1, r4);

    }

    private void isOverLapping(Rectangle rect1, Rectangle rect2) {
        Point l1 = rect1.lt;
        Point l2 = rect2.lt;

        Point r1 = rect1.rb;
        Point r2 = rect2.rb;

        if (l1.y < l2.y || l2.y < r1.y) {
            System.out.println("Not Overlapping");
        } else if (l1.x > r2.x || l2.x > r1.x) {
            System.out.println("Not Overlapping");
        } else {
            if ((l1.y > r2.y && l2.y > r1.y) || (l2.y > r1.y && r2.y > r2.y)) {
                System.out.println("Overlapping");
            } else {
                System.out.println("Not Overlapping");
            }

        }

    }
}
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    Point lt, lb, rt, rb;

    Rectangle(Point lt, Point lb, Point rt, Point rb) {
        this.lt = lt;
        this.lb = lb;
        this.rt = rt;
        this.rb = rb;
    }
}
