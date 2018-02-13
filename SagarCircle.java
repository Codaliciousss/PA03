
import java.awt.Color;

public class SagarCircle extends CircleShape
{
    private int e = 0; // this will elongate the circle everytime it hits the border
    public SagarCircle()
    {
        super();
        color = Color.BLACK;
    }
    public void update(double dt)
    {
        // change the properties of the CircleShape after dt seconds have elapsed.
        this.x += dt*vx;  // for now they do not move
        this.y += dt*vy;
        System.out.println("e: " + e);
        System.out.println("Radius " + radius);
        this.keepOnBoard();
        if(e > boardWidth && e > boardHeight)
        {
            radius = 50;
        }
    }
    @Override
    public void keepOnBoard()
    {
        if (this.x < this.radius) 
        {
            // it went off the left edge! do something!
            this.vx = -this.vx;
            this.x = this.radius;
            e += 10;
            radius = e;           
            
        }
        else if (this.x > CircleShape.boardWidth-this.radius) 
        {
            // it went off the right edge! do something!
            this.vx = -this.vx;
            this.x = CircleShape.boardWidth-this.radius;
            e += 10;
            radius = e;
        }

        if (this.y < this.radius)
        {
            // it went above the top edge!
            this.vy = -this.vy;
            this.y = this.radius;
            e += 10;
            radius = e;
        } 
        else if (this.y > CircleShape.boardHeight-this.radius) 
        {
            // it went below the bottom edge!
            this.vy = -this.vy;
            this.y = CircleShape.boardHeight-this.radius;
            e += 10;
            radius = e;
        }
    }
}