public class A3_Color extends World {

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
            plane.setTrailColor(170,100, 0);
            plane.hasTrail = false;
            plane.turnLeft(180);
            plane.move(200);
            plane.hasTrail = true;
        plane.setTrailColor(100,100, 0);
            plane.setAngle(-225);
            plane.move(200);
            plane.teleport(681, 306);
            plane.setAngle(45);
        plane.setTrailColor(170,0, 0);
            plane.hasTrail = true;
            plane.move(200);
            plane.hasTrail = false;
            plane.turnLeft(180);
            plane.move(200);
            plane.hasTrail = true;
            plane.setAngle(-225);
            plane.move(200);
            plane.hasTrail = false;
            plane.teleport(236, 285);
            plane.setAngle(45);
            plane.hasTrail = true;
            plane.move(200);
            plane.turnLeft(144);
            plane.move(200);
            plane.turnLeft(144);
            plane.move(200);
            plane.turnLeft(144);
            plane.move(200);
            plane.hasTrail = true;
            plane.turnLeft(144);
            plane.move(200);
            plane.hasTrail = false;


        }
    }






