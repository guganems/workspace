package objectsAsReturnType;

import java.awt.Rectangle;

public class Objects {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0, 0, 100, 200);
        System.out.println(box);
        moveRect(box, 50, 100);
        System.out.println(box);
    }

    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }
}
