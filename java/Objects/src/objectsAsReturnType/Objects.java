package objectsAsReturnType;

import java.awt.Rectangle;
import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0, 0, 100, 200);
        Scanner input = new Scanner(System.in);
        System.out.println(box);
        int dx = input.nextInt();
        int dy = input.nextInt();
        moveRect(box, dx, dy);
        System.out.println(box);
    }

    private static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }
}
