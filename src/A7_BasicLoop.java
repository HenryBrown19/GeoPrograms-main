public class A7_BasicLoop extends World {

    public void go() {
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.pausetime = 0;
        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 12; x = x + 1) {
                // make a row of squares using teleport
                // Random location
                // plane.teleport(20*x, 100)
                // system.out.println("x; " + x);
                int randomX = (int) (Math.random() * 800);
                int randomY = (int) (Math.random() * 600);
                // Random color
                plane.teleport(2 * x, 500);
                System.out.println("x: " + x);
                plane.square(500);
                plane.move(500);
                plane.teleport(2 * x, 100);
                System.out.println("x: " + x);
                plane.square(100);
                plane.move(100);
                plane.teleport(randomX, randomY);


                //todo: make the square a row
                plane.teleport(100 * x, 20 * y * 100);
                // todo: make the color of the squares a gradient

            }
            //todo make the color change by left and right and up and down
            plane.setTrailColor(10 + 20 * y, 88, 99);
            for (int i = 0; i < 4; i++) {
                plane.square(50);
            } // end of inner for
        }// end of outer for
    } // end of go

    //todo make a method called square
    public void square() {
      //todo:
             for(int y = 0; y < 4; y++){

         }
             plane.move(50);
             plane.turnLeft(90);


         }// end of loop
     }// end of square



