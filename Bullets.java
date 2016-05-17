import java.awt.*;

/**
 * Created by Jerry Xie on 5/14/2016.
 */
public class Bullets {
    double x;
    double y;

    public Bullets(double x, double y,Game game){
        this.x=x;
        this.y=y;
    }

    public void tick(){

        y-=1;
    }

    public double getY(){
        return y;
    }

    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect((int)x,(int)y,10,50);
    }
}
