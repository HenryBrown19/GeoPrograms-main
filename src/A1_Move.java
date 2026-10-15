public class A1_Move extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.move(200);
        plane.hasTrail = false;
plane.turnLeft(180);
        plane.move(200);
        plane.hasTrail = true;
        plane.setAngle(-225);
        plane.move(200);

        plane.teleport(236, 285);
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.move(200);
        plane.hasTrail = false;
        plane.turnLeft(180);
        plane.move(200);
        plane.hasTrail = true;
        plane.setAngle(-225);
        plane.move(200);
        plane.teleport(681,306);
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.move(200);
        plane.hasTrail = false;
        plane.turnLeft(180);
        plane.move(200);
        plane.hasTrail = true;
        plane.setAngle(-225);
        plane.move(200);
        plane.hasTrail = false;

        plane.teleport(236,285);
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.move(200);
        plane.turnLeft(144);
        plane.move(200);
        plane.turnLeft(144);
        plane.move(200);
        plane.turnLeft(144);
        plane.move(200);
        plane.hasTrail= true;
        plane.turnLeft(144);
        plane.move(200);
        plane.hasTrail= false;



    }


}

