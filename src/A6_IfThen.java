public class A6_IfThen extends World {

    public int randNum;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 2 ;
        plane.teleport(350, 400);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            plane.teleport(100,100);
            square();
        }
        if (randNum == 1) {
            plane.teleport(200,100);

            rectangle(200, 100);
        }
        if (randNum == 2) {
            plane.teleport(100,300);

            rectangle(60, 100);
        }// end of if
        //todo: write and if that asks the question if Random is 3
        if(randNum==3){
            plane.triangle( 100);
        }
    } // end of go

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }   //end of rectangle

    //todo: add method to the file. you can copy or paste an old one or make a new one
}// end of the file
