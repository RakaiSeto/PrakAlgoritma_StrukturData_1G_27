package P2;

public class Dragon27 {
    int x, y, width, height;

    public Dragon27() {

    }

    void moveLeft() {
        if (x - 1 < 0) {
            detectCollision(x, y);
        } else {
            x -= 1;
        }
    }

    void moveRight() {
        if (x + 1 > width) {
            detectCollision(x, y);
        } else {
            x += 1;
        }
    }

    void moveUp() {
        if (y - 1 < 0) {
            detectCollision(x, y);
        } else {
            y -= 1;
        }
    }

    void moveDown() {
        if (y + 1 > height) {
            detectCollision(x, y);
        } else {
            y += 1;
        }
    }

    void movePosition() {
        System.out.println("Position : " + x + "," + y);
    }

    void detectCollision(int x, int y) {
        if (x - 1 < 0 || x + 1 > width || y - 1 < 0 || y + 1 > height) {
            System.out.println("Game Over");
        }
    }

}
