import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *  This a CrazyCircle class that create a circle that changes
 *  the border color everytime the circle hits the edges
 *  
 *  @author Julian Ho
 *  @since 1.0
 */
public class CrazyCircle extends CircleShape {
    // Border color
    private Color bColor;

    /**
     *  Default Constructor
     */
    public CrazyCircle() {
        // Create circle in random loaction with size of 25
        super((int)(500*Math.random()) + 10 ,(int)(500*Math.random()) + 10, 25);
         // Hot pink for circle
        this.color = Color.ORANGE;
        // Random color for circle's border
        this.bColor = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
    }

    /**
     *  draw method overrided to give random border color
     */
    public void draw(Graphics g) {
        super.draw(g);
        // Set border color
        g.setColor(bColor);
        // Draw circle border
        g.drawOval((int)(x-radius), (int)(y-radius), (int)(2*radius), (int)(2*radius));
        // Draw the dollar sign
        g.setColor(Color.WHITE);
        g.setFont(new Font("Helvatica", Font.BOLD, 30));
        g.drawString("$", (int)(x - 10), (int)(y + radius/2));
    }

    /**
     *  keep on board method overrided to change border color
     *  everytime circle bounces off the edge
     */
    public void keepOnBoard(){
        if (this.x < this.radius || this.x > CircleShape.boardWidth-this.radius) {
            // it went off the left or right edge! do something!
            this.vx = -this.vx;
            // new random border color
            this.bColor = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
        }

        if (this.y < this.radius || this.y > CircleShape.boardHeight-this.radius){
            // it went above the top or bottom edge!
            this.vy = -this.vy;
            // new random border color
            this.bColor = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
        }
    }

    /**
     *  toString method
     *  
     *  @return CrazyCircle(x,y,radius)
     */
    public String toString() {
        return "CrazyCircle(" + this.x + "," + this.y + "," + this.radius + ")";
    }
}