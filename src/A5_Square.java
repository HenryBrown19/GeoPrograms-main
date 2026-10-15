public class A5_Square extends World {

    public void go() {

        int x = (int)(Math.random() * 400);
        int y = (int)(Math.random() * 200);

        plane.teleport(x, y);



        square(100);
    }

    public void square(int size) {
        plane.hasTrail = true;

        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);

        plane.hasTrail = true;

        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);



    }
}