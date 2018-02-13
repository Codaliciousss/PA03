public class SpeedChange extends CircleShape{

  public SpeedChange(){
    super();
    this.color = new java.awt.Color(0,100,255,100);
  } // transparent blue

    public void update(double dt){
      // change the properties of the CircleShape after dt seconds have elapsed.

  		//this.velocity += dt*vr;

  /**    if  (this.radius <10) this.vr *= -1;
      else if (this.radius > 50) this.vr *= -1;
  		super.update(dt); */


      if (this.x < this.radius) {
				// it went off the left edge! do something!
         this.vx -= 5;

			}else if (this.x > CircleShape.boardWidth-this.radius) {
				// it went off the right edge! do something!
        this.vx -= 5;
			}

			if (this.y < this.radius){
				// it went above the top edge!
       this.vy -= 5;


			} else if (this.y > CircleShape.boardHeight-this.radius) {
				// it went below the bottom edge!
       this.vy -= 5;
			}
      	super.update(dt);
  }

}
