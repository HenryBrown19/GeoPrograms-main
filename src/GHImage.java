public class GHImage extends World {

    public void go(){

     // Draw a soccer ball
        plane.pausetime = 0;
        for(int x=0;x<12;x++) {

            for (int j = 0; j < 30; j++) {
                plane.teleport(j * 50, -350+(j * 20)+x*100);
                //Green leaves
                plane.setTrailColor((x * 20), 150+j*3, 255);
                plane.fillCircle(50);
            }

        }
     plane.setTrailColor(200,0,0);

     plane.setTrailColor(225,0,0);

     // Draw black center
        plane.teleport(850,100);
     plane.setTrailColor(0, 0,0);
     plane.circle(40);

         // Mr Hills helped me
        // Draw small black details
        plane.setTrailColor(220,0,20);
        plane.fillCircle(10);
        plane.fillCircle(50);

       plane.move(200);
        plane.move(200);

        //Green leaves
        plane.teleport(871,306);
        plane.setTrailColor(0,150, 0);
        plane.fillCircle(50);


        // Brown tree trunk
        plane.setTrailColor(120,60,20);
        plane.turnLeft(0);
        plane.teleport(873,360);
        plane.turnLeft(270);
        plane.circle(20);
        plane.hasTrail = true;
        plane.move(79);
        //makes clouds



        plane.teleport(686,303);{
        plane.setTrailColor(0,150, 0);
        plane.fillCircle(50);
        plane.teleport(687,352);
        plane.setTrailColor(120,60,20);
        plane.move(80);

        plane.teleport(2,55);

        }




    } //end of go

} // end of file

